package com.jlcindia.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="candidates")
@Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Candidate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	private String fname;
	private String lname;
	@CollectionOfElements
	@JoinTable(name="emails",joinColumns=@JoinColumn(name="cid"))
	@IndexColumn(name="idx")
	@Column(name="EmailId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> emails;
	private String qualification;
	private String dob;
	public Candidate() {
	}
	public Candidate(String fname, String lname, List<String> emails,
			String qualification, String dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.emails = emails;
		this.qualification = qualification;
		this.dob = dob;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
