package com.jlcindia.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CSTU")
public class CurrentStudent extends Student {
	private String timings;
	private String branch;
	private double feebal;
	
	public CurrentStudent() {
		System.out.println("CurrentStudent-DC");
	}

	public CurrentStudent(String sname, String city, String status,
			double totalfee, String timings, String branch, double feebal) {
		super(sname, city, status, totalfee);
		System.out.println("CurrentStudent-argsCons");
		this.timings = timings;
		this.branch = branch;
		this.feebal = feebal;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
}
