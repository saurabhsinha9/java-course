<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<!--<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
--><%@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>register.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <html:form action="register.do">
      <table align="center" width="50%">
        <tr height="5%">
          <td align="center" colspan="3"><font size="5">Registration Form</font></td>
        </tr>
        <tr bgcolor="green">
          <td><font color="white"><h2>Your Login Information</h2></font></td>
        </tr>
      
      
        <tr>
          <td>Username:</td>
          <td><html:text property="username"/></td>
        </tr>
        <tr>
          <td>Password:</td>
          <td><html:password property="password" /></td>
        </tr>
        
        
        <tr bgcolor="green">
          <td><font color="white"><h2>Your Personal Information</h2></font></td>
        </tr>
      
      
        <tr>
          <td>Name:</td>
          <td><html:text property="studname" /></td>
        </tr>
        <tr>
          <td>Email:</td>
          <td><html:text property="studemail" /></td>
        </tr>
        
      
      <tr>
          <td>Phone:</td>
          <td><html:text property="studphone" /></td>
        </tr>
        
      
      <tr bgcolor="green">
          <td><font color="white"><h2>Your Build Your Project Information</h2></font></td>
        </tr>
      
      
        <tr>
          <td>Branchname:</td>
          <td><html:text property="branchname" /></td>
        </tr>
        <tr>
          <td>BatchId:</td>
          <td><html:text property="batchid" /></td>
        </tr>
        
        <tr>
          <td>StudentId:</td>
          <td><html:text property="studid" /></td>
        </tr>
<tr>      
          <td colspan="2" align="center"><html:submit value="Register me" /></td>
        </tr>
      </table>
   </html:form>
  </body>
</html:html>
