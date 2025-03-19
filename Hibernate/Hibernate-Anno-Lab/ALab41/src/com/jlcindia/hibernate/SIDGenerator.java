package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SIDGenerator{
	public static SID getNextSId(String bid){
		SID sid=null;
		Transaction tx=null;
		try {
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			String HQL="from Student stu where stu.studentId.bid=?";
			Query q1=session.createQuery(HQL);
			q1.setString(0, bid);
			List l1=q1.list();
			if(l1.size()==0){
				sid=new SID(bid,"001");
			}else{
				String hql="select max(stu.studentId.sid) from Student stu where stu.studentId.bid=?";
				Query q=session.createQuery(hql);
				q.setString(0, bid);
				String id=q.list().get(0).toString();
				int x=Integer.parseInt(id);
				x=x+1;
				if(x<=9){
					sid=new SID(bid,"00"+x);
				}else if(x<=99){
					sid=new SID(bid,"0"+x);
				}else{
					sid=new SID(bid,""+x);
				}
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
		return sid;
	}
}
