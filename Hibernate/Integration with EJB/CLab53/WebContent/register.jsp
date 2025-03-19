<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

<html>
<body>
<center>
<br><br>
<h1>Account Registration</h1>
<html:errors/>
<html:form action="/RegisterSubmit.do?method=register">
<table>
<tr>
<td>Firstname</td>
<td><html:text property="fname"/></td>
</tr>
<tr>
<td>Lastname</td>
<td><html:text property="lname"/></td>
</tr>
<tr>
<td>Email</td>
<td><html:text property="email"/></td>
</tr>
<tr>
<td>Username</td>
<td><html:text property="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><html:text property="password"/></td>
</tr>
<tr>
<td colspan="2" align="center"><html:submit value="Account Register"/></td>
</tr>
</table>
</html:form>
</center>
</body>
</html>