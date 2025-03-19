package com.mypkg.MYcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypkg.actionclass.ForgotAction;
import com.mypkg.actionclass.LoginAction;
import com.mypkg.actionclass.RegisterAction;


public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	LoginAction loginAction=null;
	RegisterAction registerAction=null;
	ForgotAction forgotAction=null;
	RequestDispatcher rd=null;
	
    public ControllerServlet() {
       System.out.println("ControllerServlet-DC");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("ControllerServlet-init()");
		super.init(config);
		loginAction=new LoginAction();
		registerAction=new RegisterAction();
		forgotAction=new ForgotAction();
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ControllerServlet-service()");
		String page="index";
		String uri=request.getRequestURI();
		System.out.println(uri);
		if(uri.endsWith("login.sau")){
			page=loginAction.verifyUser(request,response);
		}
		if(uri.endsWith("register.sau")){
			page=registerAction.registerUser(request,response);
		}
		if(uri.endsWith("forgot.sau")){
			page=forgotAction.passwordSupport(request,response);
		}
	rd=request.getRequestDispatcher(page);
	rd.forward(request, response);
	}

	
	public void destroy() {
		System.out.println("ControllerServlet-destroy()");
	}
}
