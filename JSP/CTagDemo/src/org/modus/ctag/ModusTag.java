package org.modus.ctag;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ModusTag extends TagSupport {
	String empid="";
	String ename="";
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int doEndTag() throws JspException {
		String msg="Hello! ";
		if(empid!="" && ename!=""){
			msg=msg+"<h1>"+empid+"-"+ename+"</h1>";
		}
		JspWriter out =pageContext.getOut();
		HttpSession session=pageContext.getSession();
		session.setAttribute("MSG", msg);
		try {
			out.println(msg);
		} catch (Exception e) {
			System.out.println("Error in Tag");
		}
		return EVAL_PAGE;
	}
}
