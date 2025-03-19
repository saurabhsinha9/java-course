package com.jlcindia.dao;

import com.jlcindia.to.UserTO;

public interface UserDAO {
	public int verifyUser(String un,String pw);
	public int registerUser(UserTO uto);
}
