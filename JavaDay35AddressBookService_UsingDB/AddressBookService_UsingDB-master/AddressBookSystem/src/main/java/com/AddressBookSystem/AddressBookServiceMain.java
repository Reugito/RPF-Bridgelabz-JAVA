package com.AddressBookSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookServiceMain {

	public static void main(String[] args) throws SQLException {
		AddressBookServiceMain services = new AddressBookServiceMain();
		services.readAddressBookData();
		services.updateAddressBookData("RAO", "12111");
		services.readAddressBookData();
	}

	private void updateAddressBookData(String name, String phoneNumber) throws SQLException {
		Connection conn = MySQLConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement("UPDATE addressbookservice.addressbook SET phoneNumber = ? WHERE firstName = ?");
		statement.setString(1, phoneNumber);
		statement.setString(2, name);
		statement.executeUpdate();
        System.out.println("data updated successfully");
        
        conn.close();
	}

	private void readAddressBookData() throws SQLException {
		Connection conn = MySQLConnection.getConnection();
		String sql = "SELECT * FROM addressbookservice.addressbook";
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
}
