package com.jlcindia.spring.transaction.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JpaAccountDAO implements AccountDAO{

	@Autowired
	JpaTemplate jpaTemp;
	
	@Autowired
	JpaTransactionManager txManager;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void addAccount(Account a) {
		jpaTemp.persist(a);
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false)
	public double deposit(int accno, double amt) {
		double bal=0.0;
			Account acc=(Account) jpaTemp.find(Account.class, accno);
			bal=acc.getBal()+amt;
			acc.setBal(bal);
			jpaTemp.merge(acc);
			
		return bal;
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false)
	public double withdraw(int accno, double amt) throws InsufficientFundsException  {
		double bal=0.0;
		Account acc=null;
			acc=(Account) jpaTemp.find(Account.class, accno);
			bal=acc.getBal();
			if(bal-amt>=5000){
				bal=acc.getBal()-amt;
				acc.setBal(bal);
				jpaTemp.merge(acc);
			}else{
				throw new InsufficientFundsException();
			}
		
		return bal;
	}


	@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false)
	public void transferFunds(int saccno, int daccno, double amt) throws InsufficientFundsException {
		double dbal=0.0;
		double sbal=0.0;
			Account dacc=(Account) jpaTemp.find(Account.class, daccno);
			System.out.println("Before: transferring  destination account amount"+dacc.getBal());
			dbal=dacc.getBal()+amt;
			dacc.setBal(dbal);
			jpaTemp.merge(dacc);
			dacc=(Account) jpaTemp.find(Account.class, daccno);
			System.out.println("After:  transferring  destination account amount"+dacc.getBal());
			Account sacc=(Account) jpaTemp.find(Account.class, saccno);
			if(sacc.getBal()-amt>=6000){
				sbal=sacc.getBal()-amt;
				sacc.setBal(sbal);
				jpaTemp.merge(sacc);
			}else{
				throw new InsufficientFundsException();
			}
		
	}

}
