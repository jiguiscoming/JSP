package com.js.log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.js.log.Account;
import com.js.main.DBManager;

public class LM {
	
	public static void continueAccount(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		Account a =(Account) hs.getAttribute("accountInfo");
		
		if (a == null) {
			request.setAttribute("loginPage", "login/login.jsp");
		}else {
			request.setAttribute("loginPage", "login/loginInfo.jsp");
		}
	
	}
	

	public static void checkAccount(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String userId = request.getParameter("id");
			String userPw = request.getParameter("pw");
			
			String sql = "select * from log where id=?";
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				if(userPw.equals(rs.getString("pw"))) {
					request.setAttribute("result", "로그인 성공");
					Account a = new Account();
					a.setName(rs.getString("name"));
					a.setId(rs.getString("id"));
					a.setPw(rs.getString("pw"));
					HttpSession hs = request.getSession();
					hs.setAttribute("account", a);
					hs.setMaxInactiveInterval(10);
				}else {
					request.setAttribute("result", "비밀번호 오류");
				}
			}else {
				request.setAttribute("result", "존재하지 않는 회원");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "서버 오류");
		}finally {
			DBManager.close(con, pstmt, rs);
		}
	}


}
