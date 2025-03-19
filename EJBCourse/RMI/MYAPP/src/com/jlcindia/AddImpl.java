package com.jlcindia;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements Add{

	protected AddImpl() throws RemoteException {
	}

	public String show(String name) throws RemoteException {
		return "your name is "+name;
	}

}
