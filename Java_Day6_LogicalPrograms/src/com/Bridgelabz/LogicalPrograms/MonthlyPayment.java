package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the no of years : ");
		int years = utility.getIntValue();
		System.out.print("Enter the principle amount : ");
		int P = utility.getIntValue();
		System.out.print("Enter the percent amount : ");
		int R = utility.getIntValue();
		Utility.getMonthlyPayment(years, P, R);
	}

}
