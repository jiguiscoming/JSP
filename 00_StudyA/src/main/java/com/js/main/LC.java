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
		if(!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("contents", "content_login.jsp");
			request.getRequestDispatcher("first.jsp").forward(request, response);
		}else {
			LM.get(request);
			request.setAttribute("contents", "content_loginoutput.jsp");
			request.getRequestDispatcher("first.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
