package com.consona.consonabank.dao;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.consona.consonabank.exceptions.AccountNotFoundException;
import com.consona.consonabank.exceptions.InSufficientFundsException;
import com.consona.consonabank.hibernate.Account;

public class HibernateAccountDAO implements AccountDAO {
@Autowired
HibernateTemplate htemp;

public double getBal(int accno) {
		Account acc=(Account)htemp.load(Account.class,accno);
			return acc.getBal();
	}
	public void fundsTransfer(int saccno, int daccno, double amt) {
		Object obj=htemp.get(Account.class,daccno,LockMode.READ);
		if(obj==null)
		{
			throw new AccountNotFoundException();
		}
		Account dacc=(Account)obj;
		double dcbal=dacc.getBal();
		double dnbal=dcbal+amt;
		dacc.setBal(dnbal);
		htemp.update(dacc);
		Account sacc=(Account)htemp.load(Account.class,saccno,LockMode.READ);
		double scbal=sacc.getBal();
		if(scbal>=5000+amt)
		{
			double snbal=scbal-amt;
			sacc.setBal(snbal);
			htemp.update(sacc);
		}
		else
		{
			throw new InSufficientFundsException();
			
		}
			
		
		
	}

}
