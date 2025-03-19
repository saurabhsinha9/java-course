package com.jlcindia.jsf;

import java.util.Properties;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.jlcindia.ejb.UserManagerRemote;

public class LoginBean {
	private String username;
	private String password;
	Context ctx=null;
	public LoginBean() {
		try {
			Properties p=new Properties();
			
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs", "org.jboss.naming");
			
			ctx=new InitialContext(p);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
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
		String str = null;
		try {
			Object o=ctx.lookup("UserManagerBean/remote");
			UserManagerRemote user=(UserManagerRemote) o;
			int x=user.verifyUser(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			UserManagerBeanService service=new UserManagerBeanService(); 
			UserManagerRemote remote=service.getUserManagerPort();
			int x=remote.verifyUser(username, password);
			if(x==1){
				str="success";
			}else {
				str = "failure";
				FacesContext fc = FacesContext.getCurrentInstance();
				fc.addMessage("loginError", new FacesMessage("Username or Password is Incorrect"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			return str;
		
	} 
}
