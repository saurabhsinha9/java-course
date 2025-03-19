package com.techno.techunt.iq.service;

import com.techno.techunt.iq.actions.to.UserTO;

public interface UserService {
	public UserTO verifyuser(String username,String password);
	public boolean registerUser(UserTO uto);
	
}
