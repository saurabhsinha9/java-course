package com.jlcindia.dao;

import com.jlcindia.bean.CurrentAccount;
import com.jlcindia.bean.LoanAccount;
import com.jlcindia.bean.SavingsAccount;

public interface AccountDAO {
	public void addSavingsAccount(SavingsAccount account);
	public void addCurrentAccount(CurrentAccount account);
	public void addLoanAccount(LoanAccount account);	
	public void deleteSavingsAccount(int accno);
	public void deleteCurrentAccount(int accno);
	public void deleteLoanAccount(int accno);
	public void updateSavingsAccount(SavingsAccount account);
	public void updateCurrentAccount(CurrentAccount account);
	public void updateLoanAccount(LoanAccount account);
	public SavingsAccount findSavingsAccount(int accno);
	public CurrentAccount findCurrentAccount(int accno);
	public LoanAccount findLoanAccount(int accno);
}
