<%@page isErrorPage="true" %>
<html>
<body>
<%
out.println(exception);
out.println(exception.getMessage());
%>
</body>
</html>