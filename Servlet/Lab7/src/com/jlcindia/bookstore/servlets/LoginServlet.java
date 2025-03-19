package com.jlcindia.bookstore.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.bookstore.services.UserService;


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
		//Collect Request Data in controller
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		//calling the model component
		boolean status=false;
		RequestDispatcher rd1=null;
		status=UserService.verifyUser(un,pw);
		
		//forwarding to view component
		if(status){
			request.setAttribute("MSG", "Hi "+un+" Your Login has been Completed Successfully");
			rd1=request.getRequestDispatcher("home.jsp");
		}else{
			request.setAttribute("MSG", "Login Again.Incorrect Username or Password");
			rd1=request.getRequestDispatcher("login.jsp");
		}
		
		System.out.println("LoginServlet-service() end");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
