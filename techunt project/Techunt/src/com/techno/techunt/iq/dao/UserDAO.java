package com.techno.techunt.iq.dao;

import com.techno.techunt.iq.actions.to.UserTO;

public interface UserDAO {
public UserTO verifyUser(String username, String password);
public boolean registerUser(UserTO uto);
}
