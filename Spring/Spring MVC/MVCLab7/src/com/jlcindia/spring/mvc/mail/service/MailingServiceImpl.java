package com.jlcindia.spring.mvc.mail.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailingServiceImpl implements MailingService {
	@Autowired
	private JavaMailSender mailSender;
	public void sendMail(String emai, String subject, String message) {
		try {
			MimeMessage msg=mailSender.createMimeMessage();
			MimeMessageHelper msg1=new MimeMessageHelper(msg,true);
			msg1.setTo(emai);
			msg1.setSubject(subject);
			msg1.setText(message,true);
			this.mailSender.send(msg);
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
	}

}
