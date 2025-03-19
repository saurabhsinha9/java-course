package com.jlcindia.factory;

import com.jlcindia.dao.CandidateDAO;
import com.jlcindia.dao.hibernate.HibernateCandidateDAO;

public class DAOFactory {
	private static CandidateDAO candidateDAO;
	static{
		candidateDAO=new HibernateCandidateDAO();
	}
	public static CandidateDAO getCustomerDAO() {
		return candidateDAO;
	}
	
}
