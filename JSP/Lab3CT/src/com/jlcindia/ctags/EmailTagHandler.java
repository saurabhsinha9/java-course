package com.jlcindia.ctags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class EmailTagHandler extends TagSupport{
	static{
		System.out.println("EmailTagHandler-SB");
	}
	public EmailTagHandler() {
		System.out.println("EmailTagHandler-DC");
	}


	
	private String value=null;
	public void setValue(String value){
		System.out.println("EmailTagHandler-setValue()");
		this.value=value;
	}
	public int doEndTag() throws JspException{
		System.out.println("EmailTagHandler-doEndTag()");
		try{
			StudentTagHandler sth=(StudentTagHandler)getParent();
			sth.addValue(value);
		}catch(Exception e){
			System.out.println(e);
		}
		return EVAL_PAGE;
	}
}
