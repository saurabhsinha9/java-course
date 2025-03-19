package com.jlc;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class RemoveTag extends TagSupport {
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
		try{
			if(!JspUtil.isEmpty(scope)){
				if(scope.equals("page")){
					pageContext.removeAttribute(name, PageContext.PAGE_SCOPE);
				}
				else if(scope.equals("request")){
					pageContext.removeAttribute(name, PageContext.REQUEST_SCOPE);
				}
				else if(scope.equals("session")){
					pageContext.removeAttribute(name, PageContext.SESSION_SCOPE);
				}
				else{
					pageContext.removeAttribute(name, PageContext.APPLICATION_SCOPE);
				}
			}
				else{
					pageContext.removeAttribute(name, PageContext.PAGE_SCOPE);
				}
	}catch(Exception e){
			System.out.println(e);
	}
	return EVAL_PAGE;
}
}
