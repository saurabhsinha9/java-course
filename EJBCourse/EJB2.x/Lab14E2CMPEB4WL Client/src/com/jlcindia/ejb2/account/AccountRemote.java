package com.jlcindia.ejb2.account;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

public interface AccountRemote  extends EJBObject{
	public String getAccno() throws RemoteException;
	public void setAccno(String accno) throws RemoteException;
	public String getAtype() throws RemoteException; 
	public void setAtype(String atype) throws RemoteException; 
	public String getBranch() throws RemoteException;
	public void setBranch(String branch) throws RemoteException;
	public Double getBal() throws RemoteException; 
	public void setBal(Double bal) throws RemoteException;
}
