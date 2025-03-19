package com.jlcindia.dao.jpa;

import com.jlcindia.bean.Customer;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.util.JPATemplate;

public class JPACustomerDAO implements CustomerDAO{

	public void addCustomer(Customer cust) {
		JPATemplate.saveObject(cust);
	}

	public void deleteCustomer(int cid) {
		JPATemplate.deleteObject(Customer.class, cid);
	}

	public CustomerTO getCustomerByCid(int cid) {
		Customer cust=(Customer)JPATemplate.loadObject(Customer.class, cid);
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
		JPATemplate.updateObject(cust);
	}
}
