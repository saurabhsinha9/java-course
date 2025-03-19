package com.consona.consonabank.hibernate;

import java.io.Serializable;

public class Account implements Serializable{
	private int accno;
	private String atype;
	private double bal;
	public Account()
	{
		
		System.out.println("def cons of account class");
	}
public Account(String atype,double bal)
{
	super();
	this.atype=atype;
	this.bal=bal;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAtype() {
	return atype;
}
public void setAtype(String atype) {
	this.atype = atype;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
	
}



