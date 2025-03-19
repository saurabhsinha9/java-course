package com.jlcindia.dao.hibernate;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.util.CHibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{

	public int addCustomer(CustomerTO cto) {
		Customer cust=new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		Integer it=(Integer)CHibernateTemplate.saveObject(cust);
		return it.intValue();
	}

	public void deleteCustomer(int cid) {
		CHibernateTemplate.deleteObject(Customer.class, cid);
	}

	public CustomerTO getCustomerByCid(int cid) {
		Customer cust=(Customer)CHibernateTemplate.loadObject(Customer.class, cid);
		CustomerTO cto=new CustomerTO(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());
		return cto;
	}

	public void updateCustomer(CustomerTO cto) {
		Customer cust=new Customer();
		cust.setCid(cto.getCid());
		cust.setCname(cto.getCname());
		cust.setEmail(cto.getEmail());
		cust.setPhone(cto.getPhone());
		cust.setStatus(cto.getStatus());
		cust.setCity(cto.getCity());
		CHibernateTemplate.updateObject(cust);
	}

}
