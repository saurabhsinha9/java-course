package com.jlcindia.bookstore.dao;

public class DAOFactory {

	static OrderDAO orderDAO;
	static{
		orderDAO=new JdbcOrderDAO();
	}
	public static OrderDAO getOrderDAO() {
		return orderDAO;
	}

}
