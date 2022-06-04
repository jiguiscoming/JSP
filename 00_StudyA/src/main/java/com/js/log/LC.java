package com.js.log;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LC")
public class LC extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			LM.continueAccount(request);
			request.setAttribute("contentPage ", "login/login_page.jsp");
			request.getRequestDispatcher("home.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LM.checkAccount(request);
		LM.continueAccount(request);
		request.setAttribute("loginPage", "login/loginInfo.jsp");	
		request.setAttribute("contentPage ", "login/loginOutput_page.jsp");
		request.getRequestDispatcher("first.jsp").forward(request, response);
	}

}
