package com.jlcindia.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab23Client {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory factory=AHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			/*
			 * client codes
			 */
			//Add Customer and Orders
			/*Order o1=new Order(2,new Double(200.0),"New",new Date());
			session.save(o1);	
			Order o2=new Order(3,new Double(300.0),"New",new Date());
			session.save(o2);
			
			Customer cust=new Customer("Saurabh","sau@jlc",new Date(),new Long(9999));
			session.save(cust);
			/*
			Set<Order> ods=new HashSet<Order>();
			ods.add(o1);
			ods.add(o2);
			
			cust.setOrders(ods);
			*/
			//2.Assosiate Orders to Customer
			Customer cust=(Customer)session.load(Customer.class, 1);
			Order o1=(Order)session.load(Order.class, 1);
			Order o2=(Order)session.load(Order.class, 2);
			Set<Order> ods=new HashSet<Order>();
			ods.add(o1);
			ods.add(o2);
			
			cust.setOrders(ods);
			
			Order o=new Order(1,new Double(300.0),"New",new Date());
			session.save(o);
			Customer custo=(Customer)session.load(Customer.class, 1);
			o.setCustomer(custo);
			
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
