package com.jlcindia.bean;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="fcandidates")
@Proxy(lazy=false)
@PrimaryKeyJoinColumn(name="cid")
public class FreshCandidate extends Candidate{
	private int yop;
	@CollectionOfElements
	@JoinTable(name="percentages",joinColumns=@JoinColumn(name="cid"))
	@Column(name="percentage")
	@LazyCollection(LazyCollectionOption.FALSE)
	Map<String,Double> percentages;
	String yearGaps;
	public FreshCandidate() {
	}
	public FreshCandidate(String fname, String lname, List<String> emails,
			String qualification, String dob, int yop,
			Map<String, Double> percentages, String yearGaps) {
		super(fname, lname, emails, qualification, dob);
		this.yop = yop;
		this.percentages = percentages;
		this.yearGaps = yearGaps;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public Map<String, Double> getPercentages() {
		return percentages;
	}
	public void setPercentages(Map<String, Double> percentages) {
		this.percentages = percentages;
	}
	public String getYearGaps() {
		return yearGaps;
	}
	public void setYearGaps(String yearGaps) {
		this.yearGaps = yearGaps;
	}
}
