package com.day9.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	AddressBookManager addressBookManager = new AddressBookManager();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome to Address Book*****");
		
		AddressBookMain mainObj = new AddressBookMain();
		boolean flag = true;
		do {
			System.out.println("Enter the operation choice");
			
			System.out.println("1. Add new person in address Book");
			System.out.println("2. Update person in address Book");
			System.out.println("3. Remove person from address Book");
			System.out.println("4. get person detai from address Book");
			System.out.println("5. Print Address Book");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				mainObj.addressBookManager.addPersonDetails();
				break;
			case 2:
				mainObj.addressBookManager.updatePersonDetails();
				break;
			case 3:
				mainObj.addressBookManager.removePersonDetails();
				break;
			case 4:
				System.out.print("Enter Person name: ");
				String name = sc.next();
				Person details  = mainObj.addressBookManager.getperson(name);
				System.out.println("person details = "+details);
				break;
			case 5:
				mainObj.addressBookManager.printPerson();
				break;
			default:
				flag = false;
			}
		}while(flag);
	}
}