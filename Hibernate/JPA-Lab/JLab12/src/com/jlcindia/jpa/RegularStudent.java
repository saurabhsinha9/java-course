package com.jlcindia.jpa;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="rstudents")
@PrimaryKeyJoinColumn(name="sid")
public class RegularStudent extends CurrentStudent{
	private String qualification;
	private String percentage;
	private int yoe;
	public RegularStudent() {
		System.out.println("RegularStudent-DC");
	}
	public RegularStudent(String sname, String city, String status,
			double totalfee, String timings, String branch, double feebal,
			String qualification, String percentage, int yoe) {
		super(sname, city, status, totalfee, timings, branch, feebal);
		System.out.println("RegularStudent-args");
		this.qualification = qualification;
		this.percentage = percentage;
		this.yoe = yoe;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	
}
