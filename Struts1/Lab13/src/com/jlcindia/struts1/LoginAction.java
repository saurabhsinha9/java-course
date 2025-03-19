package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{
	static{
		System.out.println("LoginAction-SB");
	}
	
	public LoginAction() {
		System.out.println("LoginAction-DC"); 
	}
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("LoginAction-execute()");
		
		HttpSession hs=req.getSession();
		String username=(String)PropertyUtils.getSimpleProperty(af,"username");
		String password=(String)PropertyUtils.getSimpleProperty(af,"password");
		if(username.equals(password)){
			hs.setAttribute("user", username);
		}
		return am.findForward("success");
	}
}
