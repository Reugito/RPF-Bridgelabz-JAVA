package com.EmployeePayRollService;

import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class  EmployeePayrollService{
	
	public void readEmployeeData() throws SQLException {
		
		Connection conn = MySQLConnection.getConnection();
		String sql = "SELECT * FROM payroll_service.employee_payroll";
		Statement query = conn.createStatement();
		ResultSet resultSet = query.executeQuery(sql);
		ResultSetMetaData rsmd = resultSet.getMetaData();
	    int columnsNumber = rsmd.getColumnCount();
		while(resultSet.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
	            if (i > 1) System.out.print(" | ");
	            System.out.print(resultSet.getString(i));
	        }
	        System.out.println("");
			
		}
		conn.close();
	}
	
	public void updateEmployeeData(String name, double salary) throws SQLException {
		Connection conn = MySQLConnection.getConnection();
		String sql = String.format("UPDATE `payroll_service`.`employee_payroll` SET BasicPay = %.2f  WHERE name = '%s' ;", salary, name );
		Statement query = conn.createStatement();
		int re = query.executeUpdate(sql);
		
		conn.close();
	}
	
	public static void main(String[] args) throws SQLException {
		EmployeePayrollService services = new EmployeePayrollService();
		services.readEmployeeData();
		services.updateEmployeeData(null, 0);
		services.readEmployeeData();
	}
}
