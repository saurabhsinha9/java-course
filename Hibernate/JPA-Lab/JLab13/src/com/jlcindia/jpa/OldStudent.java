package com.jlcindia.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="OSTU")
public class OldStudent extends Student {
	@Column(name="ocompany")
	private String company;
	@Column(name="ocemail")
	private String cemail;
	@Column(name="octc")
	private double ctc;
	
	public OldStudent() {
		System.out.println("OldStudent-DC");
	}

	public OldStudent(String sname, String city, String status,
			double totalfee, String company, String cemail, double ctc) {
		super(sname, city, status, totalfee);
		System.out.println("OldStudent-args");
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
