package com.jlcindia.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import com.jlcindia.to.UserTO;

public class UserAction extends DispatchAction{

	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		String un=daf.get("username").toString();
		String pw=daf.get("password").toString();
		UserDelegate ud=new UserDelegate();
		int x=ud.verifyUser(un,pw);
		if(x==1){
			return mapping.findForward("home");
		}else{
			ActionErrors errors=new ActionErrors();
			errors.add("username",new ActionError("login.failed"));
			saveErrors(request, errors);
			return mapping.findForward("index");
		}
	}
	
	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		String fn=daf.get("fname").toString();
		String ln=daf.get("lname").toString();
		String em=daf.get("email").toString();
		String un=daf.get("username").toString();
		String pw=daf.get("password").toString();
		UserTO uto=new UserTO(fn,ln,em,un,pw);
		UserDelegate ud=new UserDelegate();
		int x=ud.registerUser(uto);
		if(x==0){
			ActionErrors errors=new ActionErrors();
			errors.add("username",new ActionError("register.failed"));
			saveErrors(request, errors);
			return mapping.findForward("register");
		}else{
			return mapping.findForward("home");
		}
	}
}
