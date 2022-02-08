package com.bridgelabz.buisnesslogic.programs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	private static final String NAME_VALIDATOR = "^[a-zA-Z]{4,}$";
	private static final String CONTACTNUMBER_VALIDATOR = "^91\\s[0-9]{10}$";
	private static final String EMAIL_VALIDATOR ="^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$";
	private static final String PASSWORD_VALIDATOR = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
            										+ "(?=.*[@#$%^&+=])"
            										+ "(?=\\S+$).{8,20}$";
	Scanner sc = new Scanner(System.in);
	
	public static boolean firstNameValidator() {
		UserValidation userVal = new UserValidation();
		
		System.out.print("Enter the first name: " );
		String firstName = userVal.sc.next();
		return Pattern.matches(UserValidation.NAME_VALIDATOR, firstName);
	}
	
	public static boolean lastNameValidator() {
		UserValidation userVal = new UserValidation();
		
		System.out.print("Enter the last name: " );
		String lastName = userVal.sc.next();
		return Pattern.matches(UserValidation.NAME_VALIDATOR, lastName);
	}
	
	public static boolean contactNumber(){
		UserValidation userVal = new UserValidation();
		
        System.out.print("Enter contact number with country code (91): " );
        String contactNumber = userVal.sc.nextLine();
        return Pattern.matches(CONTACTNUMBER_VALIDATOR, contactNumber);
        
    }
	
	public static boolean paswwordValidator(){
		UserValidation userVal = new UserValidation();
		
        System.out.print("Enter password: " );
        String password = userVal.sc.nextLine();
        return Pattern.matches(PASSWORD_VALIDATOR, password);
        
    }
	
	public static boolean emailValidator(){
		UserValidation userVal = new UserValidation();
		
        System.out.print("Enter email: " );
        String email = userVal.sc.nextLine();
        return Pattern.matches(EMAIL_VALIDATOR, email);
        
    }

	public static boolean parameterizedEmailValidator(String email) {
		return Pattern.matches(EMAIL_VALIDATOR, email);
	}
}
