<%@page errorPage="myerror.jsp" %>
<html>
<body>
<h1>Java Learning Center</h1>
<%
out.println("begin");
int x=10/0;
out.println("end");
%>
</body>
</html>

 