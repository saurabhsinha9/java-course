package com.jlc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HaiServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("header.html").include(request, response);
		request.getRequestDispatcher("welcome.html").include(request, response);
		request.getRequestDispatcher("footer.html").include(request, response);
		
	}

}
