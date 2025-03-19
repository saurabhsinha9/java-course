package com.jlcindia.to;

import java.util.Set;

public class BookTO {
	private int bookId;
	private String bookName;
	private double price;
	private String pub;
	private String isbn;
	private Set<AuthorTO> authors;
	public BookTO() {
	}
	public BookTO(String bookName, double price, String pub,
			String isbn) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.pub = pub;
		this.isbn = isbn;
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
	public Set<AuthorTO> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<AuthorTO> authors) {
		this.authors = authors;
	}
	public String toString() {
		return "BookTO [bookId=" + bookId + ", bookName=" + bookName + ", price="
				+ price + ", pub=" + pub + ", isbn=" + isbn + ", authors="
				+ authors + "]";
	}
}
