package com.jlcindia.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="customer_table", catalog="jlcjpadb")
@Proxy(lazy=false)
public class Customer  implements Serializable{
	@Id
	@Column(name="cid",unique=true,nullable=false,insertable=true,updatable=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cid;
	@Column(name="firstName",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String firstName;
	@Column(name="lastName",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String lastName;
	@Column(name="email",unique=false,nullable=true,insertable=true,updatable=true,length=20)
	private String email;
	@Column(name="phone",unique=false,nullable=true,insertable=true,updatable=true,length=16277215)
	private long phone;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Address address;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="customer")
	private Collection<Request> requests;
	
	@JoinTable(name="cust_acc_table",joinColumns=@JoinColumn(name="cid",referencedColumnName="cid")
			,inverseJoinColumns=@JoinColumn(name="accno",referencedColumnName="accno"))
	private Set<Account> accounts;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String firstName, String lastName, String email, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Collection<Request> getRequests() {
		return requests;
	}
	public void setRequests(Collection<Request> requests) {
		this.requests = requests;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
}
