package com.jlcindia.bean;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="caccount_table")
@PrimaryKeyJoinColumn(name="accno")
@Proxy(lazy=false)
public class CurrentAccount  extends Account{
	private int corpId;
	private int nou;
	private double bal;
	private double minBal;
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CurrentAccount(String createdDate, String branch, int corpId,
			int nou, double bal, double minBal) {
		super(createdDate, branch);
		this.corpId = corpId;
		this.nou = nou;
		this.bal = bal;
		this.minBal = minBal;
	}


	public int getCorpId() {
		return corpId;
	}
	public void setCorpId(int corpId) {
		this.corpId = corpId;
	}
	public int getNou() {
		return nou;
	}
	public void setNou(int nou) {
		this.nou = nou;
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
