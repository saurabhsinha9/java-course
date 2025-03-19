<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body bgcolor="lightYellow">
<center>
<br/>
<html:link href="index.jsp">go to index</html:link>
<font color="green">
<h1>Java Learning Center</h1>
<h2>Add Contact Form</h2>
</font>
<html:form action="/AddContactSubmit">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td>First Name</td>
		<td><html:text property="fname"/></td>
		<td><html:errors property="fname"/></td>
	</tr>
	
	<tr>
		<td>Last Name</td>
		<td><html:text property="lname"/></td>
		<td><html:errors property="lname"/></td>
	</tr>
	
	<tr>
		<td>Email Id</td>
		<td><html:text property="email"/></td>
		<td><html:errors property="email"/></td>
	</tr>
	
	<tr>
		<td>Phone</td>
		<td><html:text property="phone"/></td>
		<td><html:errors property="phone"/></td>
	</tr>
	
	<tr>
		<td colspan="3" align="center""><html:submit value="AddContact"/></td>
	</tr>
	
</table>
</html:form>
</center>
</body>
</html>