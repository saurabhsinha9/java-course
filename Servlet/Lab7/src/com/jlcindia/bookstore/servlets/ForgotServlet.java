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

public class ForgotServlet extends HttpServlet {
	static{
		System.out.println("ForgotServlet-SB");
	}
    public ForgotServlet() {
    	System.out.println("ForgotServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("ForgotServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForgotServlet-service() begin");
		//collect request Parameter in controller
		String em=request.getParameter("email");
		//calling the model component
		boolean status=false;
		RequestDispatcher rd1=null;
		status=UserService.passwordSupport(em);
		//forwarding to view component
		if(status){
			request.setAttribute("MSG", "Hi Your Registration Password has been sent to your email ID Successfully");
			rd1=request.getRequestDispatcher("/login.jsp");
		}else{
			request.setAttribute("MSG", "EmailId is not registered");
			rd1=request.getRequestDispatcher("/login.jsp");
		}		
		
		System.out.println("ForgotServlet-service() end");
	}
	
	public void destroy() {
		System.out.println("ForgotServlet-destroy()");
	}
}
