package com.jlcindia.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.jlcindia.bean.Candidate;
import com.jlcindia.dao.CandidateDAO;
import com.jlcindia.util.CHibernateTemplate;
import com.jlcindia.util.CHibernateUtil;

public class HibernateCandidateDAO implements CandidateDAO{

	public void addCandidate(Candidate can) {
		CHibernateTemplate.saveObject(can);
	}

	public void deleteCandidate(int cid) {
		CHibernateTemplate.deleteObject(Candidate.class, cid);
	}

	public List<Candidate> getAllCandidate() {
		List<Candidate> cans=new ArrayList<Candidate>();
		Transaction tx=null;
		try {
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			String HQL="from Candidate can";
			Query q=session.createQuery(HQL);
			cans=q.list();
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getAllCandidate"+e);
			e.printStackTrace();
		}
		return cans;
	}

	public Candidate getCandidateByCid(int cid) {
		Candidate can=(Candidate)CHibernateTemplate.loadObject(Candidate.class, cid);
		return can;
	}

	public void updateCandidate(Candidate can) {
		CHibernateTemplate.updateObject(can);
	}

	
}
