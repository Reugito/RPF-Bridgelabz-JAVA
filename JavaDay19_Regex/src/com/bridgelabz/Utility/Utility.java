package com.bridgelabz.Utility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	   Scanner sc;
	   
	   public Utility() {
		   sc = new Scanner(System.in);
	   }
	   
	   //---------------------Method to enter first name-------------
	    public void firstName(){
	        System.out.print("Enter First Name: " );
	        String FirstName = sc.next();
	        boolean result = Pattern.matches("[A-Z][a-z]{2,}",FirstName);
	        if (result)
	        	System.out.println("Success");
	        else 
	            System.out.println("please enter valid first name ");
	    }
	   
	  //---------------------Method to enter last name-------------
	    public void lastName(){
	        System.out.print("Enter Last Name: " );
	        String LastName = sc.next();
	        Boolean result = Pattern.matches("[A-Z][a-z]{2,}",LastName);
	        if (result)
	        	System.out.println("Success");
	        else 
	            System.out.println("please enter valid last name ");
	    }
	    
	  //---------------------Method to enter contact number-------------
	    public void contactNumber(){
	        System.out.print("Enter contact number with country code (91): " );
	        String ContactNumber = sc.nextLine();
	        boolean result = Pattern.matches("91\\s[0-9]{10}",ContactNumber);
	        if (result)
	        	System.out.println("Success");
	        else 
	            System.out.println("enter valid contact number");
	    }
	
	  //---------------------Method to enter password-------------
	    public void password(){
	        System.out.print("Enter password: " );
	        String password = sc.next();
	        
	        String rule = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$";
	  
	        Pattern pattern = Pattern.compile(rule);
	        Matcher m = pattern.matcher(password);
	        boolean result = m.matches();
	        if (result)
	            System.out.println("Success");
	        else
	            System.out.println("enter valid password");
	    }
	    
	  //---------------------Method to enter email id-------------
	    public void email(){
	            System.out.print("Enter email ID: " );
	            String Email = sc.next();
	            Boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$",Email);
	        if (result)
	            System.out.println("Success");
	        else 
	            System.out.println("enter valid emailid");
	    }
}

