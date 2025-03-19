package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet {
	static{
		System.out.println("HeaderServlet-SB");
	}
    public HeaderServlet() {
    	System.out.println("HeaderServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("HeaderServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HeaderServlet-service() begin");
		PrintWriter out=response.getWriter();
		out.println("<font color=red size=8>Java Learning Center</font><br/><br/><br/><br/><br/><br/>");
		System.out.println("HeaderServlet-service() end");
	}

	public void destroy() {
		System.out.println("HeaderServlet-");
	}

}
