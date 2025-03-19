package com.jlcindia.struts1;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class SearchAction extends Action{
	static{
		System.out.println("SearchAction-SB");
		System.out.println("SearchAction-class Loaded");
	}
	
	public SearchAction() {
		super();
		System.out.println("SearchAction-DC");
	}
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
		DynaActionForm df=(DynaActionForm) af;
		String h=df.get("hello").toString();
		System.out.println(h);
		HttpSession hs=req.getSession();
		
		Locale lo=(Locale) hs.getAttribute(Action.LOCALE_KEY);
		System.out.println("current locale is	"+lo.getLanguage());
		
		return am.findForward("result");
	}
}
