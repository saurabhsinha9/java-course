package com.jlcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AHibernateUtil {
static SessionFactory factory;
static{
	try {
		AnnotationConfiguration acfg=new AnnotationConfiguration();
		
		acfg=(AnnotationConfiguration) acfg.configure();
		factory=acfg.buildSessionFactory();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static SessionFactory getSessionFactory(){
	return factory;
}
}
