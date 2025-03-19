package com.jlcindia.dao;

import com.jlcindia.hibernate.HibernateUserDAO;

public class DAOFactory {
	static UserDAO userDAO=null;
	static{
		userDAO=new HibernateUserDAO();
	}
	public static UserDAO getUserDAO() {
		return userDAO;
	}

}
