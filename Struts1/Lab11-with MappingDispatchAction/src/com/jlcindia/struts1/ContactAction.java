package com.jlcindia.struts1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;
import org.apache.struts.validator.DynaValidatorForm;

public class ContactAction extends MappingDispatchAction{
	
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
		ContactForm cf=(ContactForm) af;
		
		System.out.println(cf.getFname());
		System.out.println(cf.getLname());
		System.out.println(cf.getEmail());
		System.out.println(cf.getPhone());
		
		return am.findForward("addcontactstatus");
	}
	
	
	public ActionForward searchContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("ContactAction-searchContact()");
		
		ContactForm cf=(ContactForm) af;
		
		HttpSession s=req.getSession();
		Enumeration<String> e=s.getAttributeNames();
		ArrayList<String> list=Collections.list(e);
		
		for(String str:list){
			System.out.println(str);
		}
		cf.setFname("srinivas");
		cf.setLname("Dande");
		cf.setPhone("99999");
		return am.findForward("updatecontact");
	}
	
	
	public ActionForward updateContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("ContactAction-updateContact()");
		
		ContactForm cf=(ContactForm) af;
		
		System.out.println(cf.getFname());
		System.out.println(cf.getLname());
		System.out.println(cf.getEmail());
		System.out.println(cf.getPhone());
		return am.findForward("updatecontactstatus");
	}
	
}
