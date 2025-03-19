<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>uploadhome.jsp</title>
</head>
<body>
<center>
<h1>Upload File</h1><br/>

<html:form action="/Upload.do?method=uploadFile" enctype="multipart/form-data">
<table>
	<tr>
		<td align="center" colspan="2">Browse the File to Upload.</td>
		<td align="left"><html:file property="theFile"/></td>
	</tr>
	
	<tr>
	
	<td align="center" colspan="3"><html:submit value="Upload"/></td>
	
	</tr>
	
	
</table>
</html:form>
</center>
</body>
</html>