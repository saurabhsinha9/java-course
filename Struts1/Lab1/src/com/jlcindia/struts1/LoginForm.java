package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm{
	static{
		System.out.println("LoginForm-SB");
		System.out.println("LoginForm-class Loaded");
	}
	private String username;
	private String password;
	public LoginForm() {
		System.out.println("LoginForm-DC");
	}
	
	public String getUsername() {
		System.out.println("getUsername()");
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername()");
		this.username = username;
	}
	public String getPassword() {
		System.out.println("getPassword()");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword()");
		this.password = password;
	}
	public void reset(ActionMapping am,HttpServletRequest req){
		System.out.println("LoginForm-reset()");
	}
	
	public ActionErrors validate(ActionMapping am,HttpServletRequest req){
		System.out.println("LoginForm-validate()");
		
		ActionErrors errors=new ActionErrors();
		
		if(username==null||username.length()==0){
			ActionError error=new ActionError("errors.login.un.required");
			errors.add("username", error);
		}
		else if(username.length()<5 ||username.length()>10){
			errors.add("username", new ActionError("errors.login.un.length"));
		}
		
		if(password==null||password.length()==0){
			errors.add("password", new ActionError("errors.login.pw.required"));			
		}
		else if(password.length()<4 ||password.length()>8){
			errors.add("password", new ActionError("errors.login.pw.length"));
		}
		return errors;
	}

	

}
