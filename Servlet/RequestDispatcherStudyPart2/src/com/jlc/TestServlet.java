package com.jlc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest s1, HttpServletResponse s2)
			throws ServletException, IOException {
		System.out.println("in DoPost");
	
	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String un=request.getParameter("name");
		request.setAttribute("UN", un);
		System.out.println(request.getMethod());
		RequestDispatcher rd=null;
		doPost(request, response);
		
		if(un.equals("sanjay")){
			rd=request.getRequestDispatcher("sanjay.jsp");
			rd.forward(request, response);
		}else{
			rd=request.getRequestDispatcher("saurabh.jsp");
			rd.forward(request, response);
		}
	}

	
}
