package com.icicibank.accounts;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/*
 * Implementation class of BSI
 * UnicastRemoteObject is responsible for  low level implementation(n/wking,thread,streams)
 * serialization and deserialization
 * stub and skeleton connection to the client
 * 
 */
public class AccountServiceImpl extends UnicastRemoteObject implements AccountService{

	
	private static final long serialVersionUID = 1L;


	static{
		System.out.println("AccountServiceImpl-SB");
	}
	
	protected AccountServiceImpl() throws RemoteException {
		super();
		System.out.println("AccountServiceImpl-DC");
	}
	
	public String deposit(AccountTo ato) throws RemoteException {
		System.out.println("AccountServiceImpl-deposit()");
		//call Account-DAO
		
		String msg="Amount:"+ato.getAmount()+"is deposited"+ato.getAccno()+"successfully";
		System.out.println(msg);
		return msg;
	}

	public String withdraw(AccountTo ato) throws RemoteException {
		System.out.println("AccountServiceImpl-withdraw()");
		//call Account-DAO
		
		String msg="Amount:"+ato.getAmount()+"is withdrawn from your accno:"+ato.getAccno()+"successfully";
		System.out.println(msg);
		return msg;
	}

	public String getBal(int accno) throws RemoteException {
		System.out.println("AccountServiceImpl-getBal()");
		//call Account-DAO
		
		String msg="Your account balance is::"+accno+"99999.99";
		return msg;
	}

}
