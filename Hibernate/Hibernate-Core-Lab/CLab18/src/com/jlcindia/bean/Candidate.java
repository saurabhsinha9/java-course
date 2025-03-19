package com.jlcindia.bean;

import java.util.List;

public abstract class Candidate {
	private int cid;
	private String fname;
	private String lname;
	private List<String> emails;
	private String qualification;
	private String dob;
	public Candidate() {
	}
	public Candidate(String fname, String lname, List<String> emails,
			String qualification, String dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.emails = emails;
		this.qualification = qualification;
		this.dob = dob;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
