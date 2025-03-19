package com.jlcindia.bookstore.dao;

import java.util.Set;

public class Order {
	private int orderId;
	private String orderDate;
	private String cid;
	private int totalQty;
	private double totalCost;
	private String status;
	private Set orderItems;
	public Order() {}
	public Order(String orderDate, String cid, int totalQty, double totalCost,
			String status) {
		super();
		this.orderDate = orderDate;
		this.cid = cid;
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set orderItems) {
		this.orderItems = orderItems;
	}
	
}
