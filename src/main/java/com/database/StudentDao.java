package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	private ResultSet database(int id) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "1234";
		
		try {			
			con = DriverManager.getConnection(url, uname, pass);
			
			ps = con.prepareStatement("SELECT * FROM students WHERE id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public Student getStudent(int id) throws SQLException {
		Student s = new Student();
		ResultSet rs = database(id);
		
		if(rs.next()) {
			s.name = rs.getString("name");
			s.id = rs.getInt("id");
		}
		
		con.close();
		ps.close();
		
		return s;
	}
}
