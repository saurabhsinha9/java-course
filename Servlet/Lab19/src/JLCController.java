package com.jlc.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import com.jlc.action.*;

public class JLCController extends HttpServlet {
LoginAction loginAction=null;
RegisterAction registerAction=null;
RetrievePasswordAction retrievePassword=null;
public void init(ServletConfig cfg){
	loginAction = new LoginAction();
	registerAction = new RegisterAction();
	retrievePassword = new RetrievePasswordAction();
	}
public void service(HttpServletRequest req,HttpServletResponse res){
String uri=req.getRequestURI();
if(uri.endsWith("login.jlc")){
loginAction.login(req,res);	
}else if(uri.endsWith("register.jlc")){
	registerAction.registerStudent(req,res);
	}else if(uri.endsWith("retrievePassword.jlc")){
		retrievePassword.retrievePassword(req,res);
}
}
public void destroy(){}
}
