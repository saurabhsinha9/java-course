package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

public class ContactForm extends ActionForm{
	
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	static{
		System.out.println("ContactForm-DC");
		System.out.println("ContactForm-Class Loaded");
	}
	
	public ContactForm() {
		super();
		System.out.println("ContactForm-DC");
	}
	
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
		System.out.println("ContactForm-reset()");
	}
	
	public ContactForm(String fname, String lname, String email, String phone) {
		super();
		System.out.println("ContactForm-argsCons..");
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public String getFname() {
		System.out.println("ContactForm-getFname()");
		return fname;
	}
	public void setFname(String fname) {
		System.out.println("ContactForm-setFname()");
		this.fname = fname;
	}
	public String getLname() {
		System.out.println("ContactForm-getLname()");
		return lname;
	}
	public void setLname(String lname) {
		System.out.println("ContactForm-setLname()");
		this.lname = lname;
	}
	public String getEmail() {
		System.out.println("ContactForm-getEmail()");
		return email;
	}
	public void setEmail(String email) {
		System.out.println("ContactForm-setEmail()");
		this.email = email;
	}
	public String getPhone() {
		System.out.println("ContactForm-getPhone()");
		return phone;
	}
	public void setPhone(String phone) {
		System.out.println("ContactForm-setPhone()");
		this.phone = phone;
	}
	
	
}
