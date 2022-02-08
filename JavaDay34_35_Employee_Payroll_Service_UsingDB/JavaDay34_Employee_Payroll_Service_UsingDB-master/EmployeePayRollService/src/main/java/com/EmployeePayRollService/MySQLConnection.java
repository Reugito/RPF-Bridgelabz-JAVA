package com.EmployeePayRollService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    @SuppressWarnings("unused")
	public static Connection getConnection(){
    	
		String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service";
        String user = "root";
    	String pass = "";
    	
    	try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
			System.out.println("Connection established successfully");
			return connect;
    	}catch (SQLException e) {
			System.out.println("Connection faild");
		}  
    	return null;
    }
}
