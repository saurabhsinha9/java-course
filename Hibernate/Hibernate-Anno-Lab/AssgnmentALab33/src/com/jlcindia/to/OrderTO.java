package com.jlcindia.to;

import java.util.Date;
import java.util.Set;

public class OrderTO {
	private int orderId;
	private Date orderDate;
	private double totalCost;
	private int totalNos;
	private String status;
	private AddressTO addressTO;
	private Set<OrderItemTO> orderItemTOs;
	private CustomerTO customerTO;
	public OrderTO() {
	}
	public OrderTO(Date orderDate, double totalCost, int totalNos,
			String status) {
		super();
		this.orderDate = orderDate;
		this.totalCost = totalCost;
		this.totalNos = totalNos;
		this.status = status;
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
	public AddressTO getAddressTO() {
		return addressTO;
	}
	public void setAddressTO(AddressTO addressTO) {
		this.addressTO = addressTO;
	}
	public Set<OrderItemTO> getOrderItemTOs() {
		return orderItemTOs;
	}
	public void setOrderItemTOs(Set<OrderItemTO> orderItemTOs) {
		this.orderItemTOs = orderItemTOs;
	}
	public CustomerTO getCustomerTO() {
		return customerTO;
	}
	public void setCustomerTO(CustomerTO customerTO) {
		this.customerTO = customerTO;
	}
	public String toString() {
		return "OrderTO [orderId=" + orderId + ", orderDate=" + orderDate
				+ ", totalCost=" + totalCost + ", totalNos=" + totalNos
				+ ", status=" + status + ", addressTO=" + addressTO
				+ ", orderItemTOs=" + orderItemTOs + ", customerTO="
				+ customerTO + "]";
	}
}
