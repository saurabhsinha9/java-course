package com.jlcindia.bookstore;

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
		//Collect Request Data
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		
		//Process the Request Data
		System.out.println(un);
		System.out.println(pw);
		
		//send the Response
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>JLC Bookstore</h1>");
		out.println("<h2>Hi "+un+" Your Login has been Completed Successfully</h2>");
		out.println("<h1>JLC Bookstore HomePage</h1>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("LoginServlet-service() end");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
