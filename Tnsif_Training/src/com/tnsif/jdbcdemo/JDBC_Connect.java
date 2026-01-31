package com.tnsif.jdbcdemo;

import java.sql.*;

public class JDBC_Connect {
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "1234";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM sample";
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
				
			{
				String table = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getInt(3);
				System.out.println(table);
			}
			
			rs.close();
			st.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
