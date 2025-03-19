package com.jlc;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class SetTag extends TagSupport {
	String name=null;
	String scope=null;
	String value=null;
	
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
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public int doEndTag() throws JspException{
		try{
			if(JspUtil.isEmpty(scope)){
				pageContext.setAttribute(name,value, PageContext.PAGE_SCOPE);
			}
			else{
				if(scope.equals("page")){
					pageContext.setAttribute(name,value, PageContext.PAGE_SCOPE);
				}
				else if(scope.equals("request")){
					pageContext.setAttribute(name,value, PageContext.REQUEST_SCOPE);
				}
				else if(scope.equals("session")){
					pageContext.setAttribute(name,value, PageContext.SESSION_SCOPE);
				}
				else{
					pageContext.setAttribute(name,value, PageContext.APPLICATION_SCOPE);
				}
			}
			}catch(Exception e){
				System.out.println(e);
			 }
			return EVAL_PAGE;
	}
}
