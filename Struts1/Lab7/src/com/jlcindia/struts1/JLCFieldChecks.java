package com.jlcindia.struts1;


import javax.servlet.http.HttpServletRequest;
import org.apache.commons.validator.*;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;

public class JLCFieldChecks 
{
	public  boolean validateSid(Object bean,ValidatorAction va,Field f,ActionErrors errors,HttpServletRequest req)
	{
		System.out.println("JLCFieldChecks-validateSid()");
		boolean flag=false;
		String sid=req.getParameter("sid");
		if(sid==null||sid.length()==0)
		{
			flag=true;
			errors.add("sid",new ActionError("errors.sid.required"));
			
		}
		else if(!sid.startsWith("JLC-"))
		{	
			flag=true;
			errors.add("sid",new ActionError("errors.sid.format1"));
			
		}
		else
		{
			String p2=sid.substring(4);
			if(p2.length()==0||p2.length()>4)
			{
				flag=true;
				errors.add("sid",new ActionError("errors.sid.format2"));
				
				}
				else
				{
					try
					{
						int x=Integer.parseInt(p2);
					}
					catch(Exception e)
					{
						flag=true;
						errors.add("sid",new ActionError("errors.sid.format2"));
						
					}
				}
			}
		
		return flag;
	}
	
	public  boolean validateBid(Object bean,ValidatorAction va,Field f,ActionErrors errors,HttpServletRequest req)
	{
		System.out.println("JLCFieldChecks-validateBid()");
		boolean flag=false;
		String bid=req.getParameter("bid");
		if(bid==null||bid.length()==0)
		{
			flag=true;
			errors.add("bid",new ActionError("errors.bid.required"));
			
		}
		else if(!bid.startsWith("B-"))
		{	
			flag=true;
			errors.add("bid",new ActionError("errors.bid.format1"));
			
		}
		else
		{
			String p2=bid.substring(2);
			if(p2.length()==0||p2.length()>3)
			{
				flag=true;
				errors.add("bid",new ActionError("errors.bid.format2"));
				
				}
				else
				{
					try
					{
						int x=Integer.parseInt(p2);
					}
					catch(Exception e)
					{
						flag=true;
						errors.add("bid",new ActionError("errors.bid.format2"));
						
					}
				}
			}
		
		return flag;
	}
}
		
	

