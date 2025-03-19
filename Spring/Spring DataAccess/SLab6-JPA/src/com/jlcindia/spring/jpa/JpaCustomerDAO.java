package com.jlcindia.spring.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JpaCustomerDAO implements CustomerDAO {

	@Autowired
	JpaTemplate jpaTemp=null;
	@Autowired
	JpaTransactionManager txManager=null;
	
	
	public int addCustomer(CustomerTO cto) {
		Customer c=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition();
			ts=txManager.getTransaction(txDef);
			jpaTemp.persist(c);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
		return cto.getCid();
	}

	public int deleteCustomer(int cid) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition();
			ts=txManager.getTransaction(txDef);
			Customer c=(Customer)jpaTemp.getReference(Customer.class, cid);
			jpaTemp.remove(c);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
		return cid;
	}

	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String jpaql="from Customer cust";
		List<Customer> custList=jpaTemp.find(jpaql);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(),c.getEmail(),c.getPhone(),c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomers(String cname, String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String jpaql="from Customer cust where cust.cname=? and cust.city=?";
		List<Customer> custList=jpaTemp.find(jpaql,cname,city);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(),c.getEmail(),c.getPhone(),c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomersByName(String cname) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String jpaql="from Customer cust where cust.cname=?";
		List<Customer> custList=jpaTemp.find(jpaql,cname);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(),c.getEmail(),c.getPhone(),c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public int updateCustomer(CustomerTO cto) {
		TransactionStatus ts=null;
		try {
			TransactionDefinition txDef=new DefaultTransactionDefinition();
			ts=txManager.getTransaction(txDef);
			Customer c=(Customer)jpaTemp.getReference(Customer.class,cto.getCid());
			c.setCname(cto.getCname());
			c.setEmail(cto.getEmail());
			c.setPhone(cto.getPhone());
			c.setCity(cto.getCity());
			jpaTemp.merge(c);
			txManager.commit(ts);
		} catch (Exception e) {
			txManager.rollback(ts);
		}
		return cto.getCid();
	}

}
