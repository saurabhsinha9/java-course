package com.jlcindia.dao;

import java.util.Set;

import com.jlcindia.to.BookTO;


public interface BookDAO {
	public int addBook(BookTO bto);
	public void updateBook(BookTO bto);
	public void deleteBook(int bookId);
	public BookTO getBookById(int bookId);
	public void setAuthorToBook(int bid,Set<Integer> aids);
}
