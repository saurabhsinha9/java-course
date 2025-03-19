package com.jlcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CHibernateUtil {
static SessionFactory orafactory;
static SessionFactory mysqlfactory;
static{
	try {
		Configuration cfg1=new Configuration();
		cfg1=cfg1.configure("mysql.cfg.xml");
		mysqlfactory=cfg1.buildSessionFactory();
		Configuration cfg2=new Configuration();
		cfg2=cfg2.configure("oracle.cfg.xml");
		orafactory=cfg2.buildSessionFactory();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static SessionFactory getSessionFactory(String name){
	SessionFactory sf=null;
	if(name.equals("mysql")){
		sf= mysqlfactory;
	}if(name.equals("oracle")){
		sf= orafactory;
	}
	return sf;
}
}
