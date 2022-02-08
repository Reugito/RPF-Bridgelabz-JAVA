package com.day9.AddressBook;

import java.util.*;

public class AddressBookManager {
	List<Person> addressBookList = new ArrayList();
	
	void addPerson(Person address) {
		addressBookList.add(address);
	}
	
	void printPerson() {
		for(Person Items: addressBookList) {
			System.out.println(Items);
		}
	}
	
	void addPersonDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter firsasdatName: ");
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
		int zip = sc.nextInt();
		System.out.print("Enter phoneNumber: ");
		int phoneNumber = sc.nextInt();

		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setEmail(email);
		person.setZip(zip);
		person.setPhoneNumber(phoneNumber);
		addPerson(person);
	}
	
	void removePersonDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = sc.next();
		Person person = getperson(name);
		addressBookList.remove(person);
		System.out.print("Deleted contact = "+person);
	}
	
	Person getperson(String name) {
		Iterator iterator = addressBookList.iterator();
		for(Person elements : addressBookList ) {
			if (iterator.hasNext()) {
				Person item = (Person) iterator.next();
				if(item.getFirstName().equalsIgnoreCase(name)) {
					return item;
				}
			}		
		}
		return null;	
	}
	
	void updatePersonDetails() {
		
		System.out.print("Enter person entity: ");
		Scanner sc = new Scanner(System.in);
		String item = sc.next();
		Person bookitem = getperson(item);
		System.out.println(bookitem);
		
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
				System.out.println("Enter new first name: ");
				String fname = sc.next();
				bookitem.setFirstName(fname);
				break;
			case 2:
				System.out.println("Enter new last name: ");
				String lname = sc.next();
				bookitem.setLastName(lname);
				break;
			case 3:
				System.out.println("Enter new address: ");
				String address = sc.next();
				bookitem.setAddress(address);
				break;
			 case 4:
				 System.out.println("Enter new city: ");
				 String city = sc.next();
				 bookitem.setCity(city);
	             break;
			 case 5:
				 System.out.println("Enter new State: ");
				 String state = sc.next();
				 bookitem.setState(state);
				 break;
			 case 6:
				 System.out.println("Enter new Email: ");
				 String email = sc.next();
				 bookitem.setEmail(email);
				 break;
			 case 7:
				 System.out.println("Enter new ZipCode: ");
				 int zip = sc.nextInt();
				 bookitem.setZip(zip);
				 break;
			 case 8:
				 System.out.println("Enter new phone number: ");
				 int phonnum = sc.nextInt();
				 bookitem.setPhoneNumber(phonnum);
				 break;
		}
		System.out.println("Updated details = "+bookitem);
	}
}
