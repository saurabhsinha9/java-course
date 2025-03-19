<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>

		<table width="90%" height="99%" border="0" align="center">
		
		<tr height="10%">
		<td><tiles:insert name="HEADER"></tiles:insert></td>
		</tr>
		
		<tr height="80%">
		<td valign="top"><tiles:insert name="BODY"></tiles:insert></td>
		</tr>
		
		<tr height="10%">
		<td valign="top"><tiles:insert name="FOOTER"></tiles:insert></td>
		</tr>
		</table>
	</center>
</body>
</html>