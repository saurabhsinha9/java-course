<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1><%Object o=session.getAttribute("MSG");
if(o!=null){
%>
<table><tr>
<td>
<%=o %>
	</td></tr></table>	<%
}
RequestDispatcher rd=null;
if(o=="Login Successfull"){
	rd=request.getRequestDispatcher("/logout.jsp");
	rd.include(request,response);
}else{
	rd=request.getRequestDispatcher("/login.jsp");	
	rd.include(request,response);
}
%>
</h1>
</body>
</html>