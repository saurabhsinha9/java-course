package com.jlcindia.bookstore.dao;


public class DAOFactory {

	static OrderDAO orderDAO;
	static{
		orderDAO=new HibernateOrderDAO();
	}
	public static OrderDAO getOrderDAO() {
		return orderDAO;
	}

}
