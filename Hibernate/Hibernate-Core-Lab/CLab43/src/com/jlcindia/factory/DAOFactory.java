package com.jlcindia.factory;

import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.dao.hibernate.HibernateCustomerDAO;

public class DAOFactory {
	private static CustomerDAO customerDAO;
	static{
		customerDAO=new HibernateCustomerDAO();
	}
	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	
}
