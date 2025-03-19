package com.jlcindia.bookstore.to;

import java.io.Serializable;

public class BookTO implements Serializable{
private String bookId;
private String bookName;
private String author;
private String pub;
private String isbn;
private double cost;
private String cat;
private int qty;
public BookTO() {
	super();
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
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

public String toString() {
	return "BookTO["+bookId+"\t"+bookName+"\t"+author+"\t"+pub+"\t"+isbn+"\t"+cost+"\t"+cat+"\t"+qty+"]";
}

}
