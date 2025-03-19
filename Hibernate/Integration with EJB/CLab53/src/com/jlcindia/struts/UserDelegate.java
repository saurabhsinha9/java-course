package com.jlcindia.struts;

import com.jlcindia.ejb.UserManagerHome;
import com.jlcindia.ejb.UserManagerRemote;
import com.jlcindia.to.UserTO;
import com.jlcindia.util.ServiceLocator;

public class UserDelegate {
	ServiceLocator sl=null;
	public UserDelegate() {
		sl=ServiceLocator.getInstance();
	}
	public int verifyUser(String un, String pw) {
		int x=0;
		try {
			UserManagerHome home=(UserManagerHome)sl.getHome("JLCUserHomeJNDI");
			UserManagerRemote remote=home.create();
			x=remote.verifyUser(un, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	public int registerUser(UserTO uto) {
		int x=0;
		try {
			UserManagerHome home=(UserManagerHome)sl.getHome("JLCUserHomeJNDI");
			UserManagerRemote remote=home.create();
			x=remote.registerUser(uto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
}
