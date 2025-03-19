package com.jlcindia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class JPATemplate {

	public void persist(Object object) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			manager.persist(object);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in persist"+e);
			tx.rollback();
		}
	}

	public Object find(Class cls, Integer integer) {
		Object o=null;
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			o=manager.find(cls, integer);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in find"+e);
			tx.rollback();
		}
		return o;
	}

	public void remove(Object object) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			manager.remove(object);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in remove"+e);
			tx.rollback();
		}
	}

	public void merge(Object object) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			manager.merge(object);
			tx.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Error in merge"+e);
			tx.rollback();
		}
	}
}
