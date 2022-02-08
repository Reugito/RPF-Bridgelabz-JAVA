package com.bridgelabz.DSPrograms;

import java.util.Scanner;

import com.bridgelabz.DSUtility.Utility;

public class SimpleBalancedParentheses {
	

	public static void main(String args []) {
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input is like ---->(5+6)(7+8)/(4+3)(5+6)(7+8)/(4+3) ");
		System.out.print("Enter arithmatic Operation with brackets: ");
		String arithmaticOperation = sc.next();
		System.out.println(utility.checkBalancedParenthesis(arithmaticOperation));
	}
}
