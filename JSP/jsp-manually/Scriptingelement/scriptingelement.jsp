<%@page import="java.util.*,java.lang.reflect.*" session="false" isErrorPage="true"%>

<html>
<body>
<!--
<h1>Java Learning Center<h1>
-->
<h1>Java Learning Center<h1>

<%!
public void _jspInit(){
System.out.println("_jspInit()");
}
public void jspInit(){
System.out.println("jspInit()");
}
public void jspDestroy(){
System.out.println("jspDestroy()");
}
public void _jspDestroy(){
System.out.println("_jspDestroy()");
}
void m1(){
System.out.println("m1()");
}
int a=10;
int b=20;

%>

<h1>
<%= "Hai Guys"%>
<%= a%>
<%= b%>

<%
out.println("Hello Guys");
m1();
int a=100;
out.println(a);
out.println(b);
Date d=new Date();
out.println(d);
%>
</body>
</html>