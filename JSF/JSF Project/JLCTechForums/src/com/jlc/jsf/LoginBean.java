package com.jlc.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.jlc.util.UserTO;

public class LoginBean extends JLCBaseBean {
String username;
String password;
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

	public String verifyUser() {
		String str=null;
		FacesContext fc=FacesContext.getCurrentInstance();
		UserTO uto=userDAO.verifyUser(username,password);
		if(uto!=null){
			str="success";
			ExternalContext ec=fc.getExternalContext();
			HttpSession hs=(HttpSession)ec.getSession(false);
			hs.setAttribute("UTO", uto);
		}
		else{
			str="failure";
			fc.addMessage("loginError", new FacesMessage("Username or Password is Incorrect"));
		}
		return str;
		}
}
