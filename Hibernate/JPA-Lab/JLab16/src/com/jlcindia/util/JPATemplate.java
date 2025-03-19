package com.jlcindia.util;


import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class JPATemplate {
	
	public static void saveObject(Object obj){
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			manager.persist(obj);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Eroor in saveObject"+e);
			tx.rollback();
		}
	}
	
	public static void updateObject(Object obj){
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			manager.merge(obj);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Eroor in updateObject"+e);
			tx.rollback();
		}
	}
	
	public static void deleteObject(Class cls,Serializable s){
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			Object o=manager.find(cls, s);
			manager.remove(o);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Eroor in deleteObject"+e);
			tx.rollback();
		}
	}

	public static Object loadObject(Class cls,Serializable s){
		Object o=null;
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			o=manager.find(cls, s);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Eroor in loadObject"+e);
			tx.rollback();
		}
		return o;
	}
	
}
