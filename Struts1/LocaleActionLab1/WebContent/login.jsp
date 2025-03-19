<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html>
<body bgcolor="lightYellow">
<center>
<br/>
<table>
<tr>
<td>
<font color="green" size="10">
<bean:message key="acc.login"/>
</font></td>
</tr>
</table>

<font color="red" size="5">${EMSG}</font>
<html:form action="/LoginSubmit">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td><bean:message key="login.un"/></td>
		<td><html:text property="username"/></td>
		<td><html:errors property="username"/></td>
	</tr>
	<tr>
		<td><bean:message key="login.pw"/></td>
		<td><html:password property="password"/></td>
		<td><html:errors property="password"/></td>
	</tr>
	<tr>
		<td colspan="3" align="center"><html:submit value="Login"/></td>
	</tr>
</table>
</html:form>
</center>
<hr/>
<html:link forward="english">English</html:link>&nbsp;&nbsp;
<html:link forward="hindi">Hindi</html:link>&nbsp;&nbsp;
<html:link forward="kannada">Kannada</html:link>&nbsp;&nbsp;
<html:link forward="telugu">Telugu</html:link>&nbsp;&nbsp;
<html:link forward="tamil">Tamil</html:link>&nbsp;&nbsp;
</body>
</html>