package com.xworkz.JdbcSetup;

import java.sql.*;

public class JdbcSetup {
	static String url="jdbc:mysql://localhost:3306/employee";
	static String username="root";
	static String password="Prathu@123";
	static String sql="INSERT INTO emp_Details VALUE (2,'Prajwal','Bangalore','4578969874');";

	public static void main(String[] args) throws Exception {
		// loading the driver
		//Driver driver =Class.forName("com.mysql.cj.jdbc.Driver");
		// register with driver manager
		//DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println(connection);
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Query executed");
	}

}
