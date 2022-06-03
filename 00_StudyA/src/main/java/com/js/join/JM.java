package com.js.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.js.main.DBManager;

public class JM {

	public static void save(HttpServletRequest request) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			String sql = "insert into log values(?,?,?,?)";
			
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, id);
			pstmt.setString(4, pw);
			
			Account a = null;
			
			System.out.println(pstmt.executeUpdate()); 
			
			if (id.equals(rs.getString("id"))) {
				request.setAttribute("result", "중복되는 아이디");
			}else if(pstmt.executeUpdate() == 1) {
				a = new Account(name, age, id, pw);
				request.setAttribute("account", a);
				request.setAttribute("result", "로그인 성공");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "로그인 실패");
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
	}

}
