package com.Bridglab.programs;

import com.bridgebaz.utility.Utility;

public class LeapYear {
	
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.print("Enter the year to check is it is leap or not : ");
		int ValueOfYear = utility.getIntValue();
		utility.checkLeapYear(ValueOfYear);
	}

}
