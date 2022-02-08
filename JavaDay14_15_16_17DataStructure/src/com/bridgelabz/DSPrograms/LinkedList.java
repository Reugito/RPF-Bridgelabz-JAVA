package com.bridgelabz.DSPrograms;

import java.io.*;
import java.util.Scanner;

import com.bridgelabz.DSUtility.Utility;

public class LinkedList {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		boolean flag = true;
		do {
		System.out.println("1. To append in linked list");
		System.out.println("2. To print Linked list");
		System.out.println("3. To pop from linked list");
		System.out.println("4. Insert after specific element");
		System.out.println("5. Pop last element from linked list");
		System.out.println("6. To search from linked list");
		System.out.println("7. To exit");
		System.out.print("Enter the choice: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.print("\nEnter the data: ");
				int data = sc.nextInt();
				utility.appendList(data);
				break;
			case 2:
				utility.printLinkedList();
				break;
			case 3:
				System.out.println("poped ele--> "+ utility.popLinkedList());
				break;
			case 4:
				System.out.print("\nEnter the data: ");
				data = sc.nextInt();
				System.out.print("\nEnter the element after which you want to add: ");
				int position = sc.nextInt();
				utility.insertBetweenLinkedList(position, data);
				break;
			case 5:
				System.out.println("pop last ele--> "+ utility.popLast());
				break;
			case 6:
				System.out.print("\nEnter the data: ");
				data = sc.nextInt();
				System.out.println(utility.searchLinkedList(data));
				break;
			default:
				flag = false;
		}
		}while(flag);
		
	}
}
