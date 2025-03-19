package com.requestdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reso=request.getParameter("resource");
		RequestDispatcher rd=null;
		if(reso.equals("success.jsp")){
			rd=request.getRequestDispatcher(reso);
			rd.forward(request, response);
		}else{
			rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
	}

}
