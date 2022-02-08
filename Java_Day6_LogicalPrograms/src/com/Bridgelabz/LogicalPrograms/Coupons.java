package com.Bridgelabz.LogicalPrograms;

import com.Bridgelabz.Utility.Utility;

public class Coupons {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter number of coupons to generat n: " );
		int numberOfCoupns = utility.getIntValue();
		System.out.print("Enter Size of coupons: " );
		int sizeOfCoupon = utility.getIntValue();
		Utility.getCoupons(numberOfCoupns,sizeOfCoupon);

	}

}
