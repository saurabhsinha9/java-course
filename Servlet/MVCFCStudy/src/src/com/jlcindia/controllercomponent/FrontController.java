package com.jlcindia.controllercomponent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.action.LoginAction;
import com.jlcindia.action.RegisterAction;


public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.endsWith("login.sau")){
			LoginAction.login(request,response);
		}
		if(uri.endsWith("register.sau")){
			RegisterAction.register(request,response);
		}
	}

}
