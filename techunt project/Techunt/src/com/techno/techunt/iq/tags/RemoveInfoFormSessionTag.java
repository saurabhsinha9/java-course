package com.techno.techunt.iq.tags;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class RemoveInfoFormSessionTag extends TagSupport{
	private String info;

	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public int doEndTag() throws JspException {
HttpSession sess=pageContext.getSession();
String str[]=info.split(",");
for (int i = 0; i < str.length; i++) {
	sess.removeAttribute(str[i]);
}
return EVAL_PAGE;
	}
	
}