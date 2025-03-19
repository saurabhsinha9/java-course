package com.techno.techunt.iq.actions;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.springframework.beans.factory.annotation.Autowired;

import com.techno.techunt.iq.actions.to.UserTO;
import com.techno.techunt.iq.service.UserService;
import com.techno.techunt.iq.service.impl.UserServiceImpl;

public class LoginAction extends Action{
	@Autowired
	UserService userService;
		public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	System.out.println("in execute()");
	String page="invalid";
	
	DynaValidatorForm dvf=(DynaValidatorForm) form;
	String uname=(String) dvf.get("username");
	String pwd=dvf.get("password").toString();
	System.out.println(uname);
	System.out.println(pwd);
	
	UserTO uto=userService.verifyuser(uname, pwd);
	if(uto!=null)
	{
		return  mapping.findForward("success");
	}
	
	else
	{
		return  mapping.findForward("invalid");
	}
	
	}

}
