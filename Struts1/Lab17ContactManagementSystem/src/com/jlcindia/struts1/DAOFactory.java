package com.jlcindia.struts1;

public class DAOFactory {
static ContactDAO contactDAO;
static{
	contactDAO=new JDBCContactDAO();
}
public static ContactDAO getContactDAO(){
	return contactDAO;
}
}
