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
<h2>Search Contact Form</h2>
</font>
<html:form action="/SearchContactSubmit.do">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td>Email Id</td>
		<td><html:text property="email"/></td>
		<td colspan="3" align="center""><html:submit value="ShowContact"/></td>
		<td><html:errors property="email"/></td>
	</tr>	
</table>
</html:form>
</center>
</body>
</html>