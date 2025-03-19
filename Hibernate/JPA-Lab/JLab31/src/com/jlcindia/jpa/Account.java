package com.jlcindia.jpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="myaccounts")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accno;
	private String atype;
	private Double bal;

	@ManyToMany(mappedBy="accounts")
	Set<Customer> customers;
	public Account() {
	}
	public Account(String atype, Double bal) {
		this.atype = atype;
		this.bal = bal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
}
