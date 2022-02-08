package com.bridglabz.programs;

import java.util.Scanner;

public class EmpWageBuilderMain {

	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter wage per hour: ");
		int WagePerHr = sc.nextInt();
		System.out.print("Enter compny name: ");
		String name = sc.next();
		System.out.print("Enter total workin hr: ");
		int totalWorkingHr = sc.nextInt();
		System.out.print("Enter total working days: ");
		int totalDays = sc.nextInt();
		empWageBuilder.getMonthlyWageCompny(WagePerHr, name, totalWorkingHr, totalDays);
	}
}
