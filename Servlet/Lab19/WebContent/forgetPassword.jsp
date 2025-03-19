<html>
<body><center>
<form action="retrievePassword.jlc" method="post">
<table width="894" height="100%">
<tr valign="top" height="10%">
<td width="100%" align="center"><img alt="" src="JLCHeader.jpg"/><hr></td>
</tr>
<tr valign="middle"><td width="100%" align="center">
<table width="50%">
<tr>
<td align="center" colspan="3"><font color="red" size="5">
<% Object obj= request.getAttribute("invalidInformation");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr> 
<td><b><font color="blue" size="5">Username</font><b></td>
<td><input type="text" name="uname" id="uname" style="font-size:25; color:green;"/></td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("usernameErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr>
<td><font color="blue" size="5"><b>Email</font><b></td>
<td><input type="text" name="email" id="email" style="font-size:25; color:green;"/></td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("emailErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr>
<td colspan="3" align="center"><br>
<input type="submit" value="Show My Password" style="font-size:20; color:red;"/></td>
</tr>
<td colspan="3" align="center"><br>
<b><font color="blue" size="5"><a href="index.jsp">Click Here</a></font>
<font size="5">For Login</font></b></td>
</tr>
</table>
</td></tr>
<tr valign="bottom" height="4%">
<td width="100%" align="center"><hr><b>
<font color="red" size="5">All right reserved @ Java Learning Center</font></b>
</td></tr></table>
</form>
</center>
</body>
</html>