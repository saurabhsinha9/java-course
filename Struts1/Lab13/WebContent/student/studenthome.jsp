<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>studenthome.jsp</title>
</head>
<body>
<center>
<br/>
<font size="5" color="green">Java Learning Center</font>
<h1>Student Module Home</h1>

	<html:link forward="searchStudent">Search Student</html:link>
	<html:link forward="updateStudent">Update Student</html:link>
	<html:link forward="addStudent">Add Student</html:link>


</center>
</body>
</html>