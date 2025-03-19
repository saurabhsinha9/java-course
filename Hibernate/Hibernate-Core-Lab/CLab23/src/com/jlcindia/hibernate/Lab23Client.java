package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab23Client {
	
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
			/*Student st=(Student)session.load(Student.class, 2);
			Address ad=(Address)session.load(Address.class, 2);
			st.setAddress(ad);
			*/
			
			//3.Loading Student & //3.Loading Address
			Address ad=(Address)session.load(Address.class, 2);
			System.out.println(ad.getAdid()+"\t"+ad.getStreet()+"\t"+ad.getCity()+"\t"+ad.getState());
			Student st=ad.getStudent();
			System.out.println(st.getSid()+"\t"+st.getSname()+"\t"+st.getEmail()+"\t"+st.getPhone());
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
