<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Java Learning Center</title>
<link href="css/jlc.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.jlc"/>">Home</a></h1>
<h1 align="center">Enter Your Query</h1>
<form:form method="post" commandName="query">
<table width="60%" cellspacing="0" cellpadding="5" align="center">
<tr>
<td>
<form:textarea path="message" cssClass="formFieldClass" rows="5" cols="50"/><br/>
</td>
</tr>

<tr>
<td align="center">
<input type="submit" align="center" value="Post Query" class="formButtonClass"/>
</td>
</tr>
</table>
</form:form>
</center>
</body>
</html>

