package com.jlcindia.bookstore.dao;

public class OrderItem {
	private int orderItemId;
	private String bookId;
	private int qty;
	private double cost;
	private Order order;
	public OrderItem() {}
	public OrderItem(String bookId, int qty, double cost) {
		super();
		this.bookId = bookId;
		this.qty = qty;
		this.cost = cost;
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
