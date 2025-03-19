package com.icicibank.accounts;

import java.io.Serializable;
/*
 * Supporting class of BSI
 * Transfer Object used to communicate with DB
 * 
 */
public class AccountTo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private int accno;
	private double amount;
	
	static{
		System.out.println("AccountTo-SB");
	}
	//constructors
	public AccountTo() {
		System.out.println("AccountTo-DC");
	}

	public AccountTo(int accno, double amount) {
		//super();
		System.out.println("AccountTo-argsCons...");
		this.accno = accno;
		this.amount = amount;
	}

	
	//setters and getters
	
	public int getAccno() {
		System.out.println("AccountTo--getAccno()");
		return accno;
	}

	public void setAccno(int accno) {
		System.out.println("AccountTo--setAccno()");
		this.accno = accno;
	}

	public double getAmount() {
		System.out.println("AccountTo--getAmount()");
		return amount;
	}

	public void setAmount(double amount) {
		System.out.println("AccountTo--setAmount()");
		this.amount = amount;
	}
	
}
