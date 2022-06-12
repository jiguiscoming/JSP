package com.js.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("account").equals("login")) {
			request.setAttribute("content_page", "account/login.jsp");
		}else if(request.getParameter("account").equals("join")){
			request.setAttribute("content_page", "account/join.jsp");
		}else if(request.getParameter("account").equals("logout")){
			AccountDAO.deleteAccount(request);
			request.setAttribute("content_page", "home.jsp");
		}else {
			request.setAttribute("content_page", "account/mypage_check.jsp");
		}
		AccountDAO.loginCheck(request);
		request.getRequestDispatcher("main.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("name") != null) {
			AccountDAO.accountReg(request);
			request.setAttribute("content_page", "home.jsp");
		}else if(request.getParameter("pwCheck") != null) {
			request.setAttribute("content_page", "account/mypage.jsp");
		}else{
			AccountDAO.accountCheck(request);
			request.setAttribute("content_page", "home.jsp");
		}
		AccountDAO.loginCheck(request);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	
	
	}

}
