package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Devident: ");
		int Devident = utility.getIntValue();
		System.out.print("Enter the Devisor : ");
		int Devisor = utility.getIntValue();
		utility.getQuotientRemainder(Devisor, Devident);
		
	}

}
