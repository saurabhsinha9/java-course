package com.jlcindia.cxf;

public class Student {
	String sid;
	String fname;
	String lname;
	String email;
	
	public Student() {
	
	}

	public Student(String sid, String fname, String lname, String email) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
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

	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + "]";
	}
	
	
}
