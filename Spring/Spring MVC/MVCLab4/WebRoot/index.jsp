<%@ page language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <body>
  <jsp:include page="header.jsp"/>
<br><h1 align="center">Spring Home</h1><br/>
<h3>
<a href="<c:url value="/postQuery.jlc"/>">Post Spring Query</a><br/><br/>
<a href="<c:url value="/viewQueries.jlc"/>">View Spring Query</a><br/><br/>
<a href="<c:url value="/changePassword.jlc"/>">Change Password</a><br/><br/>
<a href="<c:url value="/changeEmail.jlc"/>">Change Email</a><br/><br/>
</h3>
  </body>
</html>
