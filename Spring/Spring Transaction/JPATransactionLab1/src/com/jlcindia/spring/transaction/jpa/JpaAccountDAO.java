package com.jlcindia.spring.transaction.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JpaAccountDAO implements AccountDAO{

	@Autowired
	JpaTemplate jpaTemp;
	
	@Autowired
	JpaTransactionManager txManager;
	
	public void addAccount(Account a) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			jpaTemp.persist(a);
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
			Account acc=(Account) jpaTemp.find(Account.class, accno);
			bal=acc.getBal()+amt;
			acc.setBal(bal);
			jpaTemp.merge(acc);
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
			acc=(Account) jpaTemp.find(Account.class, accno);
			bal=acc.getBal();
			if(bal-amt>=5000){
				bal=acc.getBal()-amt;
				acc.setBal(bal);
				jpaTemp.merge(acc);
			}else{
				throw new InsufficientFundsException();
			}
			
			txManager.commit(ts);
		} catch (Exception e) {
			System.out.println(e.toString()+"\n"+e.getMessage());
			txManager.rollback(ts);
		}
		return bal;
	}


	public void transferFunds(int saccno, int daccno, double amt) {
		double dbal=0.0;
		double sbal=0.0;
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			
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
			txManager.commit(ts);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("rollback--"+e.getMessage());
			txManager.rollback(ts);
		}
	}

}
