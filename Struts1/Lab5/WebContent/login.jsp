<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<body bgcolor="lightYellow">
<center>
<br/><font color="green">
<h1>Java Learning center</h1>
<h2>Account Login Form</h2>
</font>
<html:form action="/login.do">
<html:errors property="invalid"/>
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td>User Name</td>
		<td><html:text property="uname"/></td>
		<td><html:errors property="uname"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><html:password property="pword"/></td>
		<td><html:errors property="pword"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><html:submit value="Login"/></td>
	</tr>
</table>
<html:javascript formName="loginForm"/>
<%--<html:javascript formName="loginForm"/> this line is enabling javascript and doing clientside validation --%>
</html:form>
</center>
</body>
</html>