package com.js.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class JM {

	public static void get(HttpServletRequest request) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		con = DBManager.connect();
		
		String sql = "insert into log values (?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setString(2, age);
		pstmt.setString(3, id);
		pstmt.setString(4, pw);
		
		if (pstmt.executeUpdate() == 1) {
			request.setAttribute("result", "가입 성공");
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "가입 실패");
			
		}
		DBManager.close(con, pstmt, null);
		
	}


	
	

}
