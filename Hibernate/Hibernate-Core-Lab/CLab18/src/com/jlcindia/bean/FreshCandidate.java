package com.jlcindia.bean;

import java.util.List;
import java.util.Map;

public class FreshCandidate extends Candidate{
	private int yop;
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
