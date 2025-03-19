package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lab1Client {
	static{
		System.out.println("Lab1Client SB");
	}
	
	public Lab1Client() {
		System.out.println("Lab1Client DC");
	}

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			Configuration cfg=new Configuration();
			cfg=cfg.configure();
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Customer cust=new Customer("Saurabh", "saurabh@jlc", 9999, "Blore");
			tx=session.beginTransaction();
			Integer in=(Integer) session.save(cust);
			int cid=in.intValue();
			System.out.println(cid);
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
