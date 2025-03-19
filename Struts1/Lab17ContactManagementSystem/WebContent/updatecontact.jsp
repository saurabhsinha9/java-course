<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jlc"%>

<html><body>
<br><br><center>
<h1>Java Learning Center</h1>
<h1>Update Contact Form</h1>

<html:form action="/UpdateContactSubmit.do?m=updateContact">
<table style="font:size:25">
<tr><td>Contact ID</td>
<td>${contactForm.contactId}</td>
<td></td></tr>


<tr><td>First Name</td>
<td><html:text property="fname" value="${contactForm.fname}"/></td>
<td><html:errors property="fname"/></td></tr>

<tr><td>Last Name</td>
<td><html:text property="lname" value="${contactForm.lname}"/></td>
<td><html:errors property="lname"/></td></tr>

<tr><td>Email Id</td>
<td><html:text property="email" value="${contactForm.email}"/></td>
<td><html:errors property="email"/></td></tr>

<tr><td>Phone No</td>
<td><html:text property="phone" value="${contactForm.phone}"/></td>
<td><html:errors property="phone"/></td></tr>

<tr><td>Status</td>
<td><html:select property="status" value="${contactForm.status}">
<html:option value="Enabled">Enabled</html:option>
<html:option value="Disabled">Disabled</html:option>
</html:select></td>
<td><html:errors property="status"/></td></tr>

<tr><td colspan="2" align ="center"><html:submit value="Update Contact"/></td>
</tr>

</table></html:form>
</center></body></html>
