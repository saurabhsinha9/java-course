package com.jlcindia.dao;

public class DAOFactory {
	private static UserDAO userDAO;
	private static QueryDAO queryDAO;
	static {
		userDAO = new HibernateUserDAO();
		queryDAO = new HibernateQueryDAO();
	}

	public static UserDAO getUserDAO() {
		return userDAO;
	}

	public static QueryDAO getQueryDAO() {
		return queryDAO;
	}
}
