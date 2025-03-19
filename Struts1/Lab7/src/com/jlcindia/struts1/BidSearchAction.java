package com.jlcindia.struts1;

import java.util.ArrayList;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.validator.DynaValidatorForm;


public class BidSearchAction extends Action
{
	static
	{
		System.out.println("BidSearchAction-SB");
		System.out.println("BidSearchAction class Loaded");
	}
	public BidSearchAction()
	{
		System.out.println("BidSearchAction-DC");
	}
	
	
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		System.out.println("execute()");
		DynaValidatorForm dvf=(DynaValidatorForm)af;
		String bid=dvf.get("bid").toString();
		
		if(bid.equals("B-123")||bid.equals("B-999"))
		{
			ArrayList<StudentTO> al=new ArrayList<StudentTO>();
			StudentTO sto=new StudentTO(bid,"JLC-123","Srinivas","sri@jlc.com","999999");
			al.add(sto);
			al.add(sto);
			al.add(sto);
			al.add(sto);
			al.add(sto);
			al.add(sto);
			
			req.setAttribute("STUINFO",al);
			
		}
		else
		{
			throw new BatchIDNotFoundException();
		}
		return am.findForward("bidsearch");

	}
}
