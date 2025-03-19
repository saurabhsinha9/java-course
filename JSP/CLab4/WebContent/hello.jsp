<%@ page language="java" 
			extends="javax.servlet.http.HttpServlet" 
			import="java.util.*,java.io.*" 
			isThreadSafe="true" 
			isELIgnored="true"
			session="false"
			isErrorPage="false"
			errorPage=""%>
<html>
<body>
<%!
HttpSession session=null;
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException{
	System.out.println("in service()");
	PrintWriter out=response.getWriter();
	out.println("<h1>Hello Guys</h1>");
	out.println("<h1>Hello Guys</h1>");
	out.println("<h1>Hello Guys</h1>");
	session=request.getSession();
	session.setAttribute("MSG","Hi are you there");
}
%>
<%
Object obj=session.getAttribute("MSG");
System.out.println(obj);
%>
<br>
<%=obj.toString() %>
Accessing the attribute using EL EXP--${MSG1}

</body>
</html>