package com.jlcindia.spring.transaction.jpa;

public interface AccountService {
	public void addAccount(Account a);
	public double deposit(int accno,double amt);
	public double withdraw(int accno,double amt);
	public void transferFunds(int saccno,int daccno,double amt);
}
