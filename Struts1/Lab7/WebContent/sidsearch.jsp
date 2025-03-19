<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="lightYellow">
<center><br/><html:link href="index.jsp">go to index</html:link>
<font color="green">
<h1>Java Learning Center</h1>
<h2>Search Form</h2>
</font>
<html:form action="/SidSubmit">
<table bgcolor="grey" border="3" bordercolor="blue" >
	<tr>
		<td><bean:message key="label.sidsearch.sid"/></td>
	</tr>
	<tr>
		<td><html:text property="sid"/></td>
	</tr>
	<tr>
		<td><html:errors property="sid"/></td>
	</tr>
	<tr>
		<td colspan="3" align="center"><html:submit value="Show"/></td>
	</tr>
</table>
</html:form>
<logic:present name="STO" scope="request">
<table>
	<tr>
		<td>BatchId</td>
		
		<td>${STO.bid}</td>
	</tr>
	
		<tr>
		<td>StudentId</td>
	
		<td>${STO.sid}</td>
		</tr>
		
		<tr>
		<td>Student Name</td>
		
		<td>${STO.sname}</td>
		</tr>
		
		<tr>
		<td>Email</td>
		
		<td>${STO.email}</td>
		</tr>
		
		<tr>
		<td>Phone</td>

		<td>${STO.phone}</td>
		</tr>
</table>
</logic:present>
</center>
</body>
</html>