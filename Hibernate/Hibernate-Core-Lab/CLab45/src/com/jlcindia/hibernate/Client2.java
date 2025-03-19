package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2 {
		public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
		
			//1.All Contacts
			/*String SQL1="select * from contacts cts";
			SQLQuery sq=session.createSQLQuery(SQL1);
			sq=sq.addScalar("contactId", Hibernate.INTEGER);
			sq=sq.addScalar("firstName", Hibernate.STRING);
			sq=sq.addScalar("lastName", Hibernate.STRING);
			sq=sq.addScalar("email", Hibernate.STRING);
			sq=sq.addScalar("phone", Hibernate.LONG);
			sq=sq.addScalar("dob", Hibernate.STRING);
			sq=sq.addScalar("status", Hibernate.STRING);
			List<Object[]> clist=sq.list();
			for(Object obj[]:clist){
				for(Object o:obj){
				System.out.println(o+"\t");
				}
				System.out.println("");
			}*/
			
			
			//2.Contacts By Email
			String SQL2="select cts.email from contacts cts";
			SQLQuery sq2=session.createSQLQuery(SQL2);
			List<String> ems=sq2.addScalar("email", Hibernate.STRING).list();
			for(String str:ems){
				System.out.println(str);
			}
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
