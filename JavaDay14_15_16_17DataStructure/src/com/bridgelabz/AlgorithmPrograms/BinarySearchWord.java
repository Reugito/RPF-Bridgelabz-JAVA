package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.AlgorithmProgramsUtility.AlgorithmUtility;

public class BinarySearchWord {

	public static void main(String[] args) {
		AlgorithmUtility algorithmUtility = new AlgorithmUtility();
		Scanner sc = new Scanner(System.in);
		
		String []arr = {"hello", "everyone","hi", "I", "Know", "you",};
		int n = arr.length;
		
		algorithmUtility.insertionSort(arr,n);
		System.out.print("Enter the word: ");
		String word = sc.next();
		boolean result = algorithmUtility.binarySearchWord(arr,word);
		System.out.println(result);
	}

}
