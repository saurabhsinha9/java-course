package com.jlcindia.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.jlcindia.to.UserTO;

public interface UserManagerRemote extends EJBObject{
	public int verifyUser(String un,String pw)throws RemoteException;
	public int registerUser(UserTO uto)throws RemoteException;
}
