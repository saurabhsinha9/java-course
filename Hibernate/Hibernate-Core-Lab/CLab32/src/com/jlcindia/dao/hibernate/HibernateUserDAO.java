package com.jlcindia.dao.hibernate;

import com.jlcindia.bean.Author;
import com.jlcindia.bean.Customer;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.dao.hibernate.util.PropertyUtil;
import com.jlcindia.to.AuthorTO;
import com.jlcindia.to.CustomerTO;
import com.jlcindia.util.CHibernateTemplate;

public class HibernateUserDAO implements UserDAO {

	public int addCustomer(CustomerTO cto) {
		Customer cust=PropertyUtil.getCustomerFromCustomerTO(cto);
		Integer it=(Integer)CHibernateTemplate.saveObject(cust);
		return it.intValue();
	}

	public int addAuthor(AuthorTO ato) {
		Author au=PropertyUtil.getAuthorFromAuthorTO(ato);
		Integer it=(Integer)CHibernateTemplate.saveObject(au);
		return it.intValue();
	}

	public CustomerTO getCustomerById(int userId) {
		Customer cust=(Customer)CHibernateTemplate.loadObject(Customer.class, userId);
		CustomerTO cto=PropertyUtil.getCustomerTOFromCustomer(cust);
		return cto;
	}

	public AuthorTO getAuthorById(int authorId) {
		Author au=(Author)CHibernateTemplate.loadObject(Author.class, authorId);
		AuthorTO ato=PropertyUtil.getAuthorTOFromAuthor(au);
		return ato;
	}

}
