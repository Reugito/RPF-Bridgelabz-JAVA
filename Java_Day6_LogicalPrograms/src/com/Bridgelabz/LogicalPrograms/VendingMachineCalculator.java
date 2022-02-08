package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class VendingMachineCalculator {

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.print("Enter the amount : ");
		int amount = utility.getIntValue()
;		int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1 };
		utility.getRupeeNotesCount(amount, notes);
		
	
		
	}

}
