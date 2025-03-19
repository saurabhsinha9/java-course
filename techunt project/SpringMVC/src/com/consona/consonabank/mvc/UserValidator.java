package com.consona.consonabank.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
	
		User user=(User)command;
		if(user.getUsername()==null||user.getUsername().length()==0)
		{
		errors.rejectValue("username","error.username.required",null,"Username required.");
		}
		
		if(user.getPassword()==null||user.getPassword().length()==0)
		{
			errors.rejectValue("password","error.password.required",null,"Password required");
		}
		
		
	}
	

}
