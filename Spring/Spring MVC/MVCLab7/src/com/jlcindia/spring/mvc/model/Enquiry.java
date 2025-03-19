package com.jlcindia.spring.mvc.model;

public class Enquiry {
	private String enquiryID;
	private String name;
	private String phone;
	private String email;
	private String [] timings;
	private String enquiryType;
	private String gender;
	private String aboutJLC;
	private String remarks;
	
	public Enquiry() {}
	
	
	public Enquiry(String enquiryID, String name, String phone, String email,
			String[] timings, String enquiryType, String gender,
			String aboutJLC, String remarks) {
		super();
		this.enquiryID = enquiryID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.timings = timings;
		this.enquiryType = enquiryType;
		this.gender = gender;
		this.aboutJLC = aboutJLC;
		this.remarks = remarks;
	}


	public String getEnquiryID() {
		return enquiryID;
	}

	public void setEnquiryID(String enquiryID) {
		this.enquiryID = enquiryID;
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

	public String getEnquiryType() {
		return enquiryType;
	}

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAboutJLC() {
		return aboutJLC;
	}

	public void setAboutJLC(String aboutJLC) {
		this.aboutJLC = aboutJLC;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
