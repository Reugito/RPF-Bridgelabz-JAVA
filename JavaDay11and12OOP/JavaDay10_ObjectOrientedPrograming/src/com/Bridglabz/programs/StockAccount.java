package com.Bridglabz.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccount {
	static String fileName;
	static double valueOf;
	static Scanner sc = new Scanner(System.in);
	
	public StockAccount(String fileName, double valueOf) throws FileNotFoundException, IOException, ParseException {
		this.fileName = fileName;
		this.valueOf = valueOf;
		JSONObject company = getCompany(fileName);
		if(company != null) 
			System.out.println("Company already exist");
		else {
			createStockAccont();
		}
	}
	
	public static void buy(int amount, String symbol) throws FileNotFoundException, IOException, ParseException {
		 JSONObject stocks = getCompany(symbol);
		 JSONObject temp = getCompany(symbol);
		 double share =  (double) stocks.get("valueOf");
		 share += (long) amount;
		 stocks.put("valueOf", share);
		 stockAccountsArr.add(stocks);
		 stockAccountsArr.remove(temp);
		 Date date=Calendar.getInstance().getTime();
		 System.out.println(date);
	}
	
	public  static void sell(int amount, String symbol) throws FileNotFoundException, IOException, ParseException {
		 JSONObject stocks = getCompany(symbol);
		 JSONObject temp = getCompany(symbol);
		 double share =  (double) stocks.get("valueOf");
		 share -= (long) amount;
		 stocks.put("valueOf", share);
		 stockAccountsArr.add(stocks);
		 stockAccountsArr.remove(temp);
		Date date=Calendar.getInstance().getTime();
		System.out.println(date);
	}
	
	public static void save() {
		try (FileWriter file = new FileWriter("D:StockAccounts.json")) {
			file.write(stockAccountsArr.toJSONString());
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("----file is saved----");
	}
	
	public static void printReport() throws ParseException {
		JSONParser jsonParser = new JSONParser();
		
		 try (FileReader reader = new FileReader("D:StockAccounts.json"))
		    {
		        Object obj = jsonParser.parse(reader);
		        JSONArray stockAccounts = (JSONArray) obj;
		        System.out.println(stockAccounts);
		    } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	static JSONArray stockAccountsArr = new JSONArray();
	public void createStockAccont() {
		JSONObject addShares = new JSONObject();
		System.out.println("Enter the Symbol for company: ");
		String symbol = sc.next();
		addShares.put("fileName", fileName);
		addShares.put("valueOf", valueOf);
		addShares.put("symbol", symbol);
		stockAccountsArr.add(addShares);
		addShares = null;
	}
	
	public static JSONObject getCompany(String symbol) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		 try (FileReader reader = new FileReader("D:StockAccounts.json")){
		        Object obj = jsonParser.parse(reader);
		        JSONArray addressbookArr = (JSONArray) obj;
		        Iterator iterator = addressbookArr.iterator();
		       while(iterator.hasNext()) {
		    	   JSONObject jsonObj = (JSONObject) iterator.next();
		    	   if(fileName.contains((CharSequence) jsonObj.get("fileName"))) 
		    		   return jsonObj;
		       }
		       return null;
		 }
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		boolean flag = true;
		do {
			System.out.println("1. Create accout new");
			System.out.println("2. To save Created accout ");
			System.out.println("3. To buy share");
			System.out.println("4. To sell shares");
			System.out.println("5. To see Report");
			System.out.println("Enter the choise: ");
			int choise = sc.nextInt();
			switch(choise) {
				case 1:
					System.out.println("Enter file name: ");
					fileName = sc.next();
					System.out.println("Enter Value of stocks: ");
					valueOf = sc.nextDouble();
					StockAccount CompanyShares = new StockAccount(fileName, valueOf);
					break;
				case 2:
					StockAccount.save();
					break;
				case 3:
					System.out.print("Enter the amount: ");
					int amount = sc.nextInt();
					System.out.print("Enter comoany symbol: ");
					String symbol = sc.next();
					StockAccount.buy(amount, symbol);
					break;
				case 4:
					System.out.print("Enter the amount: ");
					amount = sc.nextInt();
					System.out.print("Enter comoany symbol: ");
					symbol = sc.next();
					StockAccount.sell(amount, symbol);
					break;
				case 5:
					StockAccount.printReport();
			}
		}while(flag);
	}
}
