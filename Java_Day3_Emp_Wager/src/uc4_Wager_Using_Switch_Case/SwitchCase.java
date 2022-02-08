package uc4_Wager_Using_Switch_Case;

import java.util.*;

import uc3_PartTime_Emp_Wage.PartTime_Wage;

public class SwitchCase extends PartTime_Wage {
	
	public static final int isFulltime = 1, isParttime = 2;
	
	public static int Switch() {
		
		Random randome = new Random();
		int check = randome.nextInt(3);
		return check;
	}
	public static void main(String[] args) {
		
		int check = Switch();
		
		switch (check) {
		
		case isFulltime: 					// full time wage
			
			System.out.println("Employee Full day Wager = "+Wager());
			break;
			
		case isParttime:                                                        // part time wage
		
			System.out.println("Employee Part time Wager = "+PartTimeWage());
			break;
		default:
			System.out.println("Employee is Absent");               //Absent
		}
		
	}

}
