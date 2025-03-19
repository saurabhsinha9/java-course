package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	static{
		System.out.println("LoginServlet-SB");
	}
    public LoginServlet() {
    	System.out.println("LoginServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet-service() begin");
		//collect the request parameter
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		//process the data
		String msg="";
		if(un.equals(pw)){
			msg="Login Successfull";
		}else{
			msg="Login fail";
		}
		//sending the response
		response.setContentType("text/xhtml");
		PrintWriter out=response.getWriter();
		out.println("<h1>Java Learning Center</h1>");
		out.println("<h1>"+msg+"</h1>");
		System.out.println("LoginServlet-service() end");
	}
	
	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}

}
