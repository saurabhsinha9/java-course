package com.jlcindia.hibernate;

import java.util.Date;

public class Order {
	private int orderId;
	private int totalQty;
	private Double totalCost;
	private String status;
	private Date orderDate;
	
	private Customer customer;
	public Order() {
	}
	public Order(int totalQty, Double totalCost, String status, Date orderDate) {
		super();
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.status = status;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
