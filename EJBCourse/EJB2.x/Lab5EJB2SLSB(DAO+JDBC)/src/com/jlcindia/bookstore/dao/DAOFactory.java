package com.jlcindia.bookstore.dao;

public class DAOFactory {
static BooksDAO booksDAO;
static{
	booksDAO=new JdbcBooksDAO();
}
public static BooksDAO getBooksDAO(){
	return booksDAO;
}
}
