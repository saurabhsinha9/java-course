package com.icicibank.accounts;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * Devoloping BSI
 *
 *Remote interface is a marker interface that allow the invocation of method from remote machine
 */
public interface AccountService extends Remote{
	
	public String deposit(AccountTo ato)throws RemoteException;
	public String withdraw(AccountTo ato)throws RemoteException;
	public String getBal(int accno)throws RemoteException;

}
