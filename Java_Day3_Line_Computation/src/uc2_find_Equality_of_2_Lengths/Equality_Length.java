package uc2_find_Equality_of_2_Lengths;

import uc1_Calculate_Length_of_line.Line_Length;

public class Equality_Length extends Line_Length {
	

	public static void main(String[] args) {
		
		double length1, length2 ;
		System.out.println("Enter the co-ordinates of 1st line ");
		length1 = Calculet_length();
		System.out.println("Enter the co-ordinates of 1st line ");
		length2 = Calculet_length();
		
		String len1 = length1+" ";
		String len2 = length2+" ";
		System.out.println("Two lines are equal "+len2.equals(len1));
		//System.out.println(len2+" "+len1);
		
	}

}
