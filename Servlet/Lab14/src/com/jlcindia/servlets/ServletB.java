package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletB extends HttpServlet {
	static{
		System.out.println("ServletB-SB");
	}
    public ServletB() {
    	System.out.println("ServletB-DC");
    }
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ServletB-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletB-service() begin");
		System.out.println("Core Request Processing begin");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is-"+em;
		msg=msg+"<br>Your IP is-"+ip;
		request.setAttribute("MSG", msg);
		System.out.println("Core Request Processing end");
		RequestDispatcher rd=request.getRequestDispatcher("c.jlc");
		rd.forward(request, response);
		System.out.println("ServletB-service() end");
	}
	
	public void destroy() {
		System.out.println("ServletB-destroy()");
	}
}
