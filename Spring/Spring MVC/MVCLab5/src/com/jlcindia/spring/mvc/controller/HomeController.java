package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {

	static{
		System.out.println("HomeController-SB");
	}
	public HomeController() {
		System.out.println("HomeController-DC");
	}
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("HomeController-handleRequestInternal()");
		return new ModelAndView("index");
	}

}
