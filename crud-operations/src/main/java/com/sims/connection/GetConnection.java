package com.sims.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	
	public static Connection connection;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost/simscollege",
					"root" , "7569");
			System.out.println("Connection Successfully...");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in first block...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error in second block...");
		}
		return null;
	}
	
	public static void main(String[] args) {
		getConnection();
	}
}
