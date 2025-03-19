package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
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
			System.out.println("All Contacts");
			Query q1=session.getNamedQuery("getAllJLCContacts_SP");
			List<Contact> clist1=q1.list();
			for (Contact contact : clist1) {
				System.out.println(contact);
			}
			
			//1.All Active Contacts
			/*System.out.println("All Active Contacts");
			Query q2=session.getNamedQuery("GetAllJLCActiveContacts_SP");
			q2=q2.setString("st", "Active");
			List<Contact> clist2=q2.list();
			for (Contact contact : clist2) {
				System.out.println(contact);
			}
			*/
			
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
