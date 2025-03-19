package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab20Client {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			//1.saving student and address at inserting record
			/*Student stu=new Student("saurabh","saurabh@jlc","9999");
			session.save(stu);
			Address add=new Address("HMT","BLORE","KA");
			session.save(add);
			stu.setAddress(add);//assosiation mapping
			*/
			/*Student stu=new Student("Dablu","dablu@jlc","9999");
			Address add=new Address("MYLN","BLORE","KA");
			session.save(stu);
			session.save(add);
			*/
			//2.Assosiate address to student by loading the record
			/*Student st=(Student)session.load(Student.class, 5);
			Address ad=(Address)session.load(Address.class, 5);
			st.setAddress(ad);
			*/
			//3.Loading Student
			Student st=(Student)session.load(Student.class, 1);
			System.out.println(st);
			//3.Loading Address
			Address ad=(Address)session.load(Address.class, 1);
			System.out.println(ad);
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
