package com.jlcindia.hibernate;

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
			tx=session.beginTransaction();
			Request req=new Request(RequestIdGenerator.getNextRequestId(),"C-101", "Loss Of Card", new Date());
			String st=(String) session.save(req);
			System.out.println(st);
			Request re=(Request)session.load(Request.class, "R-1001");
			re.setMessage("ok we will issue new one");
			re.setReqDate(new Date());
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
