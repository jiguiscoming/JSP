package com.js.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LM {

	public static void checkAcount(HttpServletRequest request) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		
		try {
			con = DBManager.connect();
			
			String sql = "select * from log where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (userPw.equals(rs.getString("pw"))) {
					request.setAttribute("result", "로그인 성공");
				}else {
					request.setAttribute("result", "비밀번호 오류");
				}
			}else {
				request.setAttribute("result", "존재하지 않는 회원");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "로그인 오류");
		}
		
		
		DBManager.close(con, pstmt, rs);
	}

	public static void continueAccount(HttpServletRequest request, HttpServletResponse response) {

		String s = "session is working";
		HttpSession hs = request.getSession();
		hs.setMaxInactiveInterval(60);
		hs.setAttribute("session", s);
		
	}

}
