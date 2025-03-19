package com.jlcindia.spring.hibernate;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class HibernateCustomerDAO extends HibernateDaoSupport implements CustomerDAO{

	public int addCustomer(CustomerTO cto) {
		final Customer cust=new Customer(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		HibernateCallback hc=new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				session.save(cust);
				return session;
			}
		};
		HibernateTemplate ht=getHibernateTemplate();
		ht.execute(hc);
		return cust.getCid();
	}
}
