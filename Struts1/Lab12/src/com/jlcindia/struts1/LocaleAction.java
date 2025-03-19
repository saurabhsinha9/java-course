package com.jlcindia.struts1;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LocaleAction extends Action{
	static{
		System.out.println("LocaleAction-SB");
		System.out.println("LocaleAction-class Loaded");
	}
	
	public LocaleAction() {
		super();
		System.out.println("LocaleAction-DC");
	}

	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		System.out.println("LocaleAction-execute()");
		String l=req.getParameter("language");
		System.out.println(l);
		Locale loc=new Locale(l);
		HttpSession hs=req.getSession();
		Locale lo=(Locale) hs.getAttribute(Action.LOCALE_KEY);
		System.out.println("current locale is	"+lo.getLanguage());
		hs.setAttribute(Action.LOCALE_KEY, loc);
		System.out.println("locale is changaed to	"+l);
		return am.findForward("search");
	}
}
