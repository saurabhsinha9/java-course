package com.jlcindia.spring.mvc.command;

public class Student {
	static{
		System.out.println("Student-SB");
	}
	public Student() {
		System.out.println("Student-DC");
	}
	private String studentID;
	private String name;
	private String phone;
	private String email;
	private String []timings;
	private String qualification;
	private String gender;
	private String remarks;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
