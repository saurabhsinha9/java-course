package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	static{
		System.out.println("HelloServlet-SB");
	}
    public HelloServlet() {
    	System.out.println("HelloServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet-service()");
		String nm=request.getParameter("name");
		System.out.println(nm);
		request.setAttribute("NM", nm);
		PrintWriter out=response.getWriter();
		out.println("<font color=red size=8>No Gurantee </font>");
		RequestDispatcher rd2=request.getRequestDispatcher("/hai.jlc");
		rd2.forward(request, response);
		System.out.println("HelloServlet-service()");
	}
	
	public void destroy() {
		System.out.println("HelloServlet-destroy()");
	}
}
