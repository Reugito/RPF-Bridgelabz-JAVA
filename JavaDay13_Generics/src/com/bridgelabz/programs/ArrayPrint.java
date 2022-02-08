package com.bridgelabz.programs;

public class ArrayPrint  {
	public static void getArray() {
		Integer intArr[] = {1, 2, 3, 4, 5};
		Double doubleArr[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		ArrayPrint.printArr(intArr);
		System.out.println();
		ArrayPrint.printArr(doubleArr);
	}
	
	static <t>void printArr(t[] arr){
		for (t i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		ArrayPrint.getArray();
	}
}
