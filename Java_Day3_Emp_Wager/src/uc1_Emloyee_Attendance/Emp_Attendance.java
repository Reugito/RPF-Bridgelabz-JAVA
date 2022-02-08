package uc1_Emloyee_Attendance;
import java.util.*;
public class Emp_Attendance {

	public static int Attendance() {
	
		Random random = new Random();
		int check = random.nextInt(2);
	
		return check;
	}
	
	public static void main(String args[]) {
		
		int check = Attendance();
		int isPresent = 1, isAbsent = 0;
		if( check == isPresent ) {
			System.out.println("Employee is present");
			
		}
		else {
			
			System.out.println("Employee is absent");
		}	
	}
}
