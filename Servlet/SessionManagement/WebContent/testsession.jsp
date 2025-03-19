<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>testsession</title>
</head>
<body>
<center>
<%String str =session.getId();
%>
<br/>Session ID is	<%=str %>
<br/>
<%HttpSession hs=request.getSession();
%>
<br/>Session hs=<%=hs %>
<br/>
<%long l=hs.getCreationTime();
%>
<br/>getCreationTime=<%=l %>
<br/>
<%boolean b=hs.isNew();
%>
<br/>isNew=<%=b %>

<br/>
<%session.setAttribute("MSG","HI THIS IS SESSION DEMO");
session.setAttribute("MSG1","HI THIS IS SESSION1 DEMO");
session.setAttribute("MSG2","HI THIS IS SESSION2 DEMO");
session.setAttribute("MSG3","HI THIS IS SESSION3 DEMO");
session.setAttribute("MSG4","HI THIS IS SESSION4 DEMO");

%>
Attribute setted
<br/><hr/>
getting attribute value
<%Object o=session.getAttribute("MSG");
if(o!=null){
%><br/><%=o %><% }%>
<br/><hr/>
<%Enumeration e=hs.getAttributeNames();
while(e.hasMoreElements()){
	%>
	getting Names of attribute=<%=e.nextElement() %>
	<%
}
%>
<br/><hr/>
removing attribute 
<%session.removeAttribute("MSG");%>


<br/><hr/>
getting attribute value
<%Object o1=session.getAttribute("MSG");
%><br/><%=o1 %>
<br/><hr/>
<%//hs.setMaxInactiveInterval(3);
//hs.invalidate();%>
<br/>Session hs=<%=hs %>
</center>
</body>
</html>