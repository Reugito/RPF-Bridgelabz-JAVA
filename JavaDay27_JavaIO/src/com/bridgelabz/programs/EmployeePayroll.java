package com.bridgelabz.programs;

public class EmployeePayroll{
	double empSalary;
	String empName, empID;
	
	public EmployeePayroll(String empID, String empName, double empSalary) {
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "empSalary=" + empSalary + ", empName=" + empName + ", empID=" + empID ;
	}
	
}