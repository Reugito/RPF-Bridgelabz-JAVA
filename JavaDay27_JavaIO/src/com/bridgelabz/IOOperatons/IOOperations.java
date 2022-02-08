package com.bridgelabz.IOOperatons;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations {
	
	public static void main(String[] args) throws IOException {
		IOOperations operations = new IOOperations();
		operations.CheckSpesificFile();
		operations.createEmptyFile();
		operations.createDirectory();
		operations.deleteFile();
		operations.listAllFilesDirectories();
	}
	
	//--------------method to check existing files-------------
	public void CheckSpesificFile() {
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
	
	//--------------method to check create empty file-------------
	public void createEmptyFile() throws IOException {
		File folder = new File("D:hello11.txt");
		folder.getParentFile();
		folder.createNewFile();
		System.out.println("-------- New file created----------");
	}
	
	//--------------method to check create empty directory-------------
	public void createDirectory() throws IOException {
		File folder = new File("D:Rao1");
		folder.getParentFile();
		folder.mkdir();
		System.out.println("--------New directory created----------");
	}
	
	//--------------method to delete file-------------
		public void deleteFile() throws IOException {
			File folder = new File("D:hello11.txt");
			folder.getParentFile();
			folder.delete();
			System.out.println("-------- file deleted ----------");
		}
		
		//--------------method to list all files and directories-------------
		public void listAllFilesDirectories() {
			File folder = new File("D:");
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) 
					System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
}
