package com.jlcindia.spring.transaction.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JdbcAccountDAO implements AccountDAO{

	@Autowired
	SimpleJdbcTemplate simpleJdbcTemp;
	@Autowired
	DataSourceTransactionManager txManager;
	
	public void addAccount(Account a) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			String sql="insert into accounts values(?,?,?)";
			simpleJdbcTemp.update(sql, a.getAccno(),a.getAname(),a.getBal());
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
			String sql1="select bal from accounts where accno=?";
			Integer i=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, accno);
			bal=i.intValue()+amt;
			String sql2="update accounts set bal=? where accno=?";
			simpleJdbcTemp.update(sql2, bal,accno);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
		return bal;
	}

	public double withdraw(int accno, double amt) {
		double bal=0.0;
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			String sql1="select bal from accounts where accno=?";
			Integer i=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, accno);
			System.out.println(i.intValue());
			double d=i.intValue();
			double lim=5000.0;
			
			if(d-amt<lim){
				throw new InsufficientFundsException();
			}
			if(d-amt>=lim){
			bal=d-amt;
			String sql2="update accounts set bal=? where accno=?";
			simpleJdbcTemp.update(sql2, bal,accno);
			}
			txManager.commit(ts);
		} catch (Exception e) {
			System.out.println("rollback--"+e.getMessage());
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
			
			String sql2="select bal from accounts where accno=?";
			Integer i2=(Integer)simpleJdbcTemp.queryForObject(sql2, Integer.class, daccno);
			System.out.println("Before: "+i2.intValue());
			dbal=i2.intValue()+amt;
			String sql4="update accounts set bal=? where accno=?";
			simpleJdbcTemp.update(sql4, dbal,daccno);
			Integer i=(Integer)simpleJdbcTemp.queryForObject(sql2, Integer.class, daccno);
			System.out.println("After: "+i.intValue());
			String sql1="select bal from accounts where accno=?";
			Integer i1=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, saccno);
			System.out.println("Before: "+i1.intValue());
			if(i1.intValue()-amt>=6000){
				sbal=i1.intValue()-amt;
			}
			if(i1.intValue()-amt<6000){
				throw new InsufficientFundsException();
			}
			String sql3="update accounts set bal=? where accno=?";
			simpleJdbcTemp.update(sql3, sbal,saccno);
			i=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, saccno);
			System.out.println("After: "+i.intValue());
			txManager.commit(ts);
		} catch (Exception e) {
			System.out.println("rollback--"+e.getMessage());
			txManager.rollback(ts);
		}
	}

}
