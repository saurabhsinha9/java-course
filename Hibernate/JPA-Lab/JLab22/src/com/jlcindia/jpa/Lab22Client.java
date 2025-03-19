package com.jlcindia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Lab22Client {
	
	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			//1.saving student and address at inserting record
			/*Student stu=new Student("saurabh","saurabh@jlc","9999");
			manager.persist(stu);
			Address add=new Address("HMT","BLORE","KA");
			manager.persist(add);
			stu.setAddress(add);//assosiation mapping
			*/
			
			/*Student stu=new Student("Dablu","dablu@jlc","9999");
			Address add=new Address("MYLN","BLORE","KA");
			manager.persist(stu);
			manager.persist(add);
			*/
			//2.Assosiate address to student by loading the record
			/*Student st=(Student)manager.find(Student.class, 8);
			Address ad=(Address)manager.find(Address.class, 8);
			st.setAddress(ad);
			*/
			//3.Loading Student
			Student st=(Student)manager.find(Student.class, 8);
			System.out.println(st);
			//3.Loading Address
			Address ad=(Address)manager.find(Address.class, 8);
			System.out.println(ad);
			
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
