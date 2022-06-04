package com.js.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LC")
public class LC extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setAttribute("contents", "login/content_login.jsp");
			request.getRequestDispatcher("first.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LM.checkAcount(request);
		LM.continueAccount(request,response);
		request.setAttribute("contents", "login/content_loginoutput.jsp");
		request.getRequestDispatcher("first.jsp").forward(request, response);
	}

}
