package com.jlcindia.bookstore.to;

import java.io.Serializable;

public class OrderItemTO implements Serializable {
private int orderId;
private int orderItemId;
private String bookId;
private int qty;
private double cost;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getOrderItemId() {
	return orderItemId;
}
public void setOrderItemId(int orderItemId) {
	this.orderItemId = orderItemId;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

}
