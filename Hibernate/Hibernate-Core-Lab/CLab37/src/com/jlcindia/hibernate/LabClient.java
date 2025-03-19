package com.jlcindia.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabClient {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			SID id=SIDGenerator.getNextSId("31");
			Student stu=new Student(id, "Saurabh Sinha", "sau@jlc", "88888");
			session.save(stu);
			Student stu1=(Student)session.load(Student.class, new SID("30", "015"));
			System.out.println(stu1.getStudentId().getBid());
			System.out.println(stu1.getStudentId().getSid());
			System.out.println(stu1.getSname()+"\t"+stu1.getEmail()+"\t"+stu1.getPhone());
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
