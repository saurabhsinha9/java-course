<%@ page import="java.util.*,java.lang.reflect.*" session="false" isErrorPage="true"%>
<html>
<head>
<body>
<h1>Java Learning Center</h1>
<h1>Game of Declaration </h1> 
<%!
void m1(){
	System.out.println("m1()");
}
int a=10;
static int b=20;
{
	System.out.println("IB");
}
static{
	System.out.println("SB");
}
%>
<br>
<h1>Game of Expression </h1>
<h1>
<%="Hai Guys"%>
<%=a %>
<%=b %>
</h1>
<br>
<h1>Game of Scriptlet</h1>
<%
out.println("Hello Guys");
this.m1();
int a=100;
out.println(a);
out.println(b);
out.println(this.a);
Date d=new Date();
out.println(d);
%>
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
	m1();
}catch(Exception e){
	e.printStackTrace();
}
%>
</body>
</html>