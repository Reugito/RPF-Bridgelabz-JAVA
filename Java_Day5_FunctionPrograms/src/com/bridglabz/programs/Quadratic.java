package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter value of a : ");
		int a = utility.getIntValue();
		System.out.print("Enter value of b : ");
		int b = utility.getIntValue();
		System.out.print("Enter value of c : ");
		int c = utility.getIntValue();
		utility.getRoots(a, b, c);

	}

}
