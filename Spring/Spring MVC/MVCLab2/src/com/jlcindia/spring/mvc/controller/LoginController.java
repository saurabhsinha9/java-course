package com.jlcindia.spring.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;

import com.jlcindia.spring.mvc.command.User;

public class LoginController extends SimpleFormController {
	static{
		System.out.println("LoginController-SB");
	}
	public LoginController() {
		System.out.println("LoginController-DC");
	}
	
	
	protected ModelAndView onSubmit(Object command, HttpSession session)
			throws ServletException{
		System.out.println("LoginController-onSubmit()");
		User user=(User) command;
		String un=user.getUsername();
		String pw=user.getPassword();
		System.out.println(un);
		System.out.println(pw);
		return new ModelAndView("home");
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {
		System.out.println("LoginController-formBackingObject()");
		User user=new User();
		user.setUsername("Saurabh");
		return user;
	}
}
