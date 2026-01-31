package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
	
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "1234";
		
		String studentName = "Divya";
		String studentDept = "CSE";
		int yearOfPassing = 2026;
		
		String query = "INSERT INTO sample(student_name, student_dept, year_of_passing) VALUES(?, ?, ?) ";
		
        try {
			
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement st = con.prepareStatement(query);
			
			st.setString(1, studentName);
			st.setString(2, studentDept);
			st.setInt(3, yearOfPassing);
			
			int rs = st.executeUpdate();
			System.out.println(rs +" row/s affected");
			
			st.close();
			con.close();
        }
        catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
}
	
