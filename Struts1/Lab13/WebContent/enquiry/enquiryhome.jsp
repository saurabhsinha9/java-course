<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>enquiryhome.jsp</title>
</head>
<body>
<center>
<br/>
<font size="5" color="green">Java Learning Center</font>
<h1>Enquiry Module Home</h1>

	<html:link forward="searchEnquiry">Search Enquiry</html:link>
	<html:link forward="updateEnquiry">Update Enquiry</html:link>
	<html:link forward="addEnquiry">Add Enquiry</html:link>


</center>
</body>
</html>