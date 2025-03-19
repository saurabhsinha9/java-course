package com.jlcindia.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;



public interface UserManagerHome extends EJBHome{
	public UserManagerRemote create()throws RemoteException,CreateException;
}
