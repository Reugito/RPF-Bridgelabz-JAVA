package com.Bridglabz.Utility;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {
	Scanner sc = new Scanner(System.in);
	
	// Inventory data management 
	public void InventryDataManagment() {
		JSONParser parser = new JSONParser();
        try {
        	Object object = parser.parse(new FileReader("D:Item.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray itemList = (JSONArray) jsonObject.get("listOfItem");
            System.out.println(itemList);
            Iterator iterator = itemList.iterator();
           long amount , totalamount = 0;
            while (iterator.hasNext()){
                JSONObject jsonobj1 = (JSONObject) iterator.next();
                System.out.println("=======>"+jsonobj1);
              
                long w1 =(long) jsonobj1.get("wieght");
                long p1 =(long) jsonobj1.get("price");

                amount = w1*p1;
                System.out.println("amount of " + jsonobj1.get("name") +" = " + amount);
                totalamount = amount+totalamount;
            }
            System.out.println("total amount = "+totalamount);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	// Stock account management
	// method to add stocks
	JSONArray stockArr = new JSONArray();
	public void addStocks() {
		JSONObject stockJsonObj = new JSONObject();
		
		System.out.print("Enter Stock name: ");
		String stockName = sc.next();
		System.out.print("Enter number os share: ");
		int numShare = sc.nextInt();
		System.out.print("Enter share price: ");
		int sharePrice = sc.nextInt();
		stockJsonObj.put("stockName", stockName);
		stockJsonObj.put("sharePrice", sharePrice);
		stockJsonObj.put("numShare", numShare);
		stockArr.add(stockJsonObj);
		System.out.println(stockArr);
		try (FileWriter file = new FileWriter("D:StockItems.json")) {
			file.write(stockArr.toJSONString());
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("----Data added to Json File SuccessFully----");
		stockJsonObj = null;
	}
	
	public void getShareReport() {
		JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("D:StockItems.json")) {
        	Object obj = jsonParser.parse(reader);
        	Iterator iterator = ((ArrayList) obj).iterator();
            long shareAmount , totalamount = 0;
            System.out.println("Share Report of all compnies: ");
             while (iterator.hasNext()){
                 JSONObject jsonobj1 = (JSONObject) iterator.next();
                 long sharePrice =(long) jsonobj1.get("sharePrice");
                 long numShare =(long) jsonobj1.get("numShare");
                 shareAmount = sharePrice * numShare;
                 System.out.println("Total share cost of " + jsonobj1.get("stockName") +" = " + shareAmount);
                 totalamount = shareAmount+totalamount;
             }
             System.out.println("Total shares of all compnies: "+totalamount);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	//Commercial data processing
	
	
}
