<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html>
<body bgcolor="lightYellow">
<center>
<br/>
<font color="green">
<h1>Java Learning Center</h1>
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