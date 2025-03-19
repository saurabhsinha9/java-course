package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
		public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			//1.All Contacts
			/*System.out.println("All Contacts");
			List<Contact> clist1=session.getNamedQuery("JLCAllContacts").list();
			for(Contact c:clist1){
				System.out.println(c);
			}
			*/
			
			//2.All Active Contacts
			/*System.out.println("All  Active Contacts");
			List<Contact> clist2=session.getNamedQuery("JLCActiveContacts").setString("st", "Active").list();
			for(Contact c:clist2){
				System.out.println(c);
			}
			*/
			
			//3.Contacts By Email
			/*List<String> elist=session.getNamedQuery("EmailsOfAllContacts").list();
			for(String str:elist){
				System.out.println(str);
			}*/
			
			//4.Emails,PhonesAndStatusOfAllContacts
			List<Object[]> epslist=session.getNamedQuery("EmailsPhonesAndStatusOfAllContacts").list();
			for(Object obj[]:epslist){
				for(Object o:obj){
				System.out.println(o);
				}
			}
			System.out.println("");
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
