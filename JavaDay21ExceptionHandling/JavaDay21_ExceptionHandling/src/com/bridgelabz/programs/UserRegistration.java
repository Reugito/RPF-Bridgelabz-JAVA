package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static final String NAME_VALIDATOR = "^[a-zA-Z]{4,}$";
	static final String CONTACTNUMBER_VALIDATOR = "^91\\s[0-9]{10}$";
	static final String EMAIL_VALIDATOR ="^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$";
	static final String PASSWORD_VALIDATOR = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
            										+ "(?=.*[@#$%^&+=])"
            										+ "(?=\\S+$).{8,20}$";
	Scanner sc = new Scanner(System.in);
	
	public static boolean firstNameValidator(String firstName) throws CustomException {
		try {
			return Pattern.matches(UserRegistration.NAME_VALIDATOR, firstName);
		}catch(NullPointerException e) {throw new CustomException("Invalid First Name");}
		
	}
	
	public static boolean lastNameValidator(String lastName) throws CustomException {
		try {
			return Pattern.matches(UserRegistration.NAME_VALIDATOR, lastName);
		}catch(Exception e) {throw new CustomException("Invalid Last Name");}
		
	}
	
	public static boolean contactNumber(String contactNumber) throws CustomException{
		try {
			return Pattern.matches(CONTACTNUMBER_VALIDATOR, contactNumber);
		}catch(Exception e){throw new CustomException("Invalid contactNumber");}
    }
	
	public static boolean paswwordValidator(String password) throws CustomException{
		try {
			return Pattern.matches(PASSWORD_VALIDATOR, password);
		}catch(Exception e){throw new CustomException("Invalid password");}
        
        
    }
	
	public static boolean emailValidator(String email) throws CustomException{
		try {
			return Pattern.matches(EMAIL_VALIDATOR, email);
		}catch(Exception e){throw new CustomException("Invalid emailId");}
        
    }
}
