package com.jlcindia.ejb2.customer;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

public interface CustomerHome  extends EJBHome{
	public CustomerRemote create(String cid,String cname,String email,String phone)throws CreateException,RemoteException;
	public CustomerRemote create(String cid,String cname,String email)throws CreateException,RemoteException;
	public CustomerRemote findByPrimaryKey(String cid)throws FinderException,RemoteException;
	public Collection findAllCustomers()throws FinderException,RemoteException;
	public Collection findAllCustomersByName(String cname)throws FinderException,RemoteException;
	public CustomerRemote findCustomerByEmail(String email)throws FinderException,RemoteException;
}