package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.validator.DynaValidatorForm;

public class ContactAction extends DispatchAction{
	
	static{
		System.out.println("ContactAction-SB");
		System.out.println("ContactAction-class Loaded");
	}

	public ContactAction() {
		super();
		System.out.println("ContactAction-DC");
	}
	
	public ActionForward addContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("ContactAction-addContact()");
		DynaValidatorForm dvf=(DynaValidatorForm) af;
		
		String fn=dvf.get("fname").toString();
		String ln=dvf.get("lname").toString();
		String em=dvf.get("email").toString();
		String ph=dvf.get("phone").toString();
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(em);
		System.out.println(ph);
		
		return am.findForward("addcontactstatus");
	}
	
	
	public ActionForward searchContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("ContactAction-searchContact()");
		
		DynaValidatorForm dvf=(DynaValidatorForm) af;
		
		
		String em=dvf.get("email").toString();
		ContactTo cto=new ContactTo("Srinivas","Dande",em,"999999");
		req.setAttribute("CTO", cto);
		return am.findForward("updatecontact");
	}
	
	
	public ActionForward updateContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("ContactAction-updateContact()");
		
		DynaValidatorForm dvf=(DynaValidatorForm) af;
		
		String fn=dvf.get("fname").toString();
		String ln=dvf.get("lname").toString();
		String em=dvf.get("email").toString();
		String ph=dvf.get("phone").toString();
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(em);
		System.out.println(ph);
		return am.findForward("updatecontactstatus");
	}
	
}
