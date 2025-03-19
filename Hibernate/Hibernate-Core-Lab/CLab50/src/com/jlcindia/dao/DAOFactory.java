package com.jlcindia.dao;

public class DAOFactory {
	public static StudentDAO getStudentDAO(){
		return new HibernateStudentDAO();
	}
}
