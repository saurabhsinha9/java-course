package com.jlcindia.jsf;

import com.jlcindia.dao.DAOFactory;
import com.jlcindia.dao.QueryDAO;
import com.jlcindia.dao.UserDAO;

public class JLCBaseBean {
	static UserDAO userDAO;
	static QueryDAO queryDAO;
	static {
		userDAO = DAOFactory.getUserDAO();
		queryDAO = DAOFactory.getQueryDAO();
	}
}
