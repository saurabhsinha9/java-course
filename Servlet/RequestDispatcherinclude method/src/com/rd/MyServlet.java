package com.rd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/header.html").include(request, response);
		request.getRequestDispatcher("/WEB-INF/login.html").include(request, response);
		//request.getRequestDispatcher("login.jsp").include(request, response);
		request.getRequestDispatcher("/WEB-INF/footer.html").include(request, response);
	}

}
