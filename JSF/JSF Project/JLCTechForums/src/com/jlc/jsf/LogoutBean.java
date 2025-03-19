package com.jlc.jsf;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class LogoutBean extends JLCBaseBean{
	public String logoutUser(){
		String str="";
		FacesContext fc=FacesContext.getCurrentInstance();
		ExternalContext ec=fc.getExternalContext();
		HttpSession hs=(HttpSession)ec.getSession(false);
		if(hs!=null){
			str="logout";
			hs.invalidate();
		}
		return str;
	}
}
