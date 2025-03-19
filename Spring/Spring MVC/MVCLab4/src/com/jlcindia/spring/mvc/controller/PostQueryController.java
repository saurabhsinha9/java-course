package com.jlcindia.spring.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.jlcindia.spring.mvc.command.Query;

public class PostQueryController extends SimpleFormController {
	
	static{
		System.out.println("PostQueryController-SB");
	}
	public PostQueryController() {
		System.out.println("PostQueryController-DC");
	}
	protected ModelAndView onSubmit(Object command) throws Exception {
		System.out.println("PostQueryController-onSubmit()");
		Query q=(Query)command;
		System.out.println(q.getMessage());
		return new ModelAndView("index");
	}
}
