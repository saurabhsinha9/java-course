package com.techno.techunt.iq.tags;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ShowTotalPostTag extends TagSupport{
	
	@SuppressWarnings("unchecked")
	@Override
	public int doEndTag() throws JspException {
	
		Object obj=pageContext.getAttribute("TOPIC_INFO",pageContext.APPLICATION_SCOPE);
		int sum=0;
		if(obj!=null)
		{
		Map<String,Integer> map=(Map<String,Integer>)obj;
		Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Integer> entry=(Map.Entry<String, Integer>)it.next();
			sum=sum+entry.getValue();
				
		}		
		}
		try {
			pageContext.getOut().write(""+sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
}
