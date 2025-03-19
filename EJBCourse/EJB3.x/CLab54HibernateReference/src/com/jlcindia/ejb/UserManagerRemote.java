package com.jlcindia.ejb;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@Remote
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface UserManagerRemote{
	@WebMethod
	public int verifyUser(String un,String pw);
}
