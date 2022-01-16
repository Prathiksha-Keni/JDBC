package com.xworkz.JdbcSetup;
import java.sql.*;

public class CompanyJdbc {
	static String url="jdbc:mysql://localhost:3306/company";
	static String username="root";
	static String password="Prathu@123";
	static String insertq1="INSERT INTO details VALUES(02,'Bbm','delhi',false,15,'b',1)";
	static String insertq2="INSERT INTO details VALUES(03,'IBM','pune',true,25000,'a',7)";
	static String insertq3="INSERT INTO details VALUES(04,'EQ2','mangalore',true,500,'c',5)";
	static String insertq4="INSERT INTO details VALUES(05,'hp','mysuru',false,4500,'a',8)";
	static String insertq5="INSERT INTO details VALUES(06,'m&n','kerala',true,8000,'d',6)";
	static String update="UPDATE details set grade='A' where cid=06";
	static String delete="DELETE FROM details WHERE cid=5";
	
	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			//statement.executeUpdate(insertq1);
			//statement.executeUpdate(insertq2);
			//statement.executeUpdate(insertq3);
			//statement.executeUpdate(insertq4);
			//statement.executeUpdate(insertq5);
			//statement.executeUpdate(update);
			statement.executeUpdate(delete);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
				
			}
		}
	}
}
