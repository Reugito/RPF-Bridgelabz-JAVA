package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter point x : ");
		int x = utility.getIntValue();
		System.out.print("Enter point y : ");
		int y = utility.getIntValue();
		utility.getEuclidianDist(x, y);
	}

}
