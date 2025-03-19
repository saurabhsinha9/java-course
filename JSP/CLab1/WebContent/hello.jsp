<%@ page import="java.util.*"%>
<html>
<body>
<h1>Java Learning Center</h1>
<h1>
<%
out.println("Hello Guys");
%>
<br/>
<%
int a=10;
out.println(a);
Date d=new Date();
for(int i=0;i<5;i++){
	out.println(d);
}
%>
</h1>
</body>
</html>