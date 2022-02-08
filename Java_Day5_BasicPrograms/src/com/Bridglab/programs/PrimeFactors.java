package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check primefactors : ");
		int Number = utility.getIntValue();
		utility.getPrimeFactor(Number);
	}

}
