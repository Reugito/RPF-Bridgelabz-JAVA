package com.bridgelabz.DSPrograms;

import java.util.Scanner;

import com.bridgelabz.DSUtility.Utility;

public class Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		
		boolean flag = true;
		do {
		System.out.println("\n1. To add in queue");
		System.out.println("2. To print queue");
		System.out.println("3. To dequeue from queue");
		System.out.println("4. To check if queue is empty");
		System.out.println("5. To check length of queue");
		System.out.println("6. To search from queue");
		System.out.println("7. To exit");
		System.out.print("Enter the choice: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.print("\nEnter the data: ");
				int data = sc.nextInt();
				utility.enQueue(data);
				break;
			case 2:
				utility.printQueue();
				break;
			case 3:
				System.out.println("poped ele--> "+ utility.deQueue());
				break;
			case 4:
				System.out.println("\nis Queue empty: "+ utility.isQEmpty());
				break;
			case 5:
				System.out.println("length of queue "+ utility.getQLen());
				break;
			case 6:
				System.out.print("\nEnter the data: ");
				data = sc.nextInt();
				System.out.println("is "+data+" present in queue: "+utility.searchQueue(data));
				break;
			default:
				flag = false;
		}
		}while(flag);

	}

}
