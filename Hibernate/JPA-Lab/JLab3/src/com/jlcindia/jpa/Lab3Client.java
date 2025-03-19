package com.jlcindia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lab3Client {
	static{
		System.out.println("Lab3Client SB");
	}
	
	public Lab3Client() {
		System.out.println("Lab3Client DC");
	}

	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			Customer cust=new Customer("Saurabh", "saurabh@jlc", 9999, "Blore");
			tx=manager.getTransaction();
			tx.begin();
			manager.persist(cust);
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
