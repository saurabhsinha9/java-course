package com.jlcindia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.hibernate.User;
import com.jlcindia.to.UserTO;

public class HibernateUserDAO implements UserDAO {

	public UserTO registerUser(UserTO uto) {
		User user=new User(uto.getFullname(), uto.getEmail(), uto.getUsername(), uto.getPassword());
		Integer it=(Integer)HibernateTemplate.saveObject(user);
		uto.setUserId(it.intValue());
		return uto;
	}

	public UserTO verifyUser(String username, String password) {
		UserTO uto=null;
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from User user where user.username=? and user.password=?");
			query.setParameter(0, username);
			query.setParameter(1, password);
			List<User> users=query.list();
			if(users.size()>0){
				uto=new UserTO();
				User user=(User)users.get(0);
				uto.setUserId(user.getUserId());
				uto.setFullname(user.getFullname());
				uto.setEmail(user.getEmail());
				uto.setUsername(user.getUsername());
				uto.setPassword(user.getPassword());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return uto;
	}
}
