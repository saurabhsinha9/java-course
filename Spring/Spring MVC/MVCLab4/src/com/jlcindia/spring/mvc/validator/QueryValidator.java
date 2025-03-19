package com.jlcindia.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jlcindia.spring.mvc.command.Query;

public class QueryValidator implements Validator {
	static{
		System.out.println("QueryValidator-SB");
	}
	public QueryValidator() {
		System.out.println("QueryValidator-DC");
	}
	public boolean supports(Class clazz) {
		System.out.println("QueryValidator-supports()");
		return Query.class.equals(clazz);
	}

	public void validate(Object command, Errors errors) {
		System.out.println("QueryValidator-validate()");
		Query q=(Query)command;
		if(q.getMessage()==null||q.getMessage().length()==0){
			errors.rejectValue("message", "error.message",new Object[]{},"Message is required.");
		}
		ValidationUtils.rejectIfEmpty(errors, "message", "error.message");
	}

}
