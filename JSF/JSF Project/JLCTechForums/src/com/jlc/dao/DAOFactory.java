package com.jlc.dao;

public class DAOFactory {
	private static UserDAO userDAO;
	private static QueryDAO queryDAO;
	static {
		userDAO = new JDBCUserDAO();
		queryDAO = new JDBCQueryDAO();

	}

	public static UserDAO getUserDAO() {
		return userDAO;
	}

	public static QueryDAO getQueryDAO() {
		return queryDAO;
	}
}
