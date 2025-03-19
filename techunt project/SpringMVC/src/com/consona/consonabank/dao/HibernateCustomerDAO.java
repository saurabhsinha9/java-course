package com.consona.consonabank.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.consona.consonabank.hibernate.Customer;
import com.consona.consonabank.to.CustomerTO;
import com.consona.consonabank.util.CustomerUtil;



public class HibernateCustomerDAO implements CustomerDAO{
@Autowired
HibernateTemplate htemp;
	public CustomerTO getCustomerByCid(int cid) {
Customer cust=htemp.load(Customer.class,cid);
CustomerTO cto=CustomerUtil.getCustomerTOFromCustomer(cust);
		return cto;
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Customer c=(Customer)htemp.load(Customer.class,cto.getCid());
		c.setCid(cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		c.setUsername(cto.getUsername());
		c.setPassword(cto.getPassword());
		htemp.update(c,LockMode.NONE);

	}

	@Override
	public CustomerTO verifyCustomer(String un, String pw) {
			DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
			dc.add(Expression.and(Expression.eq("username",un),Expression.eq("password",pw)));
			List<Customer>list=htemp.findByCriteria(dc);
			CustomerTO cto=null;
			if(list.size()!=0)
			{
				Customer cust=list.get(0);
				cto=CustomerUtil.getCustomerTOFromCustomer(cust);
			}
			
		return cto;
	}

}
