<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success.jsp</title>
</head>
<body>

<%
Object o=request.getAttribute("fileExist");
String flag=o.toString();
if(flag.equals("false")){

%>
<h1>File with the name ${fileName} is Uploaded Successfully in to the Location ${filepath}</h1>
<%
}
else{
%>

<h1>File with the name${fileName} is already exists.</h1>

<%
}
%>
</body>
</html>