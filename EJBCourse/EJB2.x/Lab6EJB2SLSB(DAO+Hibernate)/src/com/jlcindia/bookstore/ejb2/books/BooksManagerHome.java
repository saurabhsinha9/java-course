package com.jlcindia.bookstore.ejb2.books;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface BooksManagerHome extends EJBHome {

	public BooksManagerRemote create()throws RemoteException,CreateException;
}
