package com.techno.techunt.iq.tags;

import java.io.Writer;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SessionValidateTag extends TagSupport {
	
	@Override
	public int doEndTag() throws JspException {
		HttpSession sess=pageContext.getSession();
		if(sess==null||sess.getAttribute("UTO")==null||pageContext.getServletContext().getAttribute("TOPIC_INFO")==null)
		{
			try
			{
				HttpServletResponse res=(HttpServletResponse) pageContext.getResponse();
				Writer out=res.getWriter();
				out.write("<script type=\text/javascript\">window.location=\"http://localhost:8080/Techunt/home.jsp\";</script>");
				res.sendRedirect("http://localhost:8080/Techunt/home.jsp");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				
		}
		return EVAL_PAGE;
			
		
	}
	
	}
