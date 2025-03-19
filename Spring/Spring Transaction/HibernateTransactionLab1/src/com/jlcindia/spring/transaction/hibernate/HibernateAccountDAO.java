package com.jlcindia.spring.transaction.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class HibernateAccountDAO implements AccountDAO{

	@Autowired
	HibernateTemplate hibernateTemp;
	
	@Autowired
	HibernateTransactionManager txManager;
	
	public void addAccount(Account a) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			hibernateTemp.save(a);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
	}

	public double deposit(int accno, double amt) {
		double bal=0.0;
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			Account acc=(Account) hibernateTemp.load(Account.class, accno);
			bal=acc.getBal()+amt;
			acc.setBal(bal);
			hibernateTemp.update(acc);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
		return bal;
	}

	public double withdraw(int accno, double amt) {
		double bal=0.0;
		TransactionStatus ts=null;
		Account acc=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			acc=(Account) hibernateTemp.load(Account.class, accno);
			bal=acc.getBal();
			if(bal-amt>=5000){
				bal=acc.getBal()-amt;
				acc.setBal(bal);
				hibernateTemp.update(acc);
			}else{
				throw new InsufficientFundsException();
			}
			System.out.println("Bal"+bal);
			txManager.commit(ts);
			System.out.println("Bal"+bal);
		} catch (Exception e) {
			System.out.println("Bal--"+bal);
			txManager.rollback(ts);
		}
		System.out.println("Bal"+bal);
		return bal;
	}


	public void transferFunds(int saccno, int daccno, double amt) {
		double dbal=0.0;
		double sbal=0.0;
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			
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
			txManager.commit(ts);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("rollback--"+e.getMessage());
			txManager.rollback(ts);
		}
	}

}
