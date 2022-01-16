package com.xworkz.JdbcSetup;
import java.sql.*;
public class AirportJdbc {
	static String url="jdbc:mysql://localhost:3306/airport";
	static String username="root";
	static String password="Prathu@123";
	static String insert1="INSERT INTO airport_details VALUES (2,'delhi','del','pnq',15,'delhi',false)";
	static String insert2="INSERT INTO airport_details VALUES (3,'las vegas','las','mem',25,'las vegas',true)";
	static String insert3="INSERT INTO airport_details VALUES (4,'goa','goi','pyg',5,'goa',false)";
	static String insert4="INSERT INTO airport_details VALUES (5,'paris','par','lon',30,'paris',true)";
	static String update="UPDATE airport_details set location='london' where aid=4";
	static String delete="DELETE FROM airport_details WHERE aid=5";
	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			
			//statement.executeUpdate(insert1);
			//statement.executeUpdate(insert2);
			//statement.executeUpdate(insert3);
			//statement.executeUpdate(insert4);
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
