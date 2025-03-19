package com.jlcindia.hibernate;

public class Student {
	private String studentId;
	private String batchId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String gender;
	private String qualification;
	private Double totalFee;
	private Double feePaid;
	private Double feeBal;
	private String status;
	private String remarks;
	public Student() {}
	public Student(String batchId, String firstName, String lastName,
			String email, String phone, String gender, String qualification,
			Double totalFee, Double feePaid, Double feeBal, String status,
			String remarks) {
		super();
		this.batchId = batchId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.qualification = qualification;
		this.totalFee = totalFee;
		this.feePaid = feePaid;
		this.feeBal = feeBal;
		this.status = status;
		this.remarks = remarks;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public Double getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(Double feePaid) {
		this.feePaid = feePaid;
	}
	public Double getFeeBal() {
		return feeBal;
	}
	public void setFeeBal(Double feeBal) {
		this.feeBal = feeBal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
