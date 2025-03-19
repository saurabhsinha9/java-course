package com.jlcindia.struts1;

public class ContactTo {
	
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	public ContactTo() {
		super();
		System.out.println("ContactTo-DC");
	}
	
	public ContactTo(String fname, String lname, String email, String phone) {
		super();
		System.out.println("ContactTo-argsCons...");
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public String getFname() {
		System.out.println("getFname()");
		return fname;
	}

	public void setFname(String fname) {
		System.out.println("setFname()");
		this.fname = fname;
	}

	public String getLname() {
		System.out.println("getLname()");
		return lname;
	}

	public void setLname(String lname) {
		System.out.println("setLname()");
		this.lname = lname;
	}

	public String getEmail() {
		System.out.println("getEmail()");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setEmail()");
		this.email = email;
	}

	public String getPhone() {
		System.out.println("getPhone()");
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone()");
		this.phone = phone;
	}	
}
