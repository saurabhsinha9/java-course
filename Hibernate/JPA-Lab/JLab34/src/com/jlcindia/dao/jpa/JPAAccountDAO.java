package com.jlcindia.dao.jpa;

import com.jlcindia.bean.CurrentAccount;
import com.jlcindia.bean.LoanAccount;
import com.jlcindia.bean.SavingsAccount;
import com.jlcindia.dao.AccountDAO;
import com.jlcindia.dao.JLCBaseDAO;

public class JPAAccountDAO extends JLCBaseDAO implements AccountDAO {

	public void addCurrentAccount(CurrentAccount account) {
		getJPATemplate().persist(account);
	}

	public void addLoanAccount(LoanAccount account) {
		getJPATemplate().persist(account);	
	}

	public void addSavingsAccount(SavingsAccount account) {
		getJPATemplate().persist(account);
	}

	public void deleteCurrentAccount(int accno) {
		CurrentAccount ca=(CurrentAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		getJPATemplate().remove(ca);
		
	}

	public void deleteLoanAccount(int accno) {
		LoanAccount la=(LoanAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		getJPATemplate().remove(la);
	}

	public void deleteSavingsAccount(int accno) {
		SavingsAccount sa=(SavingsAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		getJPATemplate().remove(sa);
	}

	public CurrentAccount findCurrentAccount(int accno) {
		CurrentAccount ca=(CurrentAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		return ca;
	}

	public LoanAccount findLoanAccount(int accno) {
		LoanAccount la=(LoanAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		return la;
	}

	public SavingsAccount findSavingsAccount(int accno) {
		SavingsAccount sa=(SavingsAccount)getJPATemplate().find(CurrentAccount.class, new Integer(accno));
		return sa;
	}

	public void updateCurrentAccount(CurrentAccount account) {
		getJPATemplate().merge(account);
	}

	public void updateLoanAccount(LoanAccount account) {
		getJPATemplate().merge(account);
	}

	public void updateSavingsAccount(SavingsAccount account) {
		getJPATemplate().merge(account);
	}

}
