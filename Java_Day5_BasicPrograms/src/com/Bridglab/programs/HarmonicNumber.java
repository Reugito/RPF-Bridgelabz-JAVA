package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check Harmonic number : ");
		int Number = utility.getIntValue();
		utility.getHarmonicNumber(Number);;
	}

}
