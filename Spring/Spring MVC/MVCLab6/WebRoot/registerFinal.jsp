<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>
<fmt:message key="title"/></title>
</head>
<body>
<center>
<form:form method="post" commandName="student">
<table width="100%" bgcolor="f8f8ff" border="0" cellspacing="5" cellpadding="5" align="left">
<tr>
<td align="center" width="100%" class="formLabelClass" colspan="2">Student Registration Form</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Student ID:</td>
<td width="60%" class="formLabelClass">${student.studentID}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>First Name:</td>
<td width="60%" class="formLabelClass">${student.fname}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Last Name:</td>
<td width="60%" class="formLabelClass">${student.lname}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Email Id:</td>
<td width="60%" class="formLabelClass">${student.email}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Phone No:</td>
<td width="60%" class="formLabelClass">${student.phone}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Suitable Timings:</td>
<td width="60%" class="formLabelClass">
<c:forEach var="x" items="${student.timings}">
${x}
</c:forEach>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Gender:</td>
<td width="60%" class="formLabelClass">${student.gender}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Qualification:</td>
<td width="60%" class="formLabelClass">${student.qualification}
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Remarks:</td>
<td width="60%">${student.remarks}
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

