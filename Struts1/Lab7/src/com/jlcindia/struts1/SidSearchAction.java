package com.jlcindia.struts1;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;


public class SidSearchAction extends Action
{
	static
	{
		System.out.println("SidSearchAction-SB");
		System.out.println("SidSearchAction-class Loaded");
	}
	public SidSearchAction()
	{
		System.out.println("SidSearchAction-DC");
	}
	
	
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		System.out.println("SidSearchAction-execute()");
		DynaValidatorForm dvf=(DynaValidatorForm)af;
		String sid=dvf.get("sid").toString();
		
		if(sid.equals("JLC-123")||sid.equals("JLC-999"))
		{
			
			StudentTO sto=new StudentTO("B-999",sid,"Srinivas","sri@jlc.com","999999");
						
			req.setAttribute("STO",sto);
			
		}
		else
		{
			ActionErrors errors=new ActionErrors();
			errors.add("sid",new ActionError("errors.sid.notfound"));
			this.saveErrors(req, errors);
		}
		return am.findForward("sidsearch");
		

	}
}
