package com.jlcindia;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Add extends Remote{
	public String show(String name)throws RemoteException;
}
