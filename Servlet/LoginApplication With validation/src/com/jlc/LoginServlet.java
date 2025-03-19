package com.jlc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{

	
	static{
		System.out.println("LoginServlet-SB");
	}
	
	public LoginServlet() {
		System.out.println("LoginServlet-DC");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet-init()");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet-service-begin");
		//collecting  the client data
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		String loginError="";
		//validate 
		if(un==null||un.trim().length()==0){
			loginError="UserName is Required";
		}
		if(un.length()<=3 || un.length()>=15){
			loginError="UserName must be in between 3 to 15 character";
		}
		if(pw==null||pw.trim().length()==0){
			loginError="Password is Required";
		}
		if(pw.length()<=4 || pw.length()>=12){
			loginError="Password must be in between 4 to 12 character";
		}
		
		request.setAttribute("LoginError", loginError);
		//process the data
		System.out.println(un);
		System.out.println(pw);
		String msg="";
		
		if(un.equals(pw)){
			msg="Login Success";
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			msg="Login fail";
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		request.getSession().setAttribute("MSG", msg);
	}
	
	public void destroy() {
		System.out.println("LoginServlet-destroy()");
	}
}
