package com.jlcindia.bookstore.dao;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private String pub;
	private String isbn;
	private double cost;
	private String cat;
	private int qty;
	public Book() {
	}
	public Book(String bookName, String author, String pub, String isbn,
			double cost, String cat, int qty) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pub = pub;
		this.isbn = isbn;
		this.cost = cost;
		this.cat = cat;
		this.qty = qty;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
