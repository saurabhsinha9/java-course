<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>
<fmt:message key="title"/></title>
<link rel="stylesheet" type="text/css" href="css/jlc.css"/>
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
<td width="60%" class="formLabelClass">
<form:input path="studentID" cssClass="formFieldClass"/>
<form:errors path="studentID" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>First Name:</td>
<td width="60%" class="formLabelClass">
<form:input path="fname" cssClass="formFieldClass"/>
<form:errors path="fname" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Last Name:</td>
<td width="60%" class="formLabelClass">
<form:input path="lname" cssClass="formFieldClass"/>
<form:errors path="lname" cssClass="error"/>
</td>
</tr>

<tr>
<td align="center" colspan="2">
<input type="submit" name="_cancel" align="middle" value="Cancle" class="formButtonClass"/>
<input type="submit" name="_target1" align="middle" value="Next" class="formButtonClass"/>
<input type="submit" name="_target3" align="middle" value="Finish" class="formButtonClass"/>
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

