package com.jlc.dao;

import com.jlc.util.UserTO;

public interface UserDAO {
	public UserTO verifyUser(String username, String password);

	public UserTO registerUser(UserTO uto);
}
