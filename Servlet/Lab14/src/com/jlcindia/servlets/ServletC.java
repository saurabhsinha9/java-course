package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletC extends HttpServlet {
	static{
		System.out.println("ServletC-SB");
	}
    public ServletC() {
    	System.out.println("ServletC-DC");
    }
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ServletC-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletC-service() begin");
		System.out.println("Core Request Processing begin");
		String nm=request.getParameter("fname");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is-"+em;
		msg=msg+"<br>Your IP is-"+ip;
		request.setAttribute("MSG", msg);
		PrintWriter out=response.getWriter();
		out.println("<h1>"+msg+"</h1>");
		System.out.println("Core Request Processing end");
		System.out.println("ServletC-service() end");
	}
	
	public void destroy() {
		System.out.println("ServletC-destroy()");
	}
}
