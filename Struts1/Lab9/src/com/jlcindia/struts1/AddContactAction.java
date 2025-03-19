package com.jlcindia.struts1;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

public class AddContactAction extends Action{
	static{
		System.out.println("AddContactAction-SB");
		System.out.println("AddContactAction-class Loaded");
	}

	public AddContactAction() {
		super();
		System.out.println("AddContactAction-DC");
	}
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("AddContactAction-execute()");
		
		DynaValidatorForm dvf=(DynaValidatorForm) af;
		
		String fn=dvf.get("fname").toString();
		String ln=dvf.get("lname").toString();
		String em=dvf.get("email").toString();
		String ph=dvf.get("phone").toString();
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(em);
		System.out.println(ph);
		ContactTo cto=new ContactTo(fn, ln, em, ph);
		req.getSession().setAttribute("CTOS", cto);
		return am.findForward("addcontactstatus");
	}
}
