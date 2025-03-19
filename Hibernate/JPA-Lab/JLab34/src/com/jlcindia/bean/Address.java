package com.jlcindia.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="address_table")
@Proxy(lazy=false)
public class Address  implements Serializable{
	@Id
	@Column(name="aid",unique=true,nullable=false,insertable=true,updatable=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;
	@Column(name="street",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String street;
	@Column(name="city",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String city;
	@Column(name="country",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String country;
	@Column(name="pin",unique=false,nullable=true,insertable=true,updatable=true,length=16277215)
	private String pin;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Customer customer;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String street, String city, String country, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}

	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
