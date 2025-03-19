package com.jlcindia.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jlcindia.spring.mvc.command.Student;

public class RegisterFormValidator implements Validator {
	static{
		System.out.println("RegisterFormValidator-SB");
	}
	public RegisterFormValidator() {
		System.out.println("RegisterFormValidator-DC");
	}
	public boolean supports(Class clazz) {
		System.out.println("RegisterFormValidator-supports()");
		return Student.class.equals(clazz);
	}

	public void validate(Object command, Errors errors) {
		System.out.println("RegisterFormValidator-validate()");
		Student stu=(Student)command;
		if(stu.getName()==null||stu.getName().length()==0){
			errors.rejectValue("name", "error.name",new Object[]{},"Name is required.");
		}
		
		if(stu.getEmail()==null||stu.getEmail().length()==0){
			errors.rejectValue("email", "error.email",new Object[]{},"Email is required.");
		}else if(!((stu.getEmail().contains("@"))&&(stu.getEmail().endsWith(".com")||stu.getEmail().endsWith(".co.in")||
				stu.getEmail().endsWith(".in")))){
			errors.rejectValue("email", "error.email",new Object[]{},"Invalid Email.");
		}
		
		if(stu.getPhone()==null||stu.getPhone().length()==0){
			errors.rejectValue("phone", "error.phone",new Object[]{},"Phone is required.");
		}else if(stu.getPhone().length()!=10){
			errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains 10 digits.");
		}else if(stu.getPhone().length()==10){
			try {
				Integer.parseInt(stu.getPhone());
			} catch (Exception e) {
				errors.rejectValue("phone", "error.phone",new Object[]{},"Phone contains Only digits.");
			}
		}
		
		if(stu.getTimings().length<1){
			errors.rejectValue("timings", "error.timings",new Object[]{},"Select Suitable Timings.");
		}
		
		if(stu.getGender()==null||stu.getGender().length()==0){
			errors.rejectValue("gender", "error.gender",new Object[]{},"Gender is required.");
		}
		
		if(stu.getQualification()==null||stu.getQualification().length()==0||
				stu.getQualification().equals("----Select Option----")){
			errors.rejectValue("qualification", "error.qualification",new Object[]{},"Select Qualification.");
		}
	}

}
