package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10Client {
	static{
		System.out.println("Lab10Client SB");
	}
	
	public Lab10Client() {
		System.out.println("Lab10Client DC");
	}

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			//1.adding the student
			Student stu=new Student("Saurabh", "Gaya", "Enabled", 15000.0);
			Integer in=(Integer) session.save(stu);
			System.out.println(in.intValue());
			
			//2.adding the current student
			CurrentStudent cstu=new CurrentStudent("Raj", "Delhi", "Enabled", 14000.0, "7.30AM", "MK", 2000.0);
			in=(Integer) session.save(cstu);
			System.out.println(in.intValue());
			
			//3.adding the old student
			OldStudent ostu=new OldStudent("Sinha", "Mumbai", "Disabled", 14000.0,"HCL", "ss@hcl", 9);
			in=(Integer) session.save(ostu);
			System.out.println(in.intValue());
			
			//4.adding the regular student
			RegularStudent rstu=new RegularStudent("Singh", "Patna", "Enabled", 15000.0, "7.30AM", "MK", 100, "M.Tech", "75.3", 3);
			in=(Integer) session.save(rstu);
			System.out.println(in.intValue());
			
			//5.adding the weekend student
			WeekendStudent wstu=new WeekendStudent("Dablu", "Blore", "Enabled", 15000.0, "7.30AM", "HSR", 15000.0, "SDSOFT", "d@sd", 9.0);
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
