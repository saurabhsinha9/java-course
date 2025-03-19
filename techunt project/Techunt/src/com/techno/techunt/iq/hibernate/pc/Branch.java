package com.techno.techunt.iq.hibernate.pc;

public class Branch {
	private int branchid;
	private String branchname;
	public Branch()
	 {
		 
	 }
	public Branch(String branchname) {
		super();
		this.branchname = branchname;
	}
	
	
	//setter and getters
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
	
	

}
