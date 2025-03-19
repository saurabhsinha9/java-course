<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jlc"%>

<html><body><br><br>
<center>
<h1>Java Learning Center</h1>
<h2>Add Contact Form</h2>
<html:form action="/AddContactSubmit.do?method=addContact">
<table style="font-size:25">

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
<td>Phone No</td>
<td><html:text property="phone"/></td>
<td><html:errors property="phone"/></td>
</tr>

<tr>
<td colspan="2" align ="center">
<html:submit value="Add Contact"/></td>
</tr>

</table>
</html:form>
</center>
</body>
</html>