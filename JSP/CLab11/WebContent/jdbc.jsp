<html>
<body>
<h1>This is jdbc.jsp<br/><hr/>
<%
String cn=request.getParameter("CouName");
String sn=request.getParameter("StuName");
%>
Hello! &nbsp;&nbsp;&nbsp; <%= sn %>,<br/><br/> 
you have selected<br/><br/> <%= cn %>.
</h1>
</body>
</html>