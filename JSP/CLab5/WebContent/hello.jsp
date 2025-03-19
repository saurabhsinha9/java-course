<%@ page language="java" 
			import="java.util.*,java.io.*" 
			isThreadSafe="false" 
			isELIgnored="false"%>
<html>
<body>
<%
session=pageContext.getSession();
session.setAttribute("MSG","Attribute stored in session");
request.setAttribute("MSG1","Attribute stored in session");
%>
<h1>how are you men?</h1>
<%
Object obj=session.getAttribute("MSG");
%>
<br/>
<%=obj.toString() %>
<br>
Accessing the attribute using EL EXP--${MSG1}
</body>
</html>