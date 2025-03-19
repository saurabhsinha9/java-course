package com.jlcindia.factory;

import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.dao.jpa.JPACustomerDAO;

public class DAOFactory {
	private static CustomerDAO customerDAO;
	static{
		customerDAO=new JPACustomerDAO();
	}
	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	
}
