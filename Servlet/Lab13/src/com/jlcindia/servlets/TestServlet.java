package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	static{
		System.out.println("TestServlet-SB");
	}
    public TestServlet() {
    	System.out.println("TestServlet-DC");
    }
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("TestServlet-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet-service() begin");
		System.out.println("Core Request Processing begin");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is-"+em;
		msg=msg+"<br>Your IP is-"+ip;
		request.setAttribute("MSG", msg);
		PrintWriter out=response.getWriter();
		out.println(msg);
		System.out.println("Core Request Processing end");
		System.out.println("TestServlet-service() end");
	}
	
	public void destroy() {
		System.out.println("TestServlet-destroy()");
	}
}
