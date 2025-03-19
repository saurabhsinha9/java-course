package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

public class LoginAction extends Action{
	static
	{
		System.out.println("LoginAction-SB");
	}
	
	public LoginAction()
	{
		System.out.println("LoginAction-DC");
	}
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
					System.out.println("LoginAction-execute()");
					
					DynaValidatorForm dvf= (DynaValidatorForm) af;
					String un=dvf.get("uname").toString();
					String pw=dvf.get("pword").toString();
						//call model
					String str="login";
						if(un.equals(pw)){
							str="success";
							req.setAttribute("UN", un);
						}else{
							ActionErrors errors=new ActionErrors();
							errors.add("invalid",new ActionError("login.invalid"));
							this.saveErrors(req, errors);
						}
						ActionForward forward=am.findForward(str);
		return forward;
	}


}
