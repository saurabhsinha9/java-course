package com.jlcindia.jsp.ctags;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String sname;
	private String email;
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int doEndTag()throws JspException{
		String msg="Hello!"+sname+",Welcome to JSP Custom Tag.<br/>";
		
		if(email==null||email.length()==0){
			msg=msg+"Your email is not specified.";
		}else{
			msg=msg+"your email id is "+email;
		}
				JspWriter out=pageContext.getOut();
				HttpSession session=pageContext.getSession();
					session.setAttribute("MSG",msg);
			try{
				out.println(msg);
			}catch(IOException e){
				e.printStackTrace();
			}
		return EVAL_PAGE;
	}
}
