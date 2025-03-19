<%@page isErrorPage="true" %>

<html>
<body>
<h1>
I am in Error Page</h1>
<h1>
<%
out.println(exception);
out.println(exception.getMessage());
%>
</body>
</html>