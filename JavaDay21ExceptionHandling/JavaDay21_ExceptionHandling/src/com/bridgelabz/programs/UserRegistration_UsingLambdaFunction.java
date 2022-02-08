package com.bridgelabz.programs;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validator{
	boolean detailsValidator(String input);
	
	static void prinResult(String function, boolean result) {
		System.out.println(function+ result);
	}
}

public class UserRegistration_UsingLambdaFunction {

	public static void main(String args[]) {
		
		Validator validatefirstName = (firstName) ->  {return Pattern.matches(UserRegistration.NAME_VALIDATOR, firstName);};
		Validator validateLastName = (lastName) ->  {return Pattern.matches(UserRegistration.NAME_VALIDATOR, lastName);};
		Validator validatePassword = (password) ->  {return Pattern.matches(UserRegistration.PASSWORD_VALIDATOR, password);};
		Validator validateContactNumber = (number) ->  {return Pattern.matches(UserRegistration.CONTACTNUMBER_VALIDATOR, number);};
		Validator validateEmailID = (email) ->  {return Pattern.matches(UserRegistration.EMAIL_VALIDATOR, email);};
	
		Validator.prinResult("Entered firstName is right: ",validatefirstName.detailsValidator("Reugito"));
		Validator.prinResult("Entered LastName is right: ",validateLastName.detailsValidator("Kakarot"));
		Validator.prinResult("Entered password is right: ",validatePassword.detailsValidator("Raoa@11221"));
		Validator.prinResult("Entered contact number right: ",validateContactNumber.detailsValidator("91 8787878777"));
		Validator.prinResult("Entered email is right: ",validateEmailID.detailsValidator("Raoa@gmail.com"));
	}
}
