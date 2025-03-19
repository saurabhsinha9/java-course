package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabClient {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Student stu=new Student("Saurabh Kr. Sinha", "saurabh@jlc", "999999");
			session.save(stu);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}
}
