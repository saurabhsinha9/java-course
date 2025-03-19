package com.jlcindia.bean;

import java.util.List;
import java.util.Set;

public class ExpCandidate extends Candidate{
	private int yoe;
	Set<String> skills;
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
