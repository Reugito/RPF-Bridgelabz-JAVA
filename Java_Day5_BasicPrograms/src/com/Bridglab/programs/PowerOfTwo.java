package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class PowerOfTwo {

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.print("Enter the Number to check power of two : ");
		int Number = utility.getIntValue();
		utility.getPower(Number);
	}

}
