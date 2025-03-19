package com.jlcindia.struts1;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

public class SearchContactAction extends Action{
	static{
		System.out.println("SearchContactAction-SB");
		System.out.println("SearchContactAction-class Loaded");
	}

	public SearchContactAction() {
		super();
		System.out.println("SearchContactAction-DC");
	}
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("SearchContactAction-execute()");
		
		DynaValidatorForm dvf=(DynaValidatorForm) af;
		
		
		String em=dvf.get("email").toString();
		ContactTo c=(ContactTo)req.getSession().getAttribute("CTOS");
		ContactTo cto=new ContactTo(c.getFname(),c.getLname(),em,c.getPhone());
		
		req.setAttribute("CTO", cto);
		
		return am.findForward("updatecontact");
	}
}
