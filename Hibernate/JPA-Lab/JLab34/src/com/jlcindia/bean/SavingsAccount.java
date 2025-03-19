package com.jlcindia.bean;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="saccount_table")
@PrimaryKeyJoinColumn(name="accno")
@Proxy(lazy=false)
public class SavingsAccount extends Account{
	private int debitCardNo;
	private double bal;
	private double minBal;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(String createdDate, String branch, int debitCardNo,
			double bal, double minBal) {
		super(createdDate, branch);
		this.debitCardNo = debitCardNo;
		this.bal = bal;
		this.minBal = minBal;
	}

	public int getDebitCardNo() {
		return debitCardNo;
	}
	public void setDebitCardNo(int debitCardNo) {
		this.debitCardNo = debitCardNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getMinBal() {
		return minBal;
	}
	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}
	
}
