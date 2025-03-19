package com.jlcindia.calci;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServiceImpl extends UnicastRemoteObject implements CalculatorService{

	protected CalculatorServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public long add(long a, long b) throws RemoteException {
		long c=a+b;
		return c;
	}

	public long div(long a, long b) throws RemoteException {
		long c=a/b;
		return c;
	}

	public long mul(long a, long b) throws RemoteException {
		long c=a*b;
		return c;
	}

	public long sub(long a, long b) throws RemoteException {
		long c=a-b;
		return c;
	}

}
