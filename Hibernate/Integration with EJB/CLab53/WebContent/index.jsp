<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

<html>
<body>
<center>
<br><br>
<h1>Account Login</h1>
<html:errors/>
<html:form action="/LoginSubmit.do?method=login">
<table>
<tr>
<td>Username</td>
<td><html:text property="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><html:text property="password"/></td>
</tr>
<tr>
<td colspan="2" align="center"><html:submit value="Account Login"/></td>
</tr>
</table>
</html:form>
<br>
<html:link forward="register">New User SignUp</html:link>
</center>
</body>
</html>