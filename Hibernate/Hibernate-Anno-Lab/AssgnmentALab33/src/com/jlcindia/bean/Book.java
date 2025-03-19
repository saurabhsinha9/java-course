package com.jlcindia.bean;

import java.util.Set;

public class Book {
	private int bookId;
	private String bookName;
	private double price;
	private String pub;
	private String isbn;
	private Set<Author> authors;
	public Book() {
	}
	public Book(String bookName, double price, String pub, String isbn,
			Set<Author> authors) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.pub = pub;
		this.isbn = isbn;
		this.authors = authors;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
}
