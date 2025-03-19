package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class SidSearchForm  extends ActionForm
{
	private String sid;
	
	static
	{
		System.out.println("SidSearchForm-SB");
		System.out.println("SidSearchForm-class Loaded");
	}
	public SidSearchForm()
	{
		System.out.println("SidSearchForm-DC");
	}
	

	public String getSid() {
		System.out.println("getSid()");
		return sid;
	}


	public void setSid(String sid) {
		System.out.println("setSid()");
		this.sid = sid;
	}


	public void reset(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("SidSearchForm-reset()");
		this.sid=null;
	}
	public ActionErrors validate(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("SidSearchForm-validate()");
		ActionErrors errors=new ActionErrors();
		if(sid==null||sid.length()==0)
		{
			errors.add("sid",new ActionError("errors.sidsearch.sid.required"));
			
		}
		else if(!sid.startsWith("JLC-"))
		{
			errors.add("sid",new ActionError("errors.sidsearch.sid.format1"));
		}
		else
		{
			String p2=sid.substring(4);
			if(p2.length()==0|| p2.length()>4)
			{
				errors.add("sid",new ActionError("errors.sidsearch.sid.format2"));
			}
			else
			{
				try
				{
					int x=Integer.parseInt(p2);
				}
				catch(Exception e)
				{
					errors.add("sid",new ActionError("errors.sidsearch.sid.format2"));
				}
			}
		}
		return errors;
	}
	
}
