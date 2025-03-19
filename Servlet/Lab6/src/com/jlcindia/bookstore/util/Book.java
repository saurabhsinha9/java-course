package com.jlcindia.bookstore.util;

public class Book {
	static{
		System.out.println("Book-SB");
	}
	public Book() {
		System.out.println("Book-DC");
	}
	private int bid;
	private String bname;
	private String author;
	private double cost;
	private String cat;
	private String pub;
	private String isbn;
	public int getBid() {
		System.out.println("Book-getBid()");
		return bid;
	}
	public void setBid(int bid) {
		System.out.println("Book-setBid()");
		this.bid = bid;
	}
	public String getBname() {
		System.out.println("Book- getBname() ");
		return bname;
	}
	public void setBname(String bname) {
		System.out.println("Book- setBname() ");
		this.bname = bname;
	}
	public String getAuthor() {
		System.out.println("Book-getAuthor()");
		return author;
	}
	public void setAuthor(String author) {
		System.out.println("Book-setAuthor()");
		this.author = author;
	}
	public double getCost() {
		System.out.println("Book-getCost()");
		return cost;
	}
	public void setCost(double cost) {
		System.out.println("Book-setCost()");
		this.cost = cost;
	}
	public String getCat() {
		System.out.println("Book-getCat()");
		return cat;
	}
	public void setCat(String cat) {
		System.out.println("Book-setCat()");
		this.cat = cat;
	}
	public String getPub() {
		System.out.println("Book-getPub() ");
		return pub;
	}
	public void setPub(String pub) {
		System.out.println("Book-setPub() ");
		this.pub = pub;
	}
	public String getIsbn() {
		System.out.println("Book-getIsbn() ");
		return isbn;
	}
	public void setIsbn(String isbn) {
		System.out.println("Book-setIsbn() ");
		this.isbn = isbn;
	}
}
