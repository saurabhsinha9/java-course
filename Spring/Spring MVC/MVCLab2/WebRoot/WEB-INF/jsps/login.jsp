<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
<h1>User Account Login</h1>
<form:form method="post" commandName="user">
<table width="60%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5" align="center">
<tr>
<td align="right" width="20%">UserName</td>
<td width="25%"><form:input path="username"/></td>
<td width="35%"><font color="red" size="5">
<form:errors path="username" cssClass="error"/>
</font>
</td>
</tr>

<tr>
<td align="right" width="20%">Password</td>
<td width="25%"><form:input path="password"/></td>
<td width="35%"><font color="red" size="5">
<form:errors path="password" cssClass="error"/>
</font>
</td>
</tr>
</table>
<br>
<input type="submit" value="Account Login"/>
</form:form>
</body>
</html>

