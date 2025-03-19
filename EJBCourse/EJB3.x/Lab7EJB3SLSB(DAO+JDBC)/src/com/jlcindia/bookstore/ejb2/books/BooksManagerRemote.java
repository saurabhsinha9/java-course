package com.jlcindia.bookstore.ejb2.books;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBObject;
import javax.ejb.Remote;

import com.jlcindia.bookstore.to.BookTO;

@Remote
public interface BooksManagerRemote{
/*
	public void addBook(BookTO bto);
	public void updateBook(BookTO bto);
	public void deleteBook(String bookId);
	*/ 
	public BookTO getBookByBookId(String bookId)throws RemoteException;
	public  List getAllBooks()throws RemoteException;
	public List getBookByCat(String cat)throws RemoteException;
	/*
	public List getBookByAuthor(String author);
	public BookTO getBookByIsbn(String isbn);
	*/
}
