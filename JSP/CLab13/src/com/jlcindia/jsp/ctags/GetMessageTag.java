package com.jlcindia.jsp.ctags;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GetMessageTag extends TagSupport{
private int empId;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}
	public int doEndTag() throws JspException {
		String msg="Hello Guys<br/>";
			if(empId<=0){
				msg=msg+"Id is Invalid.Please Provide correct Information";
			}else if(empId>0&&empId<10){
				msg=msg+"come to office on time";
			}else if(empId>=10&&empId<99){
				msg=msg+"you get the new project";
			}else{
				msg=msg+"you are genious.report to the head office";
			}
			JspWriter out=pageContext.getOut();
			HttpSession session=pageContext.getSession();
			session.setAttribute("MSG", msg);
			try {
				out.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return EVAL_PAGE;
	}
}
