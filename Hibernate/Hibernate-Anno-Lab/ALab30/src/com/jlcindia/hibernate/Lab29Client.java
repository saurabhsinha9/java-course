package com.jlcindia.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab29Client {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			/*
			 * client codes
			 */
			//1.Add Customers and Account
			Customer cust1=new Customer("Saurabh","sau@jlc",new Date(),new Long(999));
			session.save(cust1);
			Customer cust2=new Customer("Sri","sri@jlc",new Date(),new Long(999));
			session.save(cust2);
			
			Account a1=new Account("SA",1000.0);
			session.save(a1);
			Account a2=new Account("CA",5000.0);
			session.save(a2);
			Account a3=new Account("SA",2000.0);
			session.save(a3);
			
			Set<Account> acc=new HashSet<Account>();
			acc.add(a1);
			acc.add(a2);
			acc.add(a3);
			cust1.setAccounts(acc);
			
			Set<Account> acc1=new HashSet<Account>();
			acc1.add(a2);
			cust2.setAccounts(acc1);
			
			Account a=new Account("DA",2000.0);
			session.save(a);
			Customer cust=(Customer)session.load(Customer.class, 2);
			Set<Account> accs=new HashSet<Account>();
			accs.add(a);
			cust.setAccounts(accs);
			
			tx.commit();	
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
