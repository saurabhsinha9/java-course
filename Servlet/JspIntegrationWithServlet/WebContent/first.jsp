<%@ page import="java.util.*"%>
<html>
</head>
<body bgcolor="black">
<font color="white">
<center><h1>This is First JSP
<%
Date dt=new Date();
for(int i=1;i<=5;i++){
	System.out.println(dt);
%><br/>
<%=i %>  <%=dt %>

<%} %>
<br/>
<%=application %>
<%=request %>
<%=response%>
<br/><br/><hr color="red"/>
<%
request.setAttribute("MSG","This is my first jsp page-message stored in request");
%>
Accessing the value in request object
<%
Object obj=request.getAttribute("MSG");
if(obj!=null){
%><br/>
<%=obj%>
<%
}
%>
<hr color="blue"/>
<%
session.setAttribute("MSG1","This is my first jsp page-message stored in session");
%>
Accessing the value in session object
<%
Object obj1=session.getAttribute("MSG1");
if(obj1!=null){
%><br/>
<%=obj1%>
<%
}
%>
<hr color="brown"/>
<%
application.setAttribute("MSG2","This is my first jsp page-message stored in application");
%>
Accessing the value in application object
<%
Object obj2=application.getAttribute("MSG2");
if(obj2!=null){
%><br/>
<%=obj2%>
<%
}
%>

</h1></center>

</font>
</body>
</html>