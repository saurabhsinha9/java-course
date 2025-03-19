package com.mypkg.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.mypkg.servlets.modelcomponent.LoginApplicationModel;
import com.mypkg.servlets.validation.MyValidation;

public class LoginServlet extends HttpServlet {
	static{
		System.out.println("LoginServlet-SB");
	}
	public LoginServlet() {
		System.out.println("LoginServlet-DC");
	}
	
	public void init() throws ServletException {
		System.out.println("LoginServlet-init()");
	}
	
	public void destroy() {
		System.out.println("LoginServlet-desroy()");
	}
boolean isvalid=false;
boolean isok=false;
String message="";
public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

	System.out.println("LoginServlet-service()-begin");
	String uname=request.getParameter("uname");
	isvalid=MyValidation.required(uname);
	if(isvalid){
	isok=true;
	}else{
	request.setAttribute("unameError", "Username is required");
	}

	String pass=request.getParameter("pword");

	isvalid=MyValidation.required(pass);
	if(isvalid){
	isok=true;
	}else{
	request.setAttribute("passError", "Password is required");
	}
	if(isok){
	message=LoginApplicationModel.verifyUser(uname, pass);
	}
	HttpSession hs=request.getSession();
	hs.setAttribute("MSG", message);
	RequestDispatcher rd=request.getRequestDispatcher("message.jsp");
	rd.forward(request, response);
	System.out.println();
	System.out.println("LoginServlet-service()--end");
}
}