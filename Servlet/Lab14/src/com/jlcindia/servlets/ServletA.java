package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletA extends HttpServlet {
	static{
		System.out.println("ServletA-SB");
	}
    public ServletA() {
    	System.out.println("ServletA-DC");
    }
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ServletA-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletA-service() begin");
		System.out.println("Core Request Processing begin");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is-"+em;
		msg=msg+"<br>Your IP is-"+ip;
		request.setAttribute("MSG", msg);
		
		System.out.println("Core Request Processing end");
		RequestDispatcher rd=request.getRequestDispatcher("b.jlc");
		rd.forward(request, response);
		System.out.println("ServletA-service() end");
	}
	
	public void destroy() {
		System.out.println("ServletA-destroy()");
	}
}
