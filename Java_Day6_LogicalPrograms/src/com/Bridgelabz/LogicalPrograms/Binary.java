package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number: ");
		int number = utility.getIntValue();
		int newNumber = Utility.swapNibbles(number);
		System.out.println("After swapping nibbles new numbers = "+newNumber);
		Utility.isPowerOfTwo(newNumber);
		

	}

}