package com.jlcindia.ctags;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class StudentTagHandler extends TagSupport {
	static{
		System.out.println("StudentTagHandler-SB");
	}
	public StudentTagHandler() {
		System.out.println("StudentTagHandler-DC");
	}

	
	
	ArrayList al=null;
	public void addValue(String value){
		System.out.println("StudentTagHandler-addValue()");
		al.add(value);
	}
	public int doStartTag()throws JspException{
		System.out.println("StudentTagHandler-doStartTag()");
		try{
			al=new ArrayList();
		}catch(Exception e){
			System.out.println(e);
		}
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() throws JspException{
		System.out.println("StudentTagHandler-doEndTag()");
		try{
			JspWriter out=pageContext.getOut();
			String msg[]={"Student Name","Email","Phone"};
			out.println("<table border=1 bgcolor=cyan>");
			for(int i=0;i<al.size();i++){
				out.println("<tr>");
				out.println("<td>"+msg[i]+"</td>");
				out.println("<td>"+al.get(i)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		}catch(Exception e){
			System.out.println(e);
		}
		return EVAL_PAGE;
	}
}
