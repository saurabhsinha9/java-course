package com.jlcindia.hibernate;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabClient {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			Customer cust=new Customer("Saurabh", "saurabh@jlc", 9999, "Blore",new Date());
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
