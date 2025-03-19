<html>
<body>
<h1>
<%
String cn=request.getParameter("CourseName");
String sn=request.getParameter("StudentName");
if(cn.equals("java")){
%>
<jsp:forward page="java.jsp">
<jsp:param value="<%=sn%>" name="StuName"/>
<jsp:param value="<%=cn%>" name="CouName"/>
</jsp:forward>
<%
}
else if(cn.equals("jdbc")){
%>
<jsp:forward page="jdbc.jsp">
<jsp:param value="<%=sn%>" name="StuName"/>
<jsp:param value="<%=cn%>" name="CouName"/>
</jsp:forward>
<%
}
else if(cn.equals("ejb")){
	%>
	<jsp:forward page="ejb.jsp">
	<jsp:param value="<%=sn%>" name="StuName"/>
	<jsp:param value="<%=cn%>" name="CouName"/>
	</jsp:forward>
	<%
	}
else{
%>
	<jsp:forward page="other.jsp">
	<jsp:param value="<%=sn%>" name="StuName"/>
	<jsp:param value="<%=cn%>" name="CouName"/>
	</jsp:forward>
	<%
	}
%>
</h1>
</body>
</html>