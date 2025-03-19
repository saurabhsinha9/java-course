<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index.jsp</title>
</head>
<body bgcolor="lightYellow">
<center>
<br/>
<font color="green">
<h1>Java Learning Center</h1>
<h3>
<html:link forward="addcontact">Add Contact</html:link><br/><br/><br/>
<html:link forward="searchcontact">Update Contact</html:link>
</h3></font>
</center>
</body>
</html>