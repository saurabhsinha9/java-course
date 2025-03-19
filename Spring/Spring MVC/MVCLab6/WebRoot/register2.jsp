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
<td align="right" width="15%" class="formLabelClass"><p>Email Id:</td>
<td width="60%" class="formLabelClass">
<form:input path="email" cssClass="formFieldClass"/>
<form:errors path="email" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Phone No:</td>
<td width="60%" class="formLabelClass">
<form:input path="phone" cssClass="formFieldClass"/>
<form:errors path="phone" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Suitable Timings:</td>
<td width="60%" class="formLabelClass">
<form:checkbox path="timings" value="07.30A.M-09.30A.M"/>07.30A.M-09.30A.M<br>
<form:checkbox path="timings" value="10.30A.M-02.30P.M"/>10.30A.M-02.30P.M<br>
<form:checkbox path="timings" value="04.00P.M-06.00P.M"/>04.00P.M-06.00P.M<br>
<form:checkbox path="timings" value="06.30P.M-08.30P.M"/>06.30P.M-08.30P.M<br>
<form:checkbox path="timings" value="Weekends"/>Weekends(Only Advance)<br>
<form:errors path="timings" cssClass="error"/>
</td>
</tr>

<tr>
<td align="center" colspan="2">
<input type="submit" name="_target0" align="middle" value="Previous" class="formButtonClass"/>
<input type="submit" name="_target2" align="middle" value="Next" class="formButtonClass"/>
<input type="submit" name="_cancel" align="middle" value="Cancle" class="formButtonClass"/>
<input type="submit" name="_target3" align="middle" value="Finish" class="formButtonClass"/>
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

