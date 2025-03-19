package com.jlcindia.ctags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SnameTagHandler extends TagSupport {
	static{
		System.out.println("SnameTagHandler-SB");
	}
	public SnameTagHandler() {
		System.out.println("SnameTagHandler-DC");
	}
	

	public void setPageContext(javax.servlet.jsp.PageContext pageContext) {
		System.out.println("setPageContext()");
		
	}
	private String value=null;
	public void setValue(String value){
		System.out.println("SnameTagHandler-setValue()");
		this.value=value;
	}
	public int doEndTag() throws JspException{
		System.out.println("SnameTagHandler-doEndTag()");
		try{
			StudentTagHandler sth=(StudentTagHandler)getParent();
			sth.addValue(value);
		}catch(Exception e){
			System.out.println(e);
		}
		return EVAL_PAGE;
	}
}
