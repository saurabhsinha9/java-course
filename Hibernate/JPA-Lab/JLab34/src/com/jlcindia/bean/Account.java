package com.jlcindia.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="account_table")
@Inheritance(strategy=InheritanceType.JOINED)
@Proxy(lazy=false)
public abstract class Account implements Serializable{
	@Id
	@Column(name="accno",unique=true,nullable=false,insertable=true,updatable=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer accno;
	@Column(name="createdDate",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String createdDate;
	@Column(name="branch",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String branch;
	
	@ManyToMany(mappedBy="accounts")
	private Set<Customer> customers;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String createdDate, String branch) {
		super();
		this.createdDate = createdDate;
		this.branch = branch;
	}

	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
}
