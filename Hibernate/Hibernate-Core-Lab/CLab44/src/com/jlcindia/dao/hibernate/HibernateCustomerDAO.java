package com.jlcindia.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.util.CHibernateTemplate;
import com.jlcindia.util.CHibernateUtil;


public class HibernateCustomerDAO implements CustomerDAO{

	public int addCustomer(Customer customer) {
		Integer it=(Integer)CHibernateTemplate.saveObject(customer);
		return it.intValue();
	}

	public void updateCustomer(Customer customer) {
		CHibernateTemplate.updateObject(customer);
	}

	public void deleteCustomer(int cid) {
		CHibernateTemplate.deleteObject(Customer.class, cid);
	}

	public Customer getCustomerByCid(int cid) {
		Customer cust=(Customer)CHibernateTemplate.loadObject(Customer.class, cid);
		return cust;
	}

	public Customer getCustomerByEmail(String email) {
		Transaction tx=null;
		Customer cust=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("email", email));
			cust=(Customer)ct.list().get(0);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByEmail"+e);
			tx.rollback();
		}
		return cust;
	}

	public Customer getCustomerByCard(int ccno) {
		Transaction tx=null;
		Customer cust=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cardNo", ccno));
			cust=(Customer)ct.list().get(0);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByCard"+e);
			tx.rollback();
		}
		return cust;
	}

	public List<Customer> getAllCustomers() {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getAllCustomers"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getAllCustomers(int start, int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getAllCustomers"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByCity(String city) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("city", city));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByCity"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByCity(String city, int start, int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("city", city));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByCity"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByName(String name) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cname", name));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByName"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByName(String name, int start, int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cname", name));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByName"+e);
			tx.rollback();
		}
		return customers;

	}

	public List<Customer> getCustomerByCardType(String cardType) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cardType", cardType));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByCardType"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByCardType(String cardType, int start,int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cardType", cardType));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByCardType"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByStatus(String status) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("status", status));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByStatus"+e);
			tx.rollback();
		}
		return customers;

	}

	public List<Customer> getCustomerByStatus(String status, int start,int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("status", status));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByStatus"+e);
			tx.rollback();
		}
		return customers;

	}

	public List<Customer> getCustomerByBal(double bal) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cardBal", bal));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByBal"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomerByBal(double bal, int start, int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct.add(Expression.eq("cardBal", bal));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomerByBal"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct=ct.add(Expression.and(Expression.eq("city", city), Expression.eq("cardType", cardType)));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomers"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType, int start,int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct=ct.add(Expression.and(Expression.eq("city", city), Expression.eq("cardType", cardType)));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomers"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType,String status) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct=ct.add(Expression.and(Expression.and(Expression.eq("city", city), Expression.eq("cardType", cardType)),(Expression.eq("status", status))));
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomers"+e);
			tx.rollback();
		}
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType,String status, int start, int total) {
		Transaction tx=null;
		List<Customer> customers=null;
		try {
			SessionFactory factory=CHibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Criteria ct=session.createCriteria(Customer.class);
			ct=ct.add(Expression.and(Expression.and(Expression.eq("city", city), Expression.eq("cardType", cardType)),(Expression.eq("status", status))));
			ct=ct.setFirstResult(start);
			ct=ct.setMaxResults(total);
			customers=ct.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Error in getCustomers"+e);
			tx.rollback();
		}
		return customers;
	}
}
