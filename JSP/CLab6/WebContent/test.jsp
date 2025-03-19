<%@page errorPage="myerror.jsp" %>
<html>
<body>
<form method="post">
<table>
<tr>
<td>Enter a number: </td>
<td><input type="text" name="txtNum" />
</tr>
<tr>
<td><input type="submit" name="B1" value="Divide by zero" />
</tr>
</table>
</form>
<%
if(request.getParameter("txtNum") != null){
if(!request.getParameter("txtNum").equals("")){
int div = Integer.parseInt(request.getParameter("txtNum")) / 0;
out.println("Answer is: " + div);
}
else{
out.println("<html><font color=red>Please enter a number.</font></html>");
}
}
%>
</body>
</html>

 