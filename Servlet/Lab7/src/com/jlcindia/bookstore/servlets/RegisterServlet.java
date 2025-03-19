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

public class RegisterServlet extends HttpServlet {
    static{
    	System.out.println("RegisterServlet-SB");
    }
	public RegisterServlet() {
		System.out.println("RegisterServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("RegisterServlet-init()");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service() begin");
		//collect request parameter in controller
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String em=request.getParameter("email");
		String ph=request.getParameter("phone");
		String ge=request.getParameter("gender");
		String ct=request.getParameter("ctype");
		String cno=request.getParameter("cnum");
		String co[]=request.getParameterValues("color");
		String un=request.getParameter("uname");
		String pw=request.getParameter("pword");
		//calling the model component
		boolean status=false;
		RequestDispatcher rd1=null;
		status=UserService.registerUser(fn, ln, em, ph, ge, ct, cno, co, un, pw);
		//forwarding to view component
		if(status){
			request.setAttribute("MSG", "Hi "+fn+" Your Registration has been Completed Successfully");
			rd1=request.getRequestDispatcher("/home.jsp");
		}else{
			request.setAttribute("MSG", "Register Again.Sorry for Inconvenience");
			rd1=request.getRequestDispatcher("/login.jsp");
		}		
		System.out.println("RegisterServlet-service() end");
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}

}
