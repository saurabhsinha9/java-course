package com.techno.techunt.iq.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techno.techunt.iq.actions.to.UserTO;
import com.techno.techunt.iq.dao.UserDAO;
import com.techno.techunt.iq.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
@Autowired
private UserDAO userDAO;
	
@Transactional(propagation=Propagation.REQUIRED)
	public UserTO verifyuser(String username, String password) {
		return userDAO.verifyUser(username, password);
	}

@Transactional(propagation=Propagation.REQUIRED)
public boolean registerUser(UserTO uto) {
 return userDAO.registerUser(uto);
	
}














}
