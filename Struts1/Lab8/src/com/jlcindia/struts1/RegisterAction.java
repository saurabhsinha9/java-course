package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class RegisterAction extends Action{
	static
	{
		System.out.println("RegisterAction-SB");
	}
	
	public RegisterAction()
	{
		System.out.println("RegisterAction-DC");
	}
	
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
						System.out.println("RegisterAction-execute()");
						String status="home";
						DynaActionForm daf=(DynaActionForm)af;
						String un=daf.get("username").toString();
						System.out.println(daf.get("sid").toString());
						System.out.println(daf.get("username").toString());
						System.out.println(daf.get("password").toString());
						System.out.println(daf.get("email").toString());
						System.out.println(daf.get("dob").toString());
						System.out.println((Long)daf.get("phone"));
						System.out.println((Double)daf.get("fee"));
						System.out.println(daf.get("quali").toString());
								
						String c[]= (String[])daf.get("course");
						for(int i=0;i<c.length;i++)
						{
							System.out.println(c[i]);
						}
						
						System.out.println(daf.get("gender").toString());
						req.setAttribute("UN", un);
						return am.findForward(status);
						
	}


}
