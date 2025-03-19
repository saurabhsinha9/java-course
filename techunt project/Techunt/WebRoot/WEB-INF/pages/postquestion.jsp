<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    
    
    <title>postquestion.jsp</title>

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
   <html:form action="postquestion.do" method="post">
   <table align="center" width="80%">
   
   <tr>
   <td>Company Name</td>
   <td><html:text property ="compname" size="35"/></td>
   </tr>
   
   <tr>
   <td>Topic Name</td>
   <td>
   <html:select property ="topicid">
   <html:option value="">Select Topic</html:option>
   <html:option value="JAVA">JAVA</html:option>
   
   <html:option value="ORACLE">ORACLE</html:option>
   <html:option value="SERVLET">SERVLET</html:option>
   <html:option value="JSP">JSP</html:option>
   <html:option value="SPRING">SPRING</html:option>
   <html:option value="STRUTS">STRUTS</html:option>
   <html:option value="JAVA">JAVA</html:option>
   <html:option value="JAVA">JAVA</html:option>
   <html:option value="JAVA">JAVA</html:option>
   <html:option value="JAVA">JAVA</html:option>
   </html:select>
    </td>
   </tr>
   
   
   <tr>
   <td>Question</td>
   <td><html:textarea property ="question" cols="50" rows="5"/></td>
   </tr>
   
   <tr>
   <td align="center" colspan="2">
   <html:submit value ="Post Question"/></td>
   </tr>
   </table>
   </html:form>
    </body>
</html:html>
