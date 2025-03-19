package com.jlcindia.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.dao.UserDAO;
import com.jlcindia.to.UserTO;

public class HibernateUserDAO implements UserDAO {

	public int registerUser(UserTO uto) {
		int x=0;
		User user=new User(uto.getFname(),uto.getLname(),uto.getEmail(),uto.getUsername(),uto.getPassword());
		Integer i=(Integer)HibernateTemplate.saveObject(user);
		x=i.intValue();
		return x;
	}

	public int verifyUser(String un, String pw) {
		int x=0;
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from User user where user.username=:un and user.password=:pw");
			query.setParameter("un", un);
			query.setParameter("pw", pw);
			x=query.list().size();
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

}
