package com.jlcindia.ejb2.account;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class AccountBean implements EntityBean{
	//No BeanFields
	
	//others
	EntityContext ec=null;
	
	public void setEntityContext(EntityContext ctx) throws EJBException,
	RemoteException {
		System.out.println("AccountBean-setEntityContext()");
		this.ec=ctx;
	}
	public void unsetEntityContext() throws EJBException, RemoteException {
		System.out.println("AccountBean-unsetEntityContext()");
		ec=null;
	}
	
	public void ejbActivate(){}
	public void ejbPassivate(){}
	public void ejbRemove(){}
	public void ejbStore(){}
	public void ejbLoad(){}
	

	public String ejbCreate(String accno,String atype,String branch,Double bal) {
		//1.init
		setAccno(accno);
		setAtype(atype);
		setBranch(branch);
		setBal(bal);
		return null;
	}
	
	public void ejbPostCreate(String accno,String atype,String branch,Double bal) {}
	
	public String ejbCreate(String accno,String atype,String branch) {
		//1.init
		setAccno(accno);
		setAtype(atype);
		setBranch(branch);
		return null;
	}
	public void ejbPostCreate(String accno,String atype,String branch) {}

	public abstract void setBranch(String branch);
	public abstract void setAtype(String atype);
	public abstract void setAccno(String accno);
	public abstract void setBal(Double bal);
	
	public abstract String getAccno(); 
	public abstract String getAtype();
	public abstract String getBranch(); 
	public abstract Double getBal(); 
	
}
