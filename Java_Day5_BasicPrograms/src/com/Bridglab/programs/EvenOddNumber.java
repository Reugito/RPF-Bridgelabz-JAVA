package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class EvenOddNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check even & odd : ");
		int Number = utility.getIntValue();
		utility.getEvenOdd(Number);
	}

}
