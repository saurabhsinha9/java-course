package com.jlcindia.bookstore.dao;

public class DAOFactory {
static BooksDAO booksDAO;
static{
	booksDAO=new HibernateBooksDAO();
}
public static BooksDAO getBooksDAO(){
	return booksDAO;
}
}
