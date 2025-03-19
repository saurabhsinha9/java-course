package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab11Client {
	static{
		System.out.println("Lab11Client SB");
	}
	
	public Lab11Client() {
		System.out.println("Lab11Client DC");
	}

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			//1.adding the student
			Student stu=new Student("Saurabh", "Gaya", "Enabled", 15000.0);
			stu.setSid(101);
			Integer in=(Integer) session.save(stu);
			System.out.println(in.intValue());
			
			//2.adding the current student
			CurrentStudent cstu=new CurrentStudent("Raj", "Delhi", "Enabled", 14000.0, "7.30AM", "MK", 2000.0);
			cstu.setSid(201);
			in=(Integer) session.save(cstu);
			System.out.println(in.intValue());
			
			//3.adding the old student
			OldStudent ostu=new OldStudent("Sinha", "Mumbai", "Disabled", 14000.0,"HCL", "ss@hcl", 9);
			ostu.setSid(301);
			in=(Integer) session.save(ostu);
			System.out.println(in.intValue());
			
			//4.adding the regular student
			RegularStudent rstu=new RegularStudent("Singh", "Patna", "Enabled", 15000.0, "7.30AM", "MK", 100, "M.Tech", "75.3", 3);
			rstu.setSid(401);
			in=(Integer) session.save(rstu);
			System.out.println(in.intValue());
			
			//5.adding the weekend student
			WeekendStudent wstu=new WeekendStudent("Dablu", "Blore", "Enabled", 15000.0, "7.30AM", "HSR", 15000.0, "SDSOFT", "d@sd", 9.0);
			wstu.setSid(501);
			in=(Integer) session.save(wstu);
			System.out.println(in.intValue());
			
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
