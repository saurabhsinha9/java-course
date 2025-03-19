package com.jlcindia.ejb3;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
public class HelloBean implements HelloRemote {

	public String getMessage(String name) {
		return "Hello ! "+name+" Welcome to JBoss WS World...JLC";
	}

}
