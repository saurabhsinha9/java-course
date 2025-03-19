package com.icicibank.accounts;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * Consuming the remote BS
 * 
 */
public interface AccountService extends Remote{
	
	public String deposit(AccountTo ato)throws RemoteException;
	public String withdraw(AccountTo ato)throws RemoteException;
	public String getBal(int accno)throws RemoteException;

}
