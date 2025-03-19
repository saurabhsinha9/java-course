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
			
			/*Contact c1=new Contact("Saurabh", "Sinha", "sau@jlc", 9999, "10/10/10", "Active");
			session.save(c1);
			Contact c2=new Contact("Gaurav", "Singh", "gau@jlc", 8888, "11/11/10", "DeActive");
			session.save(c2);
			Contact c3=new Contact("Mika", "Ray", "mik@jlc", 7777, "12/10/10", "Active");
			session.save(c3);
			Contact c4=new Contact("Dika", "Singh", "dik@jlc", 6666, "11/12/10", "DeActive");
			session.save(c4);
			Contact c5=new Contact("Fika", "JHA", "fik@jlc", 5555, "10/10/12", "Active");
			session.save(c5);
			Contact c6=new Contact("Pika", "Singh", "pik@jlc", 2222, "11/12/12", "Active");
			session.save(c6);*/
			
			//1.All Contacts
			/*String SQL1="select {cts.*} from contacts cts";
			SQLQuery sq1=session.createSQLQuery(SQL1);
			List<Contact> clist1=sq1.addEntity("cts", Contact.class).list();
			for(Contact c:clist1){
				System.out.println(c);
			}*/
			
			//2.Contacts By Email
			/*String SQL2="select {cts.*} from contacts cts where cts.email=?";
			SQLQuery sq2=session.createSQLQuery(SQL2);
			sq2.setString(0, "sau@jlc");
			List<Contact> clist2=sq2.addEntity("cts", Contact.class).list();
			for(Contact c:clist2){
				System.out.println(c);
			}*/
			
			//3.Contacts By Status
			String SQL3="select {cts.*} from contacts cts where cts.status=:sts";
			SQLQuery sq3=session.createSQLQuery(SQL3);
			sq3.setString("sts", "Active");
			List<Contact> clist3=sq3.addEntity("cts", Contact.class).list();
			for(Contact c:clist3){
				System.out.println(c);
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
