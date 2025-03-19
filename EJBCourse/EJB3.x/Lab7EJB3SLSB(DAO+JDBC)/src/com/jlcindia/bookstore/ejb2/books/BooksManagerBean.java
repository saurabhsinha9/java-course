package com.jlcindia.bookstore.ejb2.books;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import com.jlcindia.bookstore.dao.DAOFactory;
import com.jlcindia.bookstore.to.BookTO;

@Stateless(name="BooksManagerBean",mappedName="BooksManagerBean")
public class BooksManagerBean implements BooksManagerRemote{

	@Resource
	SessionContext sc=null;

	@PreDestroy
	public void cleanup(){
		System.out.println("BooksManagerBean-cleanup");
	}
	@PostConstruct
	public void init(){
		System.out.println("BooksManagerBean-init");
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
