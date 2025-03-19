package com.jlcindia.bean;

public class OrderItem {
	private int orderItemId;
	private String bookName;
	private int qty;
	private double cost;
	private Order order;
	public OrderItem() {
	}
	public OrderItem(String bookName, int qty, double cost) {
		super();
		this.bookName = bookName;
		this.qty = qty;
		this.cost = cost;
	}
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
