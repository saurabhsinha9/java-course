package com.jlcindia.spring.mvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ViewQueriesController extends AbstractController {

	static{
		System.out.println("ViewQueriesController-SB");
	}
	public ViewQueriesController() {
		System.out.println("ViewQueriesController-DC");
	}
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ViewQueriesController-handleRequestInternal()");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Spring Query 1");
		al.add("Spring Query 2");
		al.add("Spring Query 3");
		al.add("Spring Query 4");
		return new ModelAndView("viewQueries","list",al);
	}

}
