<html>
<body><center>
<table width="100%" height="100%">
<tr valign="top" height="10%">
<td width="100%" align="center"><img alt="" src="JLCHeader.jpg"/><hr></td>
</tr>
<tr valign="middle"><td width="100%" align="center">
<table width="40%">
<tr>
<td colspan="3" align="center"><b><font color="red" size="5">
<% Object obj= request.getAttribute("sucess message");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr> 
<td colspan="3" allign="center"><b><a href="index.jsp"><font color="blue" size="5">
Click Here</font></a><font color="black" size="5">For Login</font></b></td></tr></table>
</td></tr>
<tr valign="bottom" height="4%">
<td width="100%" align="center"><hr><b><font color="red" size="5">All right reserved @ Java Learning Center</font></b>
</td></tr></table>
</center>
</body>
</html>