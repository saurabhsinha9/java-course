package com.jlcindia.spring.mvc.model;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class EnquiryIdGenerator implements IdentifierGenerator {

	@Autowired
	ApplicationContext ctx=null;
	public Serializable generate(SessionImplementor arg0, Object arg1)
			throws HibernateException {
		return "E-1009";
	}

}
