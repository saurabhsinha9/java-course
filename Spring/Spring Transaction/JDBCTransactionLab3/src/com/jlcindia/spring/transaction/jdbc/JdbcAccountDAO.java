package com.jlcindia.spring.transaction.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
public class JdbcAccountDAO implements AccountDAO{

	@Autowired
	SimpleJdbcTemplate simpleJdbcTemp;
	@Autowired
	DataSourceTransactionManager txManager;
	
	public void addAccount(Account a) {
			String sql="insert into accounts values(?,?,?)";
			simpleJdbcTemp.update(sql, a.getAccno(),a.getAname(),a.getBal());
	}

	public double deposit(int accno, double amt) {
			String sql1="select bal from accounts where accno=?";
			Integer i=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, accno);
			double bal=i.intValue()+amt;
			String sql2="update accounts set bal=? where accno=?";
			simpleJdbcTemp.update(sql2, bal,accno);
			
		return bal;
	}

	public double withdraw(int accno, double amt) throws InsufficientFundsException  {
		double bal=0.0;
		String sql1="select bal from accounts where accno=?";
		Integer i=(Integer)simpleJdbcTemp.queryForObject(sql1, Integer.class, accno);
		if(i.intValue()-amt>=5000){
		bal=i.intValue()-amt;
		String sql2="update accounts set bal=? where accno=?";
		simpleJdbcTemp.update(sql2, bal,accno);
		}
		else{
			throw new InsufficientFundsException();
		}			
		return bal;
	}


	public void transferFunds(int saccno, int daccno, double amt) throws InsufficientFundsException {
		double dbal=0.0;
		double sbal=0.0;
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
		
	}

}
