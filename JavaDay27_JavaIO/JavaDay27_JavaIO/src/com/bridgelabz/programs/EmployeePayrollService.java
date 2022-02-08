package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService{
	List<EmployeePayroll> employeeData = new ArrayList();
	
	public static void main(String args[]) {
		EmployeePayrollService service = new EmployeePayrollService();
		Scanner consoleReader = new Scanner(System.in);
		
		service.readEmployeeData(consoleReader);
		service.writeEmployeeData();
	}
	
	public void readEmployeeData(Scanner consoleReader){
		System.out.print("Enter Employee ID: ");
		String empID = consoleReader.next();
		System.out.print("Enter Employee name: ");
		String empName = consoleReader.next();
		System.out.print("Enter Employee salary: ");
		double empSalary = consoleReader.nextDouble();
		
		employeeData.add(new EmployeePayroll(empID, empName, empSalary));
	}
	
	public void writeEmployeeData() {
		System.out.println(employeeData);
	}
}