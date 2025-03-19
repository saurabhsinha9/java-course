package com.jlcindia.spring.transaction.hibernate;

public interface AccountDAO {
	public void addAccount(Account a);
	public double deposit(int accno,double amt);
	public double withdraw(int accno,double amt)throws InsufficientFundsException;
	public void transferFunds(int saccno,int daccno,double amt)throws InsufficientFundsException;
}
