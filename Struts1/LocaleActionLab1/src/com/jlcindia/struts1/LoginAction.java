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

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		LoginForm lf=(LoginForm) af;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		System.out.println(un+"\t"+pw);
		String result="login";
		if(un.equals(pw)){
			result="home";
			req.setAttribute("UN", un);
		}else{
			req.setAttribute("EMSG", "Invalid User Name or Password");
		}
		
		/*HttpSession hs=req.getSession();
		Locale lo=(Locale) hs.getAttribute(Action.LOCALE_KEY);
		System.out.println("current locale is	"+lo.getLanguage());
		*/
		return am.findForward(result);
	}
}
