package com.jlcindia.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jlcindia.spring.mvc.dao.EnquiryDAO;
import com.jlcindia.spring.mvc.mail.service.MailFormatter;
import com.jlcindia.spring.mvc.mail.service.MailingService;
import com.jlcindia.spring.mvc.model.Enquiry;

public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	EnquiryDAO enquiryDAO;
	@Autowired
	MailingService mailingService;
	
	public void addEnquiry(Enquiry enq) {
		MailFormatter format=new MailFormatter();
		String msg=format.getEnquiryMailMessage(enq);
		String to=enq.getEmail();
		String sub="Welcome to Java Learning center";
		mailingService.sendMail(to, sub, msg);
		enquiryDAO.addEnquiry(enq);
	}

	
}
