package com.jlcindia.jpa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Lab26Client {
	
	public static void main(String[] args) {
		EntityTransaction tx=null;
		try {
			EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
			EntityManager manager=factory.createEntityManager();
			tx=manager.getTransaction();
			tx.begin();
			/*
			 * client codes
			 */
			//Add Customer and Orders
			/*Order o1=new Order(2,new Double(200.0),"New",new Date());
			manager.persist(o1);	
			Order o2=new Order(3,new Double(300.0),"New",new Date());
			manager.persist(o2);
			
			Customer cust=new Customer("Saurabh","sau@jlc",new Date(),new Long(9999));
			manager.persist(cust);
			
			Set<Order> ods=new HashSet<Order>();
			ods.add(o1);
			ods.add(o2);
			
			cust.setOrders(ods);
			*/
			//2.Assosiate Orders to Customer
			Customer cust=(Customer)manager.find(Customer.class, 1);
			Order o1=(Order)manager.find(Order.class, 1);
			Order o2=(Order)manager.find(Order.class, 2);
			Set<Order> ods=new HashSet<Order>();
			ods.add(o1);
			ods.add(o2);
			
			cust.setOrders(ods);
			
			Order o=new Order(1,new Double(300.0),"New",new Date());
			manager.persist(o);
			Customer custo=(Customer)manager.find(Customer.class, 1);
			o.setCustomer(custo);
		
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
