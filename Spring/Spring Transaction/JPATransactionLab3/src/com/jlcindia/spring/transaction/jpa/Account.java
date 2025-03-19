package com.jlcindia.spring.transaction.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
	@Id
	private int accno;
	private String aname;
	private double bal;
	public Account() {}
	
	public Account(int accno, String aname, double bal) {
		super();
		this.accno = accno;
		this.aname = aname;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
}
