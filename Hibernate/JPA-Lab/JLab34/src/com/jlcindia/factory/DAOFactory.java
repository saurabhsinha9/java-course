package com.jlcindia.factory;

import com.jlcindia.dao.AccountDAO;
import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.CustomerDAO;
import com.jlcindia.dao.RequestDAO;
import com.jlcindia.dao.jpa.JPAAccountDAO;
import com.jlcindia.dao.jpa.JPAAddressDAO;
import com.jlcindia.dao.jpa.JPACustomerDAO;
import com.jlcindia.dao.jpa.JPARequestDAO;

public abstract class DAOFactory {
	public static AddressDAO getAddressDAO(){
		return new JPAAddressDAO();
	}
	public static RequestDAO getRequestDAO(){
		return new JPARequestDAO();
	}
	
	public static CustomerDAO getCustomerDAO(){
		return new JPACustomerDAO();
	}
	public static AccountDAO getAccountDAO(){
		return new JPAAccountDAO();
	}
}
