package com.jlcindia.spring.transaction.jpa;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO accountDAO=null;
	
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void addAccount(Account a) {
		accountDAO.addAccount(a);
	}

	public double deposit(int accno, double amt) {
		return accountDAO.deposit(accno, amt);
	}

	public void transferFunds(int saccno, int daccno, double amt) {
		accountDAO.transferFunds(saccno, daccno, amt);
	}

	public double withdraw(int accno, double amt) {
		return accountDAO.withdraw(accno, amt);
	}

}
