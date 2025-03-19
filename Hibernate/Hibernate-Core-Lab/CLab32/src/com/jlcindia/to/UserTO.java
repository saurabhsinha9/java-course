package com.jlcindia.to;

import java.util.Map;

public class UserTO {
	private int userId;
	private Map<String,String> logins;
	private String fullName;
	private String email;
	public UserTO() {
	}
	public UserTO(Map<String, String> logins, String fullName,
			String email) {
		super();
		this.logins = logins;
		this.fullName = fullName;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Map<String, String> getLogins() {
		return logins;
	}
	public void setLogins(Map<String, String> logins) {
		this.logins = logins;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "UserTO [userId=" + userId + ", logins=" + logins
				+ ", fullName=" + fullName + ", email=" + email + "]";
	}
	
}
