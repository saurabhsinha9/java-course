package com.jlcindia.ejb2.customer;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

public interface CustomerRemote  extends EJBObject{
	public String getCid()throws RemoteException;
	public void setCid(String cid)throws RemoteException;
	public String getCname()throws RemoteException;
	public void setCname(String cname) throws RemoteException;
	public String getEmail()throws RemoteException;
	public void setEmail(String email)throws RemoteException;
	public String getPhone()throws RemoteException;
	public void setPhone(String phone)throws RemoteException;
}
