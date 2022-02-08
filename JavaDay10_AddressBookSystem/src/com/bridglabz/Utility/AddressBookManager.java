package com.bridglabz.Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBookManager {
	Scanner sc = new Scanner(System.in);
	
	JSONArray jsonArr = new JSONArray();
	@SuppressWarnings({ "unchecked", "unused" })
	public void addPerson() {
		JSONObject studentDetails = new JSONObject();
		
		System.out.print("Enter firstName: ");
		String firstName = sc.next();
		System.out.print("Enter lastName: ");
		String lastName = sc.next();
		System.out.print("Enter address: ");
		String address = sc.next();
		System.out.print("Enter city: ");
		String city = sc.next();
		System.out.print("Enter state: ");
		String state = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter zip: ");
		String  zip = sc.next();
		System.out.print("Enter phoneNumber: ");
		String  phoneNumber = sc.next();
		
		studentDetails.put("firstName", firstName);
		studentDetails.put("lastName", lastName);
		studentDetails.put("address", address);
		studentDetails.put("city", city);
		studentDetails.put("state", state);
		studentDetails.put("email", email);
		studentDetails.put("zip", zip);
		studentDetails.put("phoneNumber", phoneNumber);
		jsonArr.add(studentDetails);
		
		try (FileWriter file = new FileWriter("D:AddressBook.json")) {
			file.write(jsonArr.toJSONString());
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("----------------Data added to Json File SuccessFully --------------------------");
		studentDetails = null;
	}
	
	public void updateAddressBook() throws ParseException, FileNotFoundException, IOException{
	    System.out.print("Enter the firstName of person to update:");
	    String fname = sc.next();
	    JSONObject jsonObj = getPerson(fname);
		
		System.out.println("1. update firstname");
		System.out.println("2. update Lastname");
		System.out.println("3. update address");
		System.out.println("4. update city");
		System.out.println("5. update state");
		System.out.println("6. update email");
		System.out.println("7. update zip");
		System.out.println("8. update phone number");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.print("Enter new first name: ");
				String firstname = sc.next();
				jsonObj.put("firstName", firstname);
				break;
			case 2:
				System.out.print("Enter new last name: ");
				String lname = sc.next();
				jsonObj.put("lastName", lname);
				break;
			case 3:
				System.out.print("Enter new address: ");
				String address = sc.next();
				jsonObj.put("address", address);
				break;
			 case 4:
				 System.out.print("Enter new city: ");
				 String city = sc.next();
				 jsonObj.put("city", city);
	             break;
			 case 5:
				 System.out.print("Enter new State: ");
				 String state = sc.next();
				 jsonObj.put("state", state);
				 break;
			 case 6:
				 System.out.print("Enter new Email: ");
				 String email = sc.next();
				 jsonObj.put("email", email);
				 break;
			 case 7:
				 System.out.print("Enter new ZipCode: ");
				 int zip = sc.nextInt();
				 jsonObj.put("zip", zip);
				 break;
			 case 8:
				 System.out.print("Enter new phone number: ");
				 int phoneNumber = sc.nextInt();
				 jsonObj.put("phoneNumber", phoneNumber);
				 break;
		}
		jsonArr.add(jsonObj);
		System.out.println("Updated details = "+jsonObj);
	}
	
	public void printAddressBook() throws ParseException {
		JSONParser jsonParser = new JSONParser();
		
		 try (FileReader reader = new FileReader("D:AddressBook.json"))
		    {
		        Object obj = jsonParser.parse(reader);
		        JSONArray studentArray = (JSONArray) obj;
		        System.out.println(studentArray);
		    } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public JSONObject getPerson(String fname) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		 try (FileReader reader = new FileReader("D:AddressBook.json")){
		        Object obj = jsonParser.parse(reader);
		        JSONArray addressbookArr = (JSONArray) obj;
		        Iterator iterator = addressbookArr.iterator();
		       while(iterator.hasNext()) {
		    	   JSONObject jsonObj = (JSONObject) iterator.next();
		    	   if(fname.contains((CharSequence) jsonObj.get("firstName"))) 
		    		   return jsonObj;
		       }
		       return null;
		 }
	}
	
	public void removePerson() throws FileNotFoundException, IOException, ParseException {
		System.out.print("Enter the firstName of person to Remove:");
	    String fname = sc.next();
	    JSONObject jsonObj = getPerson(fname);
	    jsonArr.remove(jsonObj);
		System.out.println("Removed person details = "+jsonObj);
		try (FileWriter file = new FileWriter("D:AddressBook.json")) {
			file.write(jsonArr.toJSONString());
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
