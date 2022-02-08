package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class VowelOrConsonent {
	
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter the alphabate : ");
		char alphabate = utility.getCharValue();		
		utility.checkAlphabate(alphabate);
	}
}
