<%@ page language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <body>
  <jsp:include page="header.jsp"/>
<br><h1 align="center">Contact Home</h1><br/>
<h3>
<a href="<c:url value="/MVCLab5/viewContact.jlc"/>">Add Contact</a><br/><br/>
<a href="<c:url value="/MVCLab5/viewContact.jlc"/>">Update Contact</a><br/><br/>
<a href="<c:url value="/MVCLab5/viewContact.jlc"/>">Delete Contact</a><br/><br/>
<a href="<c:url value="/MVCLab5/viewContact.jlc"/>">View Contact</a><br/><br/>
</h3>
  </body>
</html>
