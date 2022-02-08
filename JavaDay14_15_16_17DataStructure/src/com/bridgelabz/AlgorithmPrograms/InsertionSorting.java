package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.AlgorithmProgramsUtility.AlgorithmUtility;

public class InsertionSorting{
	
 
	public static void main(String args[]){
		AlgorithmUtility algorithmUtility = new AlgorithmUtility();
		String []arr = {"hello", "everyone", "how", "are", "you", "all"};
		int n = arr.length;
     
		algorithmUtility.insertionSort(arr,n);
		algorithmUtility.printArray(arr, n);
     
	}
}