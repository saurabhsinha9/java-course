package com.jlcindia.jpa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Lab31Client {
	
	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			
			/*
			 * client codes
			 */
			//1.Add Customers and Account
			Customer cust1=new Customer("Saurabh","sau@jlc",new Date(),new Long(999));
			manager.persist(cust1);
			Customer cust2=new Customer("Sri","sri@jlc",new Date(),new Long(999));
			manager.persist(cust2);
			
			Account a1=new Account("SA",1000.0);
			manager.persist(a1);
			Account a2=new Account("CA",5000.0);
			manager.persist(a2);
			Account a3=new Account("SA",2000.0);
			manager.persist(a3);
			
			Set<Account> acc=new HashSet<Account>();
			acc.add(a1);
			acc.add(a2);
			acc.add(a3);
			cust1.setAccounts(acc);
			
			Set<Account> acc1=new HashSet<Account>();
			acc1.add(a2);
			cust2.setAccounts(acc1);
			
			Account a=new Account("DA",2000.0);
			manager.persist(a);
			Customer cust=(Customer)manager.find(Customer.class, 2);
			Set<Account> accs=new HashSet<Account>();
			accs.add(a);
			cust.setAccounts(accs);
			
		
			tx.commit();
			manager.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
