package com.jlcindia.bean;

import java.util.Date;
import java.util.Set;


public class Order {
	private int orderId;
	private Date orderDate;
	private double totalCost;
	private int totalNos;
	private String status;
	private Address address;
	private Set<OrderItem> orderItems;
	private Customer customer;
	public Order() {
	}
	public Order(Date orderDate, double totalCost, int totalNos, String status,
			Set<OrderItem> orderItems) {
		super();
		this.orderDate = orderDate;
		this.totalCost = totalCost;
		this.totalNos = totalNos;
		this.status = status;
		this.orderItems = orderItems;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public int getTotalNos() {
		return totalNos;
	}
	public void setTotalNos(int totalNos) {
		this.totalNos = totalNos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
