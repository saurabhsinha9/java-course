package com.jlcindia.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jlcindia.hibernate.Category;
import com.jlcindia.hibernate.User;
import com.jlcindia.to.QueryTO;
import com.jlcindia.to.UserTO;

public class HibernateQueryDAO implements QueryDAO {

	public List<String> getAllCategories() {
		List<String> list=new ArrayList<String>();
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Category cat");
			Iterator<Category> it=query.list().iterator();
			while(it.hasNext()){
				Category cat=it.next();
				list.add(cat.getCatName());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return list;
	}

	public List<QueryTO> getQueries(String catName, int start, int total) {
		List<QueryTO> list=new ArrayList<QueryTO>();
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Query q where q.catName=?");
			query.setString(0, catName);
			query.setFirstResult(start);
			query.setMaxResults(total);
			List<com.jlcindia.hibernate.Query> l=query.list();
			Iterator<com.jlcindia.hibernate.Query> it=l.iterator();
			while(it.hasNext()){
				com.jlcindia.hibernate.Query qu=it.next();
				QueryTO qto=new QueryTO();
				qto.setQueryId(qu.getQueryId());
				qto.setSubject(qu.getSubject());
				qto.setAuthor(qu.getAuthor());
				qto.setCatName(qu.getCatName());
				qto.setPostDate(qu.getPostDate());
				qto.setDescription(qu.getDescription());
				list.add(qto);
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return list;
	}

	public int getTotalQueries(String catName) {
		int size=0;
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from Query q where q.catName=?");
			query.setString(0, catName);
			size=query.list().size();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return size;
	}

	public int postQuery(QueryTO qto) {
		int x=0;
		com.jlcindia.hibernate.Query query=new com.jlcindia.hibernate.Query(qto.getSubject(), qto.getAuthor(), qto.getPostDate(), qto.getCatName(), qto.getDescription());
		Integer i=(Integer)HibernateTemplate.saveObject(query);
		x=i.intValue();
		return x;
	}

	public void updateQuery(QueryTO qto) {
		com.jlcindia.hibernate.Query query=new com.jlcindia.hibernate.Query(qto.getSubject(), qto.getAuthor(), qto.getPostDate(), qto.getCatName(), qto.getDescription());
		query.setQueryId(qto.getQueryId());
		HibernateTemplate.updateObject(query);
	}

}
