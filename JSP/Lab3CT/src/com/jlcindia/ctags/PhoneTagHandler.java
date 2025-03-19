package com.jlcindia.ctags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PhoneTagHandler extends TagSupport{
	static{
		System.out.println("PhoneTagHandler-SB");
	}
	public PhoneTagHandler() {
		System.out.println("PhoneTagHandler-DC");
	}

	
	private String value=null;
	public void setValue(String value){
		System.out.println("PhoneTagHandler-setValue()");
		this.value=value;
	}
	public int doEndTag() throws JspException{
		System.out.println("PhoneTagHandler-doEndTag()");
		try{
			StudentTagHandler sth=(StudentTagHandler)getParent();
			sth.addValue(value);
		}catch(Exception e){
			System.out.println(e);
		}
		return EVAL_PAGE;
	}
}
