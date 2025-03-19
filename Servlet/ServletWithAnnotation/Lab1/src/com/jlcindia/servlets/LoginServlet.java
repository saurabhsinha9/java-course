package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/login.jlc" })
@WebFilter()
@WebListener()
@WebInitParam(name="phone",value="9999")

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
		System.out.println("LoginServlet-service()");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		String msg="";
		if(un.equals(pw)){
			msg="Login success";
		}else{
			msg="Login fail";
		}
		PrintWriter out=response.getWriter();
		out.println("<h1>"+msg+"</h1>");
	}
	
	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}

}
