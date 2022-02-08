package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter the numer of coin toss : ");
		int noOfFlips = utility.getIntValue();
		Utility.FlipCoinPercent(noOfFlips);
		
	}
}