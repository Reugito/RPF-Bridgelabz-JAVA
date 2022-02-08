package com.bridglabz.programs;

import com.bridglabz.utility.Utility;

public class SumOf3IntAdds2Zero {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the length of array n : ");
		int n = utility.getIntValue();
		int[] array = utility.getArray(n);
		utility.getSumAddZero(array, n);
	}

}
