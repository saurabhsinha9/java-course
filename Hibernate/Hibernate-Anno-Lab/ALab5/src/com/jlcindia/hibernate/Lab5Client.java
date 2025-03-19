package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5Client {
	static{
		System.out.println("Lab5Client SB");
	}
	
	public Lab5Client() {
		System.out.println("Lab5Client DC");
	}

	public static void main(String[] args) {
		Transaction tx=null;
		String [] cou={"JDBC","JAVA","JSP","EJB"};
		List<String> em=new ArrayList<String>();
		em.add("aa@jlc");
		em.add("bb@jlc");
		em.add("cc@jlc");
		em.add("dd@jlc");
		em.add("ee@jlc");
		em.add("ff@jlc");
		List<Integer> mks=new ArrayList<Integer>();
		mks.add(new Integer(75));
		mks.add(new Integer(85));
		mks.add(new Integer(70));
		mks.add(new Integer(65));
		Set<Long> phs=new HashSet<Long>();
		phs.add(new Long(99999));
		phs.add(new Long(88888));
		phs.add(new Long(77777));
		phs.add(new Long(66666));
		phs.add(new Long(55555));
		phs.add(new Long(44444));
		Map<String,Long> ref=new HashMap<String,Long>();
		ref.put("aaaa", new Long(99999));
		ref.put("bbbb", new Long(88888));
		ref.put("cccc", new Long(99999));
		ref.put("dddd", new Long(77777));
		ref.put("eeee", new Long(66666));
		ref.put("aaaa", new Long(66666));
		ref.put("dddd", new Long(55555));
		ref.put("ffff", new Long(44444));
		
		
		try {
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			Student stu=new Student("Saurabh","13-07-1989","B.Tech",cou, em, mks,phs, ref);
			tx=session.beginTransaction();
			Integer in=(Integer) session.save(stu);
			int sid=in.intValue();
			System.out.println(sid);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
