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
					request.setAttribute("result", "�α��� ����");
				}else {
					request.setAttribute("result", "��й�ȣ ����");
				}
			}else {
				request.setAttribute("result", "�������� �ʴ� ȸ��");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "�α��� ����");
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
