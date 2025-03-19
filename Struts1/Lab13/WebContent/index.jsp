<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<html>
<body>
<center>
<br/>
<font size="5" color="green">Java Learning Center</font>
<logic:notPresent name="user" scope="session">
<html:form action="/LoginSubmit">
<table>
	<tr>
		<td align="center" colspan="2"><h1>Account Login</h1></td>
	</tr>
	<tr>
		<td>User Name:</td>
		<td><html:text property="username"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><html:password property="password"/></td>
	</tr>
	<tr>
		<td align="center" colspan="2"><html:submit value="Login"/></td>
	</tr>
</table>
</html:form>
</logic:notPresent>
<hr>
<logic:present name="user" scope="session">
<ul>
	<li><html:link action="/changeModule.do?prefix=/fees&amp;page=/feeshome.jsp">Fees Module</html:link></li>
	<li><html:link action="/changeModule.do?prefix=/enquiry&amp;page=/enquiryhome.jsp">Enquiry Module</html:link></li>
	<li><html:link action="/changeModule.do?prefix=/student&amp;page=/studenthome.jsp">Student Module</html:link></li>
</ul>
</hr>
</logic:present>
</center>
</body>
</html>