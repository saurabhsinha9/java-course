<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp</title>
</head>
<body bgcolor="lightYellow">
<center>
<br/>
<font color="green">
<h1>Java Learning center</h1>
<h2>Login Form</h2>
</font>
<font color="red" size="5">${EMSG}</font>
<html:form action="/LoginSubmit">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td>User Name</td>
		<td><html:text property="username"/></td>
		<td><html:errors property="username"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><html:password property="password"/></td>
		<td><html:errors property="password"/></td>
	</tr>
	<tr>
		<td colspan="3" align="center"><html:submit value="Login"/></td>
	</tr>
</table>
</html:form>
</center>
</body>
</html>