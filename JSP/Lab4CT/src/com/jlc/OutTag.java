package com.jlc;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class OutTag extends TagSupport {
	String name=null;
	String scope=null;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
	public int doEndTag() throws JspException{
		String val="";
		try{
			if(!JspUtil.isEmpty(scope)){
				if(scope.equals("page")){
					val=pageContext.getAttribute(name, PageContext.PAGE_SCOPE).toString();
				}
				else if(scope.equals("request")){
					val=pageContext.getAttribute(name, PageContext.REQUEST_SCOPE).toString();
				}
				else if(scope.equals("session")){
					val=pageContext.getAttribute(name, PageContext.SESSION_SCOPE).toString();
				}
				else{
					val=pageContext.getAttribute(name, PageContext.APPLICATION_SCOPE).toString();
				}
			}
				else{
					val=pageContext.getAttribute(name, PageContext.PAGE_SCOPE).toString();
				}
			JspWriter out=pageContext.getOut();
			out.write(val);
			}catch(Exception e){
				System.out.println(e);
			 }
			return EVAL_PAGE;
	}
}
