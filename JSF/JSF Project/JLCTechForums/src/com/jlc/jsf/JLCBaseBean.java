package com.jlc.jsf;

import com.jlc.dao.*;

public class JLCBaseBean {
	static UserDAO userDAO;
	static QueryDAO queryDAO;
	static {
		userDAO = DAOFactory.getUserDAO();
		queryDAO = DAOFactory.getQueryDAO();
	}
}
