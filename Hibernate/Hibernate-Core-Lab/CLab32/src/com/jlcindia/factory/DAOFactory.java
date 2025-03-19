package com.jlcindia.factory;

import com.jlcindia.dao.AddressDAO;
import com.jlcindia.dao.BookDAO;
import com.jlcindia.dao.OrderDAO;
import com.jlcindia.dao.OrderItemDAO;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.dao.hibernate.HibernateAddressDAO;
import com.jlcindia.dao.hibernate.HibernateBookDAO;
import com.jlcindia.dao.hibernate.HibernateOrderDAO;
import com.jlcindia.dao.hibernate.HibernateOrderItemDAO;
import com.jlcindia.dao.hibernate.HibernateUserDAO;

public class DAOFactory {
	static UserDAO userDAO=null;
	static BookDAO bookDAO=null;
	static OrderDAO orderDAO=null;
	static OrderItemDAO orderItemDAO=null;
	static AddressDAO addressDAO=null;
	static{
		userDAO=new HibernateUserDAO();
		bookDAO=new HibernateBookDAO();
		orderDAO=new HibernateOrderDAO();
		orderItemDAO=new HibernateOrderItemDAO();
		addressDAO=new HibernateAddressDAO();
	}
	
	public static UserDAO getUserDAO() {
		return userDAO;
	}
	public static BookDAO getBookDAO() {
		return bookDAO;
	}
	public static OrderDAO getOrderDAO() {
		return orderDAO;
	}
	public static OrderItemDAO getOrderItemDAO() {
		return orderItemDAO;
	}
	public static AddressDAO getAddressDAO() {
		return addressDAO;
	}
	
}
