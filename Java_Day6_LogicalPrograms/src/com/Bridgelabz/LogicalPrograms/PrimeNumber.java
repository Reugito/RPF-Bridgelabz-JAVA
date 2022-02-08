package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check prime or not : ");
		int n = utility.getIntValue();
		utility.checkPrimeNum(n);
	}

}
