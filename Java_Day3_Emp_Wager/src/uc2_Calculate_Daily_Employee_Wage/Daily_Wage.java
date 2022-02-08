package uc2_Calculate_Daily_Employee_Wage;

import uc1_Emloyee_Attendance.Emp_Attendance;

public class Daily_Wage extends Emp_Attendance {
	
	public static int Wager() {
		
		int WagePerHr = 20, FullDayHr = 8;
		int Daily_wage = WagePerHr * FullDayHr;
		return Daily_wage;
	}
	
	public static void main(String[] args) {
		
		int attendance = Attendance();
		
		int isPresent = 1, isAbsent = 0; 
		
		if (attendance == isPresent) {
			
		System.out.print("Employee Daily wager = "+Wager());
		}
		
		else {
			
			System.out.println("Employee Daily Wager = "+isAbsent);
		}
	}

}
