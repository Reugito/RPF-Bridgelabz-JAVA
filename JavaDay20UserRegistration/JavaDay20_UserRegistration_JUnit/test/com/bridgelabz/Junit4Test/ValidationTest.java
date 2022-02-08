package com.bridgelabz.Junit4Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bridgelabz.buisnesslogic.programs.UserValidation;

class ValidationTest {

	@Test
	void firstNameTestValidator() {
		assertEquals(true,  UserValidation.firstNameValidator());
	}
	
	@Test
	void lastNameTestValidator() {
		assertEquals(true,  UserValidation.lastNameValidator());
	}
	
	@Test
	void contactNUmberTestValidator() {
		assertEquals(true,  UserValidation.contactNumber());
	}
	
	@Test
	void EmailTestValidator() {
		assertEquals(true,  UserValidation.emailValidator());
	}
	
	@Test
	void passwordTestValidator() {
		assertEquals(true,  UserValidation.paswwordValidator());
	}

	@ParameterizedTest
	void emailValidation() {
		String [] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
	        		"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com"};
	    for(String i: email)
	    	assertTrue(UserValidation.parameterizedEmailValidator(i));
	}
}
