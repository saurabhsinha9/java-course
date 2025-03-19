package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm{
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("reset");
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
