package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;



public class RegisterForm extends ActionForm{
	
	
	static{
		System.out.println("RegisterForm-SB");
		System.out.println("RegisterForm-class Loaded");
	}
	public RegisterForm() {
		super();
		System.out.println("RegisterForm-DC");
	}
		
	private String sid;
	private String username;
	private String password;
	private String email;
	private String dob;
	private long phone;
	private double fee;
	private String quali;
	private String course[];
	private String gender;
	
	
	public void reset(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("RegisterForm-reset()");
	}
	
	public ActionErrors validate(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("RegisterForm-validate() is invoked due to validate attribute is true in  confi xml doc.");
		ActionErrors errors=new ActionErrors();
		System.out.println("No any validation checked");
		return errors;
	}
	
	public String getSid() {
		System.out.println("getSid()");
		return sid;
	}

	public void setSid(String sid) {
		System.out.println("setSid()");
		this.sid = sid;
	}

	public String getUsername() {
		System.out.println("getUsername()");
		return username;
	}

	public void setUsername(String username) {
		System.out.println("setUsername()");
		this.username = username;
	}

	public String getPassword() {
		System.out.println("getPassword()");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword()");
		this.password = password;
	}

	public String getEmail() {
		System.out.println("getEmail()");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setEmail()");
		this.email = email;
	}

	public String getDob() {
		System.out.println("getDob()");
		return dob;
	}

	public void setDob(String dob) {
		System.out.println("setDob()");
		this.dob = dob;
	}

	public long getPhone() {
		System.out.println("getPhone()");
		return phone;
	}

	public void setPhone(long phone) {
		System.out.println("setPhone()");
		this.phone = phone;
	}

	public double getFee() {
		System.out.println("getFee()");
		return fee;
	}

	public void setFee(double fee) {
		System.out.println("setFee()");
		this.fee = fee;
	}

	public String getQuali() {
		System.out.println("getQuali()");
		return quali;
	}

	public void setQuali(String quali) {
		System.out.println("setQuali()");
		this.quali = quali;
	}

	public String[] getCourse() {
		System.out.println("getCourse()");
		return course;
	}

	public void setCourse(String[] course) {
		System.out.println("setCourse()");
		this.course = course;
	}

	public String getGender() {
		System.out.println("getGender()");
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("setGender()");
		this.gender = gender;
	}	
}
