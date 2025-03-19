package com.jlcindia.jsp.ctags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class HelloTag extends BodyTagSupport {
	BodyContent bc=null;
	static{
		System.out.println("HelloTag-SB");
	}
	public HelloTag(){
	System.out.println("HelloTag-DC");
	}
	public  int doStartTag() throws JspException{
		System.out.println("doStartTag()");
		return EVAL_BODY_BUFFERED;
	}
	public void setBodyContent(BodyContent bc){
		System.out.println("setBodyContent()");
		String bodyedit="we have editted the body means we have control over body";
		CharSequence cs=bodyedit.toLowerCase();
		try {
			bc.append(cs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.bc=bc;
	}
	public void doInitBody(){
		System.out.println("doInitBody()");
	}
	public int doAfterBody() throws JspException{
		System.out.println("doAfterBody()");
		return SKIP_BODY;
	}
	public int doEndTag() throws JspException{
		System.out.println("doEndTag()");
		String body=bc.getString();
		System.out.println(body);;
		
		body=body+"welcome to Java Learning Center";
		System.out.println(body);
		JspWriter out=bc.getEnclosingWriter();
		try{
			out.println(body);
		}catch(Exception e){
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
}
