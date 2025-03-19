package com.jlcindia.bookstore.dao;

import java.util.List;

import com.jlcindia.bookstore.to.BookTO;

public interface BooksDAO {

	/*public void addBook(BookTO bto);
	public void updateBook(BookTO bto);
	public void deleteBook(String bookId);
	public BookTO getBookByBookId(int bookId);
	 */
	
	public  List getAllBooks();
	
	/*
	public List getBookByCat(String cat);
	
	public List getBookByAuthor(String author);
	public BookTO getBookByIsbn(String isbn);
	*/
}
