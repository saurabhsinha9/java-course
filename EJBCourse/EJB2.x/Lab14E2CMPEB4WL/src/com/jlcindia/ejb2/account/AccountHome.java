package com.jlcindia.ejb2.account;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

public interface AccountHome  extends EJBHome{
	public AccountRemote create(String accno,String atype,String branch,Double bal)throws CreateException,RemoteException;
	public AccountRemote create(String accno,String atype,String branch)throws CreateException,RemoteException;
	public AccountRemote findByPrimaryKey(String accno)throws FinderException,RemoteException;
	public Collection findAllAccounts()throws FinderException,RemoteException;
	public Collection findAccountsByType(String atype)throws FinderException,RemoteException;
	public Collection findAccountsByBranch(String branch)throws FinderException,RemoteException;
	public Collection findAccountsByBal(Double bal)throws FinderException,RemoteException;
	public Collection findAccountsByBalRange(Double amt1,Double amt2)throws FinderException,RemoteException;
}