package com.bridglabz.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridglabz.Utility.AddressBookManager;

public class AddressBookMain {
	public static void main(String args []) throws ParseException, FileNotFoundException, IOException {
	AddressBookManager book = new AddressBookManager();
	boolean flag = true;
	Scanner sc = new Scanner(System.in);
	System.out.println("******Welcome to Address Book*****");
	do {
		System.out.println("Enter the operation choice");
		
		System.out.println("1. Add new person in address Book");
		System.out.println("2. Update person in address Book");
		System.out.println("3. get person details from address book");
		System.out.println("4. Remove person from address Book");
		System.out.println("5. Print Address Book");
		System.out.println("Enter any key to leave");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			book.addPerson();
			break;
		case 2:
			book.updateAddressBook();
			break;
		case 3:
			System.out.print("Enter name of person to get details: ");
			String name = sc.next();
			System.out.println("Person======> "+book.getPerson(name));
			break;
		case 4: 
			book.removePerson();;
			break;
		case 5:
			book.printAddressBook();
			break;
		default:
			flag = false;
		}
	}while(flag);
	
	}
}