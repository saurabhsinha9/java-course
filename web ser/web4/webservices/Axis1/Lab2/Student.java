package org.jlcindia.axis;

public class Student {
	private String sid;
	private String fname;
	private String lname;
	private String email;
	
	Student(){
		System.out.println("Student DC");
	}

	public Student(String sid, String fname, String lname, String email) {
		System.out.println("Student argsCons");
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
	String str="Your Query Result is"+sid+"\t"+fname+"\t"+lname+"\t"+email+"\n is Dispayed.";
		return str;
	}
}
