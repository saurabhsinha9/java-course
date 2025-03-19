package com.jlcindia.struts2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterActionForm extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static{
		System.out.println("RegisterActionForm-SB");
	}
	
	public RegisterActionForm() {
		System.out.println("RegisterActionForm-DC");
	}
	
	private String code;
	private String batchId;
	private String sid;
	private String fname;
	private String uname;
	private String pword;
	private String phone;
	private String email;
	private String gender;
	private Date dob;
	private String qualification;
	private String courses;
	private String timings;
	private String timecourses;
	private List<String> paymentOption=new ArrayList<String>();
	private String aboutus;
	private List<String> reqTechsLeft=new ArrayList<String>();
	private List<String> reqTechsRight=new ArrayList<String>();
	private List<String> learningOrder=new ArrayList<String>();
	private String comments;
	private boolean termsAcceptance;
	private String token;
	
	
	//setters and getters-----------start
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getTimecourses() {
		return timecourses;
	}
	public void setTimecourses(String timecourses) {
		this.timecourses = timecourses;
	}
	public List<String> getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(List<String> paymentOption) {
		this.paymentOption = paymentOption;
	}
	public String getAboutus() {
		return aboutus;
	}
	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	public List<String> getReqTechsLeft() {
		return reqTechsLeft;
	}
	public void setReqTechsLeft(List<String> reqTechsLeft) {
		this.reqTechsLeft = reqTechsLeft;
	}
	public List<String> getReqTechsRight() {
		return reqTechsRight;
	}
	public void setReqTechsRight(List<String> reqTechsRight) {
		this.reqTechsRight = reqTechsRight;
	}
	public List<String> getLearningOrder() {
		return learningOrder;
	}
	public void setLearningOrder(List<String> learningOrder) {
		this.learningOrder = learningOrder;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isTermsAcceptance() {
		return termsAcceptance;
	}
	public void setTermsAcceptance(boolean termsAcceptance) {
		this.termsAcceptance = termsAcceptance;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	//setters and getters-----------End
	
	
	public String execute()throws Exception{
		System.out.println("RegisterActionForm--execute()---begin");
			String status="failed";
			
			if(batchId.equals("B16")||batchId.equals("B17")
				||(batchId.equals("B-18"))||(batchId.equals("B-19"))){
				status="success";
			}else{
				addActionError("Registration cannot be proceeded for given batch");
			}
		System.out.println("RegisterActionForm--execute()---end");
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
