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
<input type="submit" name="_target1" align="middle" value="Previous" class="formButtonClass"/>
<input type="submit" name="_cancel" align="middle" value="Cancle" class="formButtonClass"/>
<input type="submit" name="_finish" align="middle" value="Finish" class="formButtonClass"/>
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

