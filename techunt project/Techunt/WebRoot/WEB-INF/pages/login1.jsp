<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>
<%@ taglib prefix="thunt" uri="/WEB-INF/techunt.tld" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<thunt:removeInfoFromSession info="SHOW_POST,UTO,QUESTION_LIST,START,END,TOTAL,SHOW_NEXT,SHOW_PREVIOUS,COMPANY,SEARCH_BY,TOPIC,DATE"/>
    
<html:html locale="true">

  <head>
    <title>login1.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css"/>

  </head>
  
  <body>
  <table width="100%" height="100%" align="center" cellspacing="0" border="1">
        <tr height="5%" bgcolor="maroon">
        <td align="center" colspan="3"></td></tr>
        <tr style="border-style: groove;border-color: blue" valign="middle">
<td width="50%" height="00%">
    <html:form action="login.do" method="post" focus="login">
      <table align="center" >
        <tr height="5%">
        <td align="center" colspan="3"><font size="5">Login Form</font></td></tr>
        <tr>
        <td align="center" class="error" colspan="2">
        <html:errors property="invalid"/>${SESSION_ERROR}</td></tr>
         <tr> <td class="loginLabel">Username:</td>
          <td><html:text property="username" /></td>
          <td align="center" class="error"><html:errors property="username" /></td>
        
        </tr>
        <tr>
          <td class="loginLabel">Password:</td>
          <td><html:password property="password" value=""/></td>
          <td align="center" class="error"><html:errors property="password" /></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><html:submit value="Login Me" styleClass="button"/></td>
        </tr>
        <tr>
          <td colspan="3" align="center">
          <hr /><br />
          <font face="arial" size="4">New User &nbsp;&nbsp;&nbsp; </font>
        <a href="showregistration.do"><font face="arial" size="4">SignUp Here</font></a></td>
        </tr>
        
      </table>
    </html:form></td></tr></table>
  </body>
</html:html>
