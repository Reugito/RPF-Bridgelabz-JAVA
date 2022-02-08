package com.Bridglabz.programs;
import java.util.Scanner;

import com.Bridglabz.Utility.Utility;

public class StockAccountManagement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utilityObj = new Utility();
		
		System.out.print("Enter the number of stocks: ");
		int num = sc.nextInt();
		while(num != 0) {
			utilityObj.addStocks();
			num--;
		}
		utilityObj.getShareReport();
	}
}
