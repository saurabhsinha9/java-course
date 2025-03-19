package com.jlcindia.util;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.bean.Customer;


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
			System.out.println("Error in saveObject"+e);
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
			System.out.println("Error in updateObject"+e);
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
			System.out.println("Error in deleteObject"+e);
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
			System.out.println("Error in loadObject"+e);
			tx.rollback();
		}
		return o;
	}

	public static List findList(String hql, Object...objects) {
		Transaction tx=null;
		List list=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query q=session.createQuery(hql);
			for(int i=0;i<objects.length;i++){
				q=q.setParameter(i, objects[i]);
			}
			list=q.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in findList"+e);
			tx.rollback();
			e.printStackTrace();
		}
		return list;
	}

	public static List findList(String hql, int start, int total, Object...objects) {
		Transaction tx=null;
		List list=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query q=session.createQuery(hql);
			q=q.setFirstResult(start);
			q=q.setMaxResults(total);
			for(int i=0;i<objects.length;i++){
				q=q.setParameter(i, objects[i]);
			}
			list=q.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in findList"+e);
			tx.rollback();
			e.printStackTrace();
		}
		return list;	
	}

	public static Object findObject(String hql, Object...objects) {
		Object o=null;
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query q=session.createQuery(hql);
			for(int i=0;i<objects.length;i++){
				q=q.setParameter(i, objects[i]);
			}
			o=q.list().get(0);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in findObject"+e);
			tx.rollback();
		}
		return o;
	}
	
}
