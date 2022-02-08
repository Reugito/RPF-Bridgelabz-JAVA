package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.AlgorithmProgramsUtility.AlgorithmUtility;

public class AnagramDetection {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		String str1 = sc.next();
		System.out.print("Enter string 2: ");
		String str2 = sc.next();
		
		System.out.println(utility.anagramDetection(str1, str2));
	}

}
