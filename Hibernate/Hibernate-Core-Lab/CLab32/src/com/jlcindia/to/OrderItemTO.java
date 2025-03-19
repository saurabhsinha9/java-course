package com.jlcindia.to;

public class OrderItemTO {
	private int orderItemId;
	private String bookName;
	private int qty;
	private double cost;
	private OrderTO orderTO;
	public OrderItemTO() {
	}
	public OrderItemTO(String bookName, int qty, double cost) {
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
	public OrderTO getOrderTO() {
		return orderTO;
	}
	public void setOrderTO(OrderTO orderTO) {
		this.orderTO = orderTO;
	}
	public String toString() {
		return "OrderItemTO [orderItemId=" + orderItemId + ", bookName="
				+ bookName + ", qty=" + qty + ", cost=" + cost + ", orderTO="
				+ orderTO + "]";
	}
}
