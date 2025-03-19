package com.jlcindia.bookstore.ejb2.books;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.jlcindia.bookstore.dao.DAOFactory;
import com.jlcindia.bookstore.to.BookTO;

public class BooksManagerBean implements SessionBean{

	SessionContext sc=null;

	public void ejbActivate() throws EJBException, RemoteException {
		System.out.println("BooksManagerBean-ejbActivate()");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		System.out.println("BooksManagerBean-ejbPassivate()");
	}

	public void ejbRemove() throws EJBException, RemoteException {
		System.out.println("BooksManagerBean-ejbRemove()");
	}

	public void setSessionContext(SessionContext ctx) throws EJBException,RemoteException {
		System.out.println("BooksManagerBean-setSessionContext()");
		this.sc=ctx;
	}
	public void ejbCreate(){
		System.out.println("BooksManagerBean- ejbCreate()");
	}
	public BookTO getBookByBookId(String bookId){
		return DAOFactory.getBooksDAO().getBookByBookId(bookId);
	}
	public List getAllBooks(){
		return DAOFactory.getBooksDAO().getAllBooks();
	}
	public List getBookByCat(String cat){
		return DAOFactory.getBooksDAO().getBookByCat(cat);
	}
}
