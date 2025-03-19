package com.jlcindia.jpa;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wstudents1")
public class WeekendStudent extends CurrentStudent{
	private String company;
	private String cemail;
	private double ctc;
	public WeekendStudent() {
		System.out.println("WeekendStudent-DC");
	}
	
	public WeekendStudent(String sname, String city, String status,
			double totalfee, String timings, String branch, double feebal,
			String company, String cemail, double ctc) {
		super(sname, city, status, totalfee, timings, branch, feebal);
		System.out.println("WeekendStudent-args");
		this.company = company;
		this.cemail = cemail;
		this.ctc = ctc;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	
}
