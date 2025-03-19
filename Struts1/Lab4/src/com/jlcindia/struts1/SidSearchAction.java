package com.jlcindia.struts1;

import java.util.ArrayList;
import javax.servlet.http.*;
import org.apache.struts.action.*;


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
		SidSearchForm ssf=(SidSearchForm)af;
		String sid=ssf.getSid();
		
		if(sid.equals("JLC-123")||sid.equals("JLC-999"))
		{
			StudentTO sto=new StudentTO("B-999",sid,"Srinivas","sri@jlc.com","999999");
			
			req.setAttribute("STO",sto);
			
		}
		else
		{
			ActionErrors errors=new ActionErrors();
			errors.add("sid",new ActionError("errors.sidsearch.sid.notfound"));
			this.saveErrors(req, errors);
		}
		return am.findForward("sidsearch");
		
	}
}
