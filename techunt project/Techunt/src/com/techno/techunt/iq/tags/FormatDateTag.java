package com.techno.techunt.iq.tags;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class FormatDateTag extends TagSupport{
private Date value;

public void setValue(String value) {
	String str[]=value.split("-");
	int d=Integer.parseInt(str[2]);
	int m=Integer.parseInt(str[1]);
	int y=Integer.parseInt(str[0]);
	Date dt=new Date(y-1900,m-1,d);
	this.value = dt;
}
@Override
	public int doEndTag() throws JspException {
try {
	pageContext.getOut().write(getDate(value));
} catch (Exception e) {
	e.printStackTrace();
}		return EVAL_PAGE;
	}
private static String getDate(Date date) {
	String value="";
	Format formatter=new SimpleDateFormat("dd-MMM-yyyy");
	value=formatter.format(date);
	return value;
}
}
