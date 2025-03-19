package com.jlcindia.struts1;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.*;

public class JLCFieldChecks implements Serializable
{
	public static boolean validateSidFormat(Object bean,ValidatorAction va,Field field,ActionErrors errors,HttpServletRequest request)
	{
		String sid=request.getParameter("sid");
		if(sid==null||sid.length()==0)
		{
			errors.add("sid",new ActionError("errors.required"));
			return false;
		}
		else
		{
			if(!sid.startsWith("JLC-"))
			{
				errors.add("sid",new ActionError("errors.sidformat"));
				return false;
			}
			else
			{
				String p2=sid.substring(4);
				if(p2.length()!=3)
				{
					errors.add("sid",new ActionError("errors.sidformat"));
					return false;
				}
				else
				{
					try
					{
						int x=Integer.parseInt(p2);
					}
					catch(Exception e)
					{
						errors.add("sid",new ActionError("errors.sidformat"));
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean coursesRequired(Object bean,ValidatorAction va,Field field,ActionErrors errors,HttpServletRequest request)
	{
		String[] c=request.getParameterValues("course");
		System.out.println("In validateCourses");
		if(c!=null)
		{
			System.out.println("1");
			if(c.length==0)
			{
				System.out.println("2");
				errors.add("course",new ActionError("errors.course.required"));
				return false;
			}
		}
		else
		{
			System.out.println("3");
			errors.add("course",new ActionError("errors.course.required"));
			return false;
		}
		return true;
	}
}
		
	

