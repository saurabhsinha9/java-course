package com.jlcindia.struts1;

import org.apache.struts.validator.ValidatorActionForm;

public class ContactForm extends ValidatorActionForm {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contactId;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String status;
	
	public ContactForm(){
		
		System.out.println("D.c");
	}
	
	//setter and getter 
	public String getContactId() {
		
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
