package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class ChangeEmailController extends AbstractController{

	static{
		System.out.println("ChangeEmailController-SB");
	}
	public ChangeEmailController() {
		System.out.println("ChangeEmailController-DC");
	}
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ChangeEmailController-handleRequestInternal()");
		String msg="Your Email has been changed";
		return new ModelAndView("cpstatus","msg",msg);
	}

}
