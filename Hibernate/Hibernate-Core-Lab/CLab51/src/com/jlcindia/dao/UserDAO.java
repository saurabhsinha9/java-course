package com.jlcindia.dao;

import com.jlcindia.to.UserTO;

public interface UserDAO {
	public UserTO verifyUser(String username, String password);

	public UserTO registerUser(UserTO uto);
}
