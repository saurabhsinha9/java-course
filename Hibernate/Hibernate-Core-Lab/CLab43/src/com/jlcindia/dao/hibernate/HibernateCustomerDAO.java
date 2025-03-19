package com.jlcindia.dao.hibernate;

import java.util.List;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.util.CHibernateTemplate;


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
		String hql="from Customer c where c.email=?";
		Customer cust=(Customer)CHibernateTemplate.findObject(hql,email);
		return cust;
	}

	public Customer getCustomerByCard(int ccno) {
		String hql="from Customer c where c.cardNo=?";
		Customer cust=(Customer)CHibernateTemplate.findObject(hql,ccno);
		return cust;
	}

	public List<Customer> getAllCustomers() {
		String hql="from Customer c";
		List<Customer> customers=CHibernateTemplate.findList(hql);
		return customers;
	}

	public List<Customer> getAllCustomers(int start, int total) {
		String hql="from Customer c";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total);
		return customers;
	}

	public List<Customer> getCustomerByCity(String city) {
		String hql="from Customer c where c.city=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,city);
		return customers;
	}

	public List<Customer> getCustomerByCity(String city, int start, int total) {
		String hql="from Customer c where c.city=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,city);
		return customers;
	}

	public List<Customer> getCustomerByName(String name) {
		String hql="from Customer c where c.cname=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,name);
		return customers;
	}

	public List<Customer> getCustomerByName(String name, int start, int total) {
		String hql="from Customer c where c.cname=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,name);
		return customers;
	}

	public List<Customer> getCustomerByCardType(String cardType) {
		String hql="from Customer c where c.cardType=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,cardType);
		return customers;
	}

	public List<Customer> getCustomerByCardType(String cardType, int start,int total) {
		String hql="from Customer c where c.cardType=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,cardType);
		return customers;
	}

	public List<Customer> getCustomerByStatus(String status) {
		String hql="from Customer c where c.status=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,status);
		return customers;
	}

	public List<Customer> getCustomerByStatus(String status, int start,int total) {
		String hql="from Customer c where c.status=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,status);
		return customers;
	}

	public List<Customer> getCustomerByBal(double bal) {
		String hql="from Customer c where c.cardBal=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,bal);
		return customers;
	}

	public List<Customer> getCustomerByBal(double bal, int start, int total) {
		String hql="from Customer c where c.cardBal=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,bal);
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType) {
		String hql="from Customer c where c.city=? and c.cardType=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,city,cardType);
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType, int start,int total) {
		String hql="from Customer c where c.city=? and c.cardType=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,city,cardType);
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType,String status) {
		String hql="from Customer c where c.city=? and c.cardType=? and c.status=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,city,cardType,status);
		return customers;
	}

	public List<Customer> getCustomers(String city, String cardType,String status, int start, int total) {
		String hql="from Customer c where c.city=? and c.cardType=? and c.status=?";
		List<Customer> customers=CHibernateTemplate.findList(hql,start,total,city,cardType,status);
		return customers;
	}
}
