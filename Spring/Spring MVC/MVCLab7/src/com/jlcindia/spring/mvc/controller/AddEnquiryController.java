package com.jlcindia.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.jlcindia.spring.mvc.model.Enquiry;
import com.jlcindia.spring.mvc.service.EnquiryService;

public class AddEnquiryController extends SimpleFormController{
	@Autowired
	EnquiryService enquiryService;
	
	protected ModelAndView onSubmit(Object command) throws Exception {
		Enquiry enq=(Enquiry)command;
		enquiryService.addEnquiry(enq);
		return new ModelAndView("AddEnquirySuccess");
	}
	
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		Enquiry enq=new Enquiry();
		enq.setEnquiryID("E-1001");
		return enq;
	}
}
