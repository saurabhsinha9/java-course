
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<body bgcolor="lightYellow">
	<center><br/><html:link href="index.jsp">go to index</html:link>
	
		<font color="green">
			<h1>Java Learning Center</h1>
			<h1>Search Form</h1>
		</font>
		<html:form action="/BidSubmit">
			<table bgcolor="grey" border="3" bordercolor="blue" >
				<tr>
					<td>Enter Batch Id</td>
				</tr>
				<tr>
					<td><html:text property="bid" /></td>
				</tr>
				<tr>
					<td><html:errors /></td>
				</tr>
				<tr>
					<td colspan="3"  align="center"><html:submit value="Show" /></td>
				</tr>
			</table>
		</html:form>
		<logic:present name="STUINFO" scope="request">
			<table style="font-size: 25" bgcolor="#D8BFC9">
				<tr>
					<td>Batch Id</td>
					<td>Student Id</td>
					<td>Student Name</td>
					<td>Email</td>
					<td>Phone</td>
				</tr>

				<c:forEach var="STO" items="${STUINFO}">
					<tr>
						<td>${STO.bid}</td>
						<td>${STO.sid}</td>
						<td>${STO.sname}</td>
						<td>${STO.email}</td>
						<td>${STO.phone}</td>
					</tr>
				</c:forEach>
			</table>
		</logic:present>
	</center>
</body>
</html>