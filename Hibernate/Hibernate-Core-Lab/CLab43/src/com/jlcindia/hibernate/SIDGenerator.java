package com.jlcindia.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SIDGenerator implements IdentifierGenerator{
	

	public Serializable generate(SessionImplementor si, Object obj)
			throws HibernateException {
		String sid="JLC-001";
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query q1=session.createQuery("from Student stu");
			int size=q1.list().size();
			if(size!=0){
				Query query=session.createQuery("select max(stu.sid) from Student stu");
				List list=query.list();
				System.out.println(list.size());
				Object o=list.get(0);
				System.out.println(o);
				String id="";
				id=o.toString();
				String p2=id.substring(4);
				int x=Integer.parseInt(p2);
				x=x+1;
				if(x<=9){   sid="JLC-00"+x;   }
				else if(x<=99){   sid="JLC-0"+x;   }
				else if(x<=999){   sid="JLC-"+x;  }
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		return sid;
	}
}
