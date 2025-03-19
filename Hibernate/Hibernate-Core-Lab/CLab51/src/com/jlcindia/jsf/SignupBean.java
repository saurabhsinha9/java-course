package com.jlcindia.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.jlcindia.to.UserTO;

public class SignupBean extends JLCBaseBean {
	private String fullname;
	private String email;
	private String username;
	private String password;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String registerUser() {
		UserTO uto = new UserTO();
		uto.setFullname(fullname);
		uto.setEmail(email);
		uto.setUsername(username);
		uto.setPassword(password);
		uto = userDAO.registerUser(uto);
		FacesContext fc = FacesContext.getCurrentInstance();
		String str = "";
		if (uto.getUserId() == 0) {
			str = "failure";
			fc.addMessage("regiserErro", new FacesMessage(
					"Registration Failed.."));
		} else {
			str = "success";
			ExternalContext ec = fc.getExternalContext();
			HttpSession hs = (HttpSession) ec.getSession(false);
			hs.setAttribute("UTO", uto);
		}
		return str;
	}
}
