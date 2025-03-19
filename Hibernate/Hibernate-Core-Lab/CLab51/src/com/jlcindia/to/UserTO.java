package com.jlcindia.to;

public class UserTO {
	private int userId;
	private String fullname;
	private String email;
	private String username;
	private String password;

	public UserTO() {
	}

	public UserTO(int userId, String fullname, String email, String username,
			String password) {
		this.userId = userId;
		this.fullname = fullname;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
