package com.jlcindia.bookstore.to;

import java.io.Serializable;

public class OrderItemTO implements Serializable{

	private int orderId;
	private int orderItemId;
	private String bookId;
	private int qty;
	private double cost;
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

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

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		// TODO Auto-generated method stub
		return 0;
	}

}
