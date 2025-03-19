package com.jlcindia.bean;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="laccount_table")
@PrimaryKeyJoinColumn(name="accno")
@Proxy(lazy=false)
public class LoanAccount extends Account{
	private String loanType;
	private double loanAmount;
	private int period;
	private double interest;
	private double emi;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public LoanAccount(String createdDate, String branch, String loanType,
			double loanAmount, int period, double interest, double emi) {
		super(createdDate, branch);
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.period = period;
		this.interest = interest;
		this.emi = emi;
	}

	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
}
