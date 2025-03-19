package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class BidSearchForm  extends ActionForm
{
	private String bid;
	
	static
	{
		System.out.println("BidSearchForm-SB");
		System.out.println("BidSearchForm class Loaded");
	}
	public BidSearchForm()
	{
		System.out.println("BidSearchForm-DC");
	}

	public String getBid() {
		System.out.println("getBid()");
		return bid;
	}

	public void setBid(String bid) {
		System.out.println("setBid()");
		this.bid = bid;
	}
	
	public void reset(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("reset()");
		this.bid=null;
	}
	public ActionErrors validate(ActionMapping am,HttpServletRequest req)
	{
		System.out.println("validate()");
		ActionErrors errors=new ActionErrors();
		if(bid==null||bid.length()==0)
		{
			errors.add("bid",new ActionError("errors.bidsearch.bid.required"));
			
		}
		else if(!bid.startsWith("B-"))
		{
			errors.add("bid",new ActionError("errors.bidsearch.bid.format1"));
		}
		else
		{
			String p2=bid.substring(2);
			if(p2.length()==0|| p2.length()>3)
			{
				errors.add("bid",new ActionError("errors.bidsearch.bid.format2"));
			}
			else
			{
				try
				{
					int x=Integer.parseInt(p2);
				}
				catch(Exception e)
				{
					errors.add("bid",new ActionError("errors.bidsearch.bid.format2"));
				}
			}
		}
		return errors;
	}
	
}
