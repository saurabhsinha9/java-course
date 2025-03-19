package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ContactController extends MultiActionController{

	static{
		System.out.println("ContactController-SB");
	}
	public ContactController() {
		System.out.println("ContactController-DC");
	}
	
	protected ModelAndView addContact(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ContactController-addContact()");
		return new ModelAndView("addContact");
	}

	protected ModelAndView updateContact(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ContactController-updateContact()");
		return new ModelAndView("updateContact");
	}
	
	protected ModelAndView deleteContact(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ContactController-deleteContact()");
		return new ModelAndView("deleteContact");
	}
	
	protected ModelAndView viewContact(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ContactController-viewContact()");
		return new ModelAndView("viewContact");
	}
}
