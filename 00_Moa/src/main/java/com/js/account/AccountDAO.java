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
				
				String name = rs.getString("account_name");
				int byear = Integer.parseInt(rs.getString("account_byear"));
				int bmonth =Integer.parseInt(rs.getString("account_bmonth"));
				int bday = Integer.parseInt(rs.getString("account_bday"));
				String id = rs.getString("account_id");
				String pw = rs.getString("account_pw");
				String email = rs.getString("account_email");
				String gender = rs.getString("account_gender");
				String addr = rs.getString("account_addr");
				String phone = rs.getString("account_phone");
				
				if(userPw.equals(pw)) {
					request.setAttribute("result", "로그인 성공");
//					bean에 넣어줌
					a = new Account(name, byear, bmonth, bday, id, pw, email, gender, addr, phone);
//					세션 넣음
					HttpSession hs = request.getSession();
					hs.setMaxInactiveInterval(60*2);
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

	public static void accountReg(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String name = request.getParameter("name");
		int byear =	Integer.parseInt(request.getParameter("byear"));
		int bmonth = Integer.parseInt(request.getParameter("bmonth"));
		int bday =	Integer.parseInt(request.getParameter("bday"));
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwCheck = request.getParameter("pw_check");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String addr = request.getParameter("addr");
		String phone = request.getParameter("phone");
		
		try {
			String sql = "insert into account values (?,?,?,?,?,?,?,?,?,?)";
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, byear);
			pstmt.setInt(3, bmonth);
			pstmt.setInt(4, bday);
			pstmt.setString(5, id);
			pstmt.setString(6, pw);
			pstmt.setString(7, email);
			pstmt.setString(8, gender);
			pstmt.setString(9, addr);
			pstmt.setString(10, phone);
			
			Account a = null;
			
			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("result", "회원가입 성공");
				a = new Account(name, byear, bmonth, bday, id, pw, email, gender, addr, phone);
//				세션 넣어줌
				HttpSession hs = request.getSession();
				hs.setMaxInactiveInterval(60*2);
				hs.setAttribute("account", a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", "서버 오류");
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	public static void deleteAccount(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		hs.removeAttribute("account");
		
	}

	public static void getAccount(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		hs.setAttribute("account", hs);
	}
	
	
	
	
	

}
