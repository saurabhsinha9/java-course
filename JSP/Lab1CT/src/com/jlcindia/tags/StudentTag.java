package com.jlcindia.tags;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class StudentTag extends TagSupport{
	String sid=null;
	String name=null;
	String scope=null;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
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
			JspWriter out=pageContext.getOut();
			HttpSession session=pageContext.getSession();
			ServletRequest request=pageContext.getRequest();
			ServletContext application=pageContext.getServletContext();
			
			Student s= new Student();
			s.setSid(sid);
			s.setSname("srinivas");
			s.setEmail("sri@jlc.com");
			s.setPhone(9999);
			
			
			if(scope.equals("session")){
				session.setAttribute(name, s);
			}
			else if(scope.equals("request")){
				request.setAttribute(name, s);
			}
			else if(scope.equals("application")){
				application.setAttribute(name, s);
			}
			out.println("<table border=1>");
			out.println("<tr>");
			out.println("<td>Sid</td>");
			out.println("<td>"+s.getSid()+"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Sname</td>");
			out.println("<td>"+s.getSname()+"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Email</td>");
			out.println("<td>"+s.getEmail()+"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Phone</td>");
			out.println("<td>"+s.getPhone()+"</td>");
			out.println("</tr>");
			out.println("</table>");
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		return EVAL_PAGE;
	}
}
