package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class SwapTheNumber {
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter first number num1 : ");
		int num1 = utility.getIntValue();
		System.out.print("Enter first number num2 : ");
		int num2 = utility.getIntValue();
		utility.SwapNumber(num1,num2);
		}

}
