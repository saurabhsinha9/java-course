package com.jlcindia.jsf;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.jlcindia.to.UserTO;

public class HomeBean {
	private UserTO userTO;

	public HomeBean() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession hs = (HttpSession) ec.getSession(false);
		userTO = (UserTO) hs.getAttribute("UTO");
	}

	public UserTO getUserTO() {
		return userTO;
	}

	public void setUserTO(UserTO userTO) {
		this.userTO = userTO;
	}
}
