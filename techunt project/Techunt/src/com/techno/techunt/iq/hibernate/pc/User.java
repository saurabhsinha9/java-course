package com.techno.techunt.iq.hibernate.pc;

public class User implements Cloneable{
	private long serialNo;
	private String branchname;
	private String batchid;
	private String studentid;
	private String studname;
	private String email;
	private long phone;
	private String username;
	private String password;
	private String status;
	private String role;
	private int numberofquestion;
	public User()
	{
	System.out.println("def cons of user");	
	}
	
	
	
	
	public User(long serialNo, String branchname, String batchid,
			String studentid, String studname, String email, long phone,
			String username, String password, String status, String role,
			int numberofquestion) {
		super();
		this.serialNo = serialNo;
		this.branchname = branchname;
		this.batchid = batchid;
		this.studentid = studentid;
		this.studname = studname;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.status = status;
		this.role = role;
		this.numberofquestion = numberofquestion;
	}
	public long getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getNumberofquestion() {
		return numberofquestion;
	}
	public void setNumberofquestion(int numberofquestion) {
		this.numberofquestion = numberofquestion;
	}
	
	
	public User clone() throws CloneNotSupportedException
	{
		return (User) super.clone();
		
	}
	
	

}
