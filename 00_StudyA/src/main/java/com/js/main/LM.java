package com.js.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class LM {

	public static void get(HttpServletRequest request) {
		try {
			
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		Connection con = DBManager.connect();
		
		String sql = "insert into log values (log_seq.nextval,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, age);
		pstmt.setString(3, id);
		pstmt.setString(4, pw);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	

}
