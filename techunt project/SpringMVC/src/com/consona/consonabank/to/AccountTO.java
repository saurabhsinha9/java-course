package com.consona.consonabank.to;

public class AccountTO {
	private int accno;
	private String atype;
	private double bal;
	public AccountTO()
	{
		
		System.out.println("def cons of accountTO class");
	}
public AccountTO(String atype,double bal)
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
