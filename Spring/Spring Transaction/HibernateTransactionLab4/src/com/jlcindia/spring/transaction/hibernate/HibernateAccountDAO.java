package com.jlcindia.spring.transaction.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HibernateAccountDAO implements AccountDAO{

	@Autowired
	HibernateTemplate hibernateTemp;
	
	@Autowired
	HibernateTransactionManager txManager;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_UNCOMMITTED)
	public void addAccount(Account a) {
			hibernateTemp.save(a);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public double deposit(int accno, double amt) {
		double bal=0.0;
			Account acc=(Account) hibernateTemp.load(Account.class, accno);
			bal=acc.getBal()+amt;
			acc.setBal(bal);
			hibernateTemp.update(acc);
		return bal;
	}
	
	
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public double withdraw(int accno, double amt) throws InsufficientFundsException {
		double bal=0.0;
		Account acc=null;
		acc=(Account) hibernateTemp.load(Account.class, accno);
			bal=acc.getBal();
			if(bal-amt>=5000){
				bal=acc.getBal()-amt;
				acc.setBal(bal);
				hibernateTemp.update(acc);
			}else{
				throw new InsufficientFundsException();
			}
			
		return bal;
	}


	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void transferFunds(int saccno, int daccno, double amt) throws InsufficientFundsException {
		double dbal=0.0;
		double sbal=0.0;
		Account dacc=(Account) hibernateTemp.load(Account.class, daccno);
			System.out.println("Before: transferring  destination account amount"+dacc.getBal());
			dbal=dacc.getBal()+amt;
			dacc.setBal(dbal);
			hibernateTemp.update(dacc);
			dacc=(Account) hibernateTemp.load(Account.class, daccno);
			System.out.println("After:  transferring  destination account amount"+dacc.getBal());
			Account sacc=(Account) hibernateTemp.load(Account.class, saccno);
			if(sacc.getBal()-amt>=6000){
				sbal=sacc.getBal()-amt;
				sacc.setBal(sbal);
				hibernateTemp.update(sacc);
			}else{
				throw new InsufficientFundsException();
			}
			
	}

}
