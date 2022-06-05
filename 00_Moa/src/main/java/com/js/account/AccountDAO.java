package com.js.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.js.main.DBManager;

public class AccountDAO {

	public static void accountCheck(HttpServletRequest request) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String userId =	request.getParameter("id");
		String userPw =	request.getParameter("pw");

		try {
			String sql = "select * from account where account_id=?";
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			
			Account a = null;
			if(rs.next()) {
				if(userPw.equals(rs.getString("account_pw"))) {
					request.setAttribute("result", "로그인 성공");
					a = new Account();
					a.setName(rs.getString("account_name"));
					a.setId(userId);
					a.setPw(userPw);
					HttpSession hs = request.getSession();
					hs.setAttribute("account", a);
				}else {
					request.setAttribute("result", "비밀번호 오류");
				}
			}else {
				request.setAttribute("result", "존재하지 않는 아이디");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "server error");
			
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}

}
