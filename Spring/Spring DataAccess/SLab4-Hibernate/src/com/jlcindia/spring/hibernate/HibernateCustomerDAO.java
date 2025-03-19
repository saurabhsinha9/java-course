package com.jlcindia.spring.hibernate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class HibernateCustomerDAO implements CustomerDAO{
	@Autowired
	HibernateTemplate hibernateTemp;

	public List<CustomerTO> getCustomersByCity(final String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		HibernateCallback hc=new HibernateCallback() {
			
			public Object doInHibernate(Session s) throws HibernateException,
					SQLException {
				Query q=s.createQuery("from Customer cust where cust.city=?");
				q.setParameter("city", city);
				Criteria ct=s.createCriteria(Customer.class);
				ct.add(Expression.eq("city", city));
				return null;
			}
		}; 
		return null;
	}

	public List<CustomerTO> getAllCustomers1() {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer cust";
		List<Customer> custList=hibernateTemp.find(hql);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomersByName1(String cname) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer cust where cust.cname=?";
		List<Customer> custList=hibernateTemp.find(hql,cname);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomers1(String cname, String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer cust where cust.cname=? and cust.city=?";
		List<Customer> custList=hibernateTemp.find(hql,new Object[]{cname,city});
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getAllCustomers2() {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		List<Customer> custList=hibernateTemp.findByCriteria(dc);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomersByName2(String cname) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Expression.eq("cname", cname));
		List<Customer> custList=hibernateTemp.findByCriteria(dc);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public List<CustomerTO> getCustomers2(String cname, String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Expression.and(Expression.eq("cname", cname),Expression.eq("city", city)));
		List<Customer> custList=hibernateTemp.findByCriteria(dc);
		for(Customer c:custList){
			CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public int getCustomerCount() {
		String hql="from Customer cust";
		List<Customer> custList=hibernateTemp.find(hql);
		return custList.size();
	}

	public CustomerTO getCustomerByCid(int cid) {
		Customer c=(Customer)hibernateTemp.load(Customer.class, cid);
		CustomerTO cto=new CustomerTO(c.getCid(),c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

	public int addCustomer(CustomerTO cto) {
		Customer cust=new Customer(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		return (Integer)hibernateTemp.save(cust);
	}

	public int updateCustomer(CustomerTO cto) {
		Customer c=(Customer)hibernateTemp.load(Customer.class, cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		hibernateTemp.update(c,LockMode.NONE);
		return cto.getCid();
	}

	public int deleteCustomer(int cid) {
		Customer c=(Customer)hibernateTemp.load(Customer.class, cid);
		hibernateTemp.delete(c,LockMode.NONE);
		return cid;
	}

}
