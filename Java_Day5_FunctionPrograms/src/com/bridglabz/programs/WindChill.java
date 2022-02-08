package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter tempreture in t in Fahrenheit : ");
		double t = utility.getDoubleValue();
		System.out.print("Enter wind speed v in miles per hour : ");
		double v = utility.getDoubleValue();
		utility.getWindChill(t, v);
	}

}
