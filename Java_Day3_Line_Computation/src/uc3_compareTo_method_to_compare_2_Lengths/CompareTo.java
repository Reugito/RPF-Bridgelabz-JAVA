package uc3_compareTo_method_to_compare_2_Lengths;

import uc1_Calculate_Length_of_line.Line_Length;

public class CompareTo extends Line_Length {
	

	public static void main(String[] args) {
		
		double length1, length2 ;
		System.out.println("Enter the co-ordinates of 1st line ");
		length1 = Calculet_length();
		System.out.println("Enter the co-ordinates of 1st line ");
		length2 = Calculet_length();
		
		String len1 = length1+" ";
		String len2 = length2+" ";
		int check = (len1.compareTo(len2));
		System.out.println(len2+" "+len1);
		//System.out.println(len2+" "+len1+" "+check);
		
		if ( check < 0 ) {
			System.out.println(" length2 is greater than length1 ");
		}
		
		else if ( check > 0 ) {
			System.out.println(" length1 is greater than length2  ");
		}
		
		else {
			System.out.println(" length1 is equal to  length2 ");
		}
		
	}

}
