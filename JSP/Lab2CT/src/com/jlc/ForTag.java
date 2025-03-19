package com.jlc;

import javax.servlet.jsp.tagext.TagSupport;

public class ForTag extends TagSupport {
	static{
		System.out.println("SB");
	}
	public ForTag() {
		System.out.println("DC");
	}
	public void setParent(javax.servlet.jsp.tagext.Tag t) {
		
		System.out.println("setParent()");
	}
	public void setPageContext(javax.servlet.jsp.PageContext pageContext) {
		System.out.println("setPageContext()");
		
	}
	String var;
	int count;
	int n;
	public void setVar(String var) {
		this.var = var;
	}
	public int doStartTag(){
		count=1;
		n=Integer.parseInt(var);
		System.out.println("doStartTag()");
		return EVAL_BODY_INCLUDE;
	}
	public int doAfterBody(){
		System.out.println("doAfterBody()");
		if(count<n){
			count++;
			return EVAL_BODY_AGAIN;
		}else{
			return SKIP_BODY;
		}
	}
	public int doEndTag(){
		System.out.println("doEndTag()");
		return EVAL_PAGE;
	}
}
