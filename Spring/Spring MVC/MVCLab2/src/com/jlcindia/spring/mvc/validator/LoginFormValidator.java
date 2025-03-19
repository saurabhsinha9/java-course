package com.jlcindia.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jlcindia.spring.mvc.command.User;

public class LoginFormValidator implements Validator {
	static{
		System.out.println("LoginFormValidator-SB");
	}
	public LoginFormValidator() {
		System.out.println("LoginFormValidator-DC");
	}
	public boolean supports(Class clazz) {
		System.out.println("LoginFormValidator-supports()");
		return User.class.equals(clazz);
	}

	public void validate(Object command, Errors errors) {
		System.out.println("LoginFormValidator-validate()");
		User user=(User)command;
		if(user.getUsername()==null||user.getUsername().length()==0){
			errors.rejectValue("username", "error.username.required",null,"UserName required.");
		}
		if(user.getPassword()==null||user.getPassword().length()==0){
			errors.rejectValue("password", "error.password.required",null,"Password required.");
		}
	}

}
