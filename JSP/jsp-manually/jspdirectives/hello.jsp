<%@page language="java" extends="javax.servlet.http.HttpServlet" import="java.util.*,java.io.*" isThreadSafe="true" session="false" %>

<html>
<body>
<h1>Java Learning Center<h1>
<h1>Java Learning Center<h1>
<%
out.println("Hai Guys");
%>
<%!
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	System.out.println("in service()");
	PrintWriter out=response.getWriter();
	out.println("<h1>Hello Guys");
	out.println("<h1>Hello Guys");
	out.println("<h1>Hello Guys");
}
%>
</body>
</html>