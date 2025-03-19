package com.jlcindia.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="request_table", catalog="jlcjpadb")
@Proxy(lazy=false)
public class Request  implements Serializable{
	@Id
	@Column(name="reqId",unique=true,nullable=false,insertable=true,updatable=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer reqId;
	@Column(name="reqDate",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String reqDate;
	@Column(name="description",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String description;
	@Column(name="status",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Customer customer;
	public Request() {
		// TODO Auto-generated constructor stub
	}
	
	public Request(String reqDate, String description, String status) {
		super();
		this.reqDate = reqDate;
		this.description = description;
		this.status = status;
	}

	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
