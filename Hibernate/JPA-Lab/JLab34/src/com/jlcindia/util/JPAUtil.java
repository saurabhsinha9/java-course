package com.jlcindia.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
static EntityManagerFactory factory;
static{
	try {
		factory=Persistence.createEntityManagerFactory("JLCINDIAPU");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static EntityManagerFactory getEntityManagerFactory(){
	return factory;
}
}
