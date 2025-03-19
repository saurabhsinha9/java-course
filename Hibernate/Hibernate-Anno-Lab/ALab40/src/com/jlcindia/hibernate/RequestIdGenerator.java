package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RequestIdGenerator {
	public static String getNextRequestId(){
		Transaction tx=null;
		String nextRid=null;
		try {
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			String hql1="from Request req";
			Query q1=session.createQuery(hql1);
			List l1=q1.list();
			if(l1.size()==0){
				nextRid="R-1001";
				System.out.println("R-1001");
			}else{
				System.out.println("else..");
				String hql="select max(reqId) from Request req";
				Query q=session.createQuery(hql);
				String id=q.list().get(0).toString();
				System.out.println(id);
				String p2=id.substring(2);
				int rid=Integer.parseInt(p2);
				rid=rid+1;
				nextRid="R-"+rid;	
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
		System.out.println(nextRid);
		return nextRid;
	}
}
