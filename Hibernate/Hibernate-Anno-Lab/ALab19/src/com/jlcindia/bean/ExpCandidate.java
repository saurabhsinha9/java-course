package com.jlcindia.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="ecandidates")
@Proxy(lazy=false)
@PrimaryKeyJoinColumn(name="cid")
public class ExpCandidate extends Candidate{
	private int yoe;
	@CollectionOfElements
	@JoinTable(name="skills",joinColumns=@JoinColumn(name="cid"))
	@Column(name="skillName")
	@LazyCollection(LazyCollectionOption.FALSE)
	Set<String> skills;
	@CollectionOfElements
	@JoinTable(name="companies",joinColumns=@JoinColumn(name="cid"))
	@IndexColumn(name="idx")
	@Column(name="companyName")
	@LazyCollection(LazyCollectionOption.FALSE)
	List<String> companies;
	double ctc;
	
	public ExpCandidate() {
	}

	public ExpCandidate(String fname, String lname, List<String> emails,
			String qualification, String dob, Set<String> skills,
			List<String> companies, double ctc) {
		super(fname, lname, emails, qualification, dob);
		this.skills = skills;
		this.companies = companies;
		this.ctc = ctc;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public List<String> getCompanies() {
		return companies;
	}

	public void setCompanies(List<String> companies) {
		this.companies = companies;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	
}
