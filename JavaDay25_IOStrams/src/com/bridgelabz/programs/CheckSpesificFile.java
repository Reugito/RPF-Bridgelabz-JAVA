package com.bridgelabz.programs;

import java.io.File;
import java.util.Scanner;

public class CheckSpesificFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File folder = new File("D:");
		boolean flag = false;
		System.out.print("Enter the file name: ");
		String name = sc.next();
		
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			
		  if (listOfFiles[i].getName().equals(name)) 
			  flag = true;
		}
		if(flag)
			 System.out.println(name +" is present ");
		else  
			System.out.println(name+" is not present");

	}

}
