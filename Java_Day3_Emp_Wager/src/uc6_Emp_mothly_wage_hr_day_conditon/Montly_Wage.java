package uc6_Emp_mothly_wage_hr_day_conditon;

import uc4_Wager_Using_Switch_Case.SwitchCase;

public class Montly_Wage extends SwitchCase {

	public static final int isFulltime = 1, isParttime = 2;
	
	public static void main(String[] args) {
		
		int TotalWage = 0, day = 0, WorkinHr = 0;
		
		while( day <= 20 || WorkinHr <= 100 ) {
		
			int check = Switch();
			
			switch (check) {
			
			case isFulltime:                                                        // full time wage
				
				day++;
				WorkinHr += 8;
				TotalWage += Wager();     // Daily wager
				break;
				
			case isParttime:                                                        // part time wage
				
				day++;
				WorkinHr += 4;
				TotalWage += PartTimeWage();
				break;
				
			default: 																	//Absent
				day++;
				WorkinHr += 0;
                TotalWage += 0;
			}
		}

		System.out.println(" Employee Monthly wager = "+TotalWage);
	}

}
