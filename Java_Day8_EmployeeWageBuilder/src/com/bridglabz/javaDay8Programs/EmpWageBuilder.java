package com.bridglabz.javaDay8Programs;

import java.util.Random;

public class EmpWageBuilder {
	public static final int WagePerHr = 20, FullDayHr = 8, PartThimeHr = 4;
	public static final int isFulltime = 1, isParttime = 2;
	public static int day = 0;
	
	public static int Attendance() {
		Random random = new Random();
		int check = random.nextInt(3);
		return check;
	}
	
	public static int getDailyWager() {
		int Daily_wage = WagePerHr * FullDayHr; 
		return Daily_wage;
	}
	
	public static int getPartTimeWage() {             // adding part time wager
    	int PartTimeWage = WagePerHr * PartThimeHr; 
        return PartTimeWage;
    }
	
	public static int usingSwitch() {
		int check = Attendance() ;
		day++;
		switch (check) {
			case isFulltime: 
				System.out.println("Day"+day+" = "+getDailyWager());
				return getDailyWager();
		case isParttime:  
				System.out.println("Day"+day+" = "+getPartTimeWage());
				return getPartTimeWage();
			default:
				System.out.println("Day"+day+" = 0");
			
		return 0;
		}
	}
	
	public static void getMonthlyWage() {
		
		int totalWage = 0;
		for(day = 1; day <= 20; day++) {
			totalWage += usingSwitch();
		}
		System.out.println("Employee Monthly wager = "+totalWage);
	}
	
	public static void getMonthlyWageWhileCondition() {
		
		int totalWage = 0, wage = 0, workingHr = 0;
		while( day < 20 && workingHr <= 100  ) {
			wage = usingSwitch();
			if(wage / WagePerHr == FullDayHr) {
				totalWage += wage;
				workingHr += FullDayHr;
			}
			else if(wage / WagePerHr == PartThimeHr) {
				totalWage += wage;
				workingHr += PartThimeHr;
			}
		}
		System.out.println("Employee Monthly wager = "+totalWage);
	}
		
	
}
