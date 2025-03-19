package com.jlcindia.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bookstore.dao.HibernateUtil;


public class HibernateTemplate {
	
	public static Object saveObject(Object obj){
		Object id=null;
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			id=session.save(obj);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in saveObject"+e);
			tx.rollback();
		}
		return id;
	}
	
	public static void updateObject(Object obj){
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in updateObject"+e);
			tx.rollback();
		}
	}
	
	public static void deleteObject(Class cls,Serializable s){
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Object o=session.load(cls, s);
			session.delete(o);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in deleteObject"+e);
			tx.rollback();
		}
	}

	public static Object loadObject(Class cls,Serializable s){
		Object o=null;
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			o=session.load(cls, s);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in loadObject"+e);
			tx.rollback();
		}
		return o;
	}

}
