package com.jlcindia.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jlcindia.spring.mvc.model.Enquiry;

public class EnquiryFormValidator implements Validator {

	public boolean supports(Class clazz) {
		return Enquiry.class.equals(clazz);
	}

	public void validate(Object command, Errors errors) {
		Enquiry enq=(Enquiry) command;
		
		if(enq.getName()==null||enq.getName().length()==0){
			errors.rejectValue("name", "error.name",new Object[]{},"Name is required.");
		}
		
		if(enq.getEmail()==null||enq.getEmail().length()==0){
			errors.rejectValue("email", "error.email",new Object[]{},"Email is required.");
		}else if(!((enq.getEmail().contains("@"))&&(enq.getEmail().endsWith(".com")||enq.getEmail().endsWith(".co.in")||
				enq.getEmail().endsWith(".in")))){
			errors.rejectValue("email", "error.email",new Object[]{},"Invalid Email.");
		}
		
		if(enq.getPhone()==null||enq.getPhone().length()==0){
			errors.rejectValue("phone", "error.phone",new Object[]{},"Phone is required.");
		}else if(enq.getPhone().length()!=10){
			errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains 10 digits.");
		}else if(enq.getPhone().length()==10){
			try {
				Integer.parseInt(enq.getPhone());
			} catch (Exception e) {
				errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains Only digits.");
			}
		}
		
		if(enq.getTimings().length<1){
			errors.rejectValue("timings", "error.timings",new Object[]{},"Select Suitable Timings.");
		}
		
		if(enq.getGender()==null||enq.getGender().length()==0){
			errors.rejectValue("gender", "error.gender",new Object[]{},"Gender is required.");
		}
		
		if(enq.getEnquiryType()==null||enq.getEnquiryType().length()==0||
				enq.getEnquiryType().equals("----Select Option----")){
			errors.rejectValue("enquiryType", "error.enquiryType",new Object[]{},"Select EnquiryType.");
		}

		if(enq.getAboutJLC()==null||enq.getAboutJLC().length()==0||
				enq.getAboutJLC().equals("----Select Option----")){
			errors.rejectValue("aboutJLC", "error.aboutJLC",new Object[]{},"Select AboutJLC.");
		}

	}

}
