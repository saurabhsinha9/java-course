package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ChangePasswordController extends AbstractController{

	static{
		System.out.println("ChangePasswordController-SB");
	}
	public ChangePasswordController() {
		System.out.println("ChangePasswordController-DC");
	}
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ChangePasswordController-handleRequestInternal()");
		String msg="Your Password has been changed.";
		return new ModelAndView("cpstatus","msg",msg);
	}

}
