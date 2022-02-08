package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class PerfectNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the num to check perfect num or not : ");
		int n = utility.getIntValue();
		utility.checkPerfectNum(n);
	}

}
