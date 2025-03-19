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
    <html:base />
    
    <title>topmenu.jsp</title>

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
    <table width="100%" bgcolor="maroon">
    <tr>
    <td><b><font color="white" size="4" face="arial">Welcome</font>
    </b>
    </td>
    <td align="right"><a href="userhome.jsp">Home</a>&nbsp;
    </td>
    <td align="right"><a href="addbranch.jsp">Add Branch</a>&nbsp;
    </td>
    <td align="right"><a href="addtopic.jsp">Add Topic</a>&nbsp;
    </td>
    <td align="right"><a href="searchuser.jsp">Search User</a>&nbsp;
    </td>
     </tr>
     </table>
     </body>
</html:html>
