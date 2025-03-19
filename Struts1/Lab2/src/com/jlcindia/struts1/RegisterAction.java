package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

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
						RegisterForm rf=(RegisterForm) af;
						String un=rf.getUsername();
						
						System.out.println(rf.getSid());
						System.out.println(rf.getUsername());
						System.out.println(rf.getPassword());
						System.out.println(rf.getEmail());
						System.out.println(rf.getDob());
						System.out.println(rf.getPhone());
						System.out.println(rf.getFee());
						System.out.println(rf.getQuali());
						System.out.println(rf.getGender());
						String c[]=rf.getCourse();
						if(c!=null){
							for(int i=0;i<c.length;i++){
								System.out.println(c[i]);
							}
						}
						
						req.setAttribute("UN", un);
		return am.findForward(status);
	}


}
