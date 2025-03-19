package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			/*Customer cu=new Customer("Saurabh1", "sau@gmail", "9999", "BLORE", "InActive");
			session.save(cu);*/
			//1.show All Customers
			System.out.println("All Customers");
			displayAllCustomers(session);
			
			//3.show Activated Customer
			Filter filter=session.enableFilter("StatusFilter");
			filter.setParameter("statusParam", "Active");
			System.out.println("Activated Customer");
			displayAllCustomers(session);
			
			//3.show NonActivated Customer
			filter.setParameter("statusParam", "InActive");
			System.out.println("Non Activated Customer");
			displayAllCustomers(session);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

	private static void displayAllCustomers(Session session) {
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from Customer c");
		List<Customer> customers=query.list();
		for(Customer c:customers){
			System.out.println(c);
		}
		tx.commit();
	}

}
