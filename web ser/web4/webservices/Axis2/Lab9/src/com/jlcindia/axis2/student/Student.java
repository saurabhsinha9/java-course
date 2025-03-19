package com.jlcindia.axis2.student;

public class Student {
	String sid;
	String fname;
	String lname;
	String email;
	public Student() {
		System.out.println("Student -DC");
	}
	public Student(String sid, String fname, String lname, String email) {
		System.out.println("Student-Args Cons");
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
		return ""+sid+"\t"+fname+"\t"+lname+"\t"+email;
	}
	
}
