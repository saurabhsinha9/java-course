<%@page isErrorPage="true" %>
<html>
<body bgcolor="blue">
<font size="5" color="white">Your page generated an error:"<br/>
Exception:<br/></font>
<%= exception.toString() %>
</body>
</html>