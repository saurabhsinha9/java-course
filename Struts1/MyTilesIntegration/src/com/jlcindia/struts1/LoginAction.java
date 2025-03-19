package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{
	static{
		System.out.println("LoginAction-SB");
	}
	
	public LoginAction(){
		System.out.println("LoginAction-DC");
	}
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
						System.out.println("LoginAction-execute()begin");
						String result="login";
						LoginForm lf=(LoginForm) af;
						String un=lf.getUsername();
						String pw=lf.getPassword();
						
						if(un.equals(pw)){
							result="home";
							req.setAttribute("UN", un);
						}else{
							req.setAttribute("EMSG", "Invalid User Name or Password");
						}
						System.out.println("LoginAction-execute()end");
		return am.findForward(result);
		
	}


}
