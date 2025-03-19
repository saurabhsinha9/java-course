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
<td width="60%" class="formLabelClass">
<form:input path="studentID" cssClass="formFieldClass"/>
<form:errors path="studentID" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Name:</td>
<td width="60%" class="formLabelClass">
<form:input path="name" cssClass="formFieldClass"/>
<form:errors path="name" cssClass="error"/>
</td>
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
<td align="right" width="15%" class="formLabelClass"><p>Gender:</td>
<td width="60%" class="formLabelClass">
<form:radiobutton path="gender" value="Male"/>Male<br/>
<form:radiobutton path="gender" value="Female"/>Female<br/>
<form:errors path="gender" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Qualification:</td>
<td width="60%" class="formLabelClass">
<form:select path="qualification" cssClass="formFieldClass">
<form:option value="----Select Option----"/>
<form:option value="M.Sc"/>
<form:option value="B.Sc"/>
<form:option value="MCA"/>
<form:option value="BCA"/>
<form:option value="M.Tech"/>
<form:option value="B.Tech"/>
</form:select>
<form:errors path="qualification" cssClass="error"/>
</td>
</tr>

<tr>
<td align="right" width="15%" class="formLabelClass"><p>Remarks:</td>
<td width="60%">
<form:textarea path="remarks" cssClass="formFieldClass" rows="5" cols="40"/>
<form:errors path="remarks" cssClass="error"/>
</td>
</tr>

<tr>
<td align="center" colspan="2">
<input type="submit" align="center" value="Register Now" class="formButtonClass"/>
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

