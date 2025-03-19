package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
		public static void main(String[] args) {
		Transaction tx=null;
		List<Contact> contacts=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Query q=session.createQuery("from Contact c");
			q.setCacheable(true);
			contacts=q.list();
			for(Contact c:contacts){
				System.out.println(c);
			}
			
			Criteria ct=session.createCriteria(Contact.class);
			ct.setCacheable(true);
			contacts=ct.list();
			for(Contact c:contacts){
				System.out.println(c);
			}
			tx.commit();
			Thread.currentThread().sleep(5000);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
