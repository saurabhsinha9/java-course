package com.jlcindia.ejb3;

import javax.ejb.Remote;
import javax.jws.WebService;
@WebService
@Remote
public interface HelloRemote {
	public String getMessage(String name);
}
