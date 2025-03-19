package com.jlcindia.util;


import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class CHibernateTemplate {
	
	public static Object saveObject(Object obj){
		Object id=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			id=session.save(obj);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in saveObject"+e);
			tx.rollback();
		}
		return id;
	}
	
	public static void updateObject(Object obj){
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in deleteObject"+e);
			tx.rollback();
		}
	}
	
	public static void deleteObject(Class cls,Serializable s){
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Object o=session.load(cls, s);
			session.delete(o);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in deleteObject"+e);
			tx.rollback();
		}
	}

	public static Object loadObject(Class cls,Serializable s){
		Object o=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			o=session.load(cls, s);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Eroor in loadObject"+e);
			tx.rollback();
		}
		return o;
	}
	
}
