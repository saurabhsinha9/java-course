package com.jlcindia.ejb2.hello;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloBean implements SessionBean{
	static{
		System.out.println("HelloBean-SB");
	}
	
	SessionContext sc=null;
	
	public void ejbActivate() throws EJBException, RemoteException {
		System.out.println("HelloBean-ejbActivate()");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		System.out.println("HelloBean-ejbPassivate()");
	}

	public void ejbRemove() throws EJBException, RemoteException {
		System.out.println("HelloBean-ejbRemove()");
	}

	public void setSessionContext(SessionContext ctx) throws EJBException,RemoteException {
		System.out.println("HelloBean-setSessionContext()");
		this.sc=ctx;
	}
	public void ejbCreate(){
		System.out.println("HelloBean-ejbCreate()");
	}

	
	public String getMessage(String name) throws RemoteException {
		String msg="Hello ! "+name+"Welcome to JLC EJB World...";
		System.out.println(msg);
		return msg;
	}
}
