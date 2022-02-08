package com.bridgelabz.DSPrograms;

import java.util.Scanner;

import com.bridgelabz.DSUtility.Utility;

public class HashTable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		utility.put(10, "hii");
		utility.put(20, "hii everyone");
		utility.put(40, "hello");
		utility.put(50, "hii Rao");
		
		utility.printHashTable();
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println("frequency of"+str+ utility.getFrequency(str));
	}

}
