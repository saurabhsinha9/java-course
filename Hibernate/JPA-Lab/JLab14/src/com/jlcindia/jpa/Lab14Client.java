package com.jlcindia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Lab14Client {
	static{
		System.out.println("Lab12Client SB");
	}
	
	public Lab14Client() {
		System.out.println("Lab12Client DC");
	}

	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			//1.adding the student
			Student stu=new Student("Saurabh", "Gaya", "Enabled", 15000.0);
			stu.setSid(101);
			manager.persist(stu);
			
			//2.adding the current student
			CurrentStudent cstu=new CurrentStudent("Raj", "Delhi", "Enabled", 14000.0, "7.30AM", "MK", 2000.0);
			cstu.setSid(201);
			manager.persist(cstu);
			
			//3.adding the old student
			OldStudent ostu=new OldStudent("Sinha", "Mumbai", "Disabled", 14000.0,"HCL", "ss@hcl", 9);
			ostu.setSid(301);
			manager.persist(ostu);
			
			//4.adding the regular student
			RegularStudent rstu=new RegularStudent("Singh", "Patna", "Enabled", 15000.0, "7.30AM", "MK", 100, "M.Tech", "75.3", 3);
			rstu.setSid(401);
			manager.persist(rstu);
			
			//5.adding the weekend student
			WeekendStudent wstu=new WeekendStudent("Dablu", "Blore", "Enabled", 15000.0, "7.30AM", "HSR", 15000.0, "SDSOFT", "d@sd", 9.0);
			wstu.setSid(501);
			manager.persist(wstu);
			
			tx.commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
