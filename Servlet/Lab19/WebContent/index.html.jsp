<html>
<body><center>
<form action="login.jlc" method="post">
<table width="894" height="95%">
<tr valign="top" height="10%">
<td width="100%" align="center"><img alt="" src="JLCHeader.jpg"/><hr></td>
</tr>
<tr valign="top"><td width="100%" align="center"><br><br>
<table width="70%">
<tr>
<td align="center" colspan="3"><font color="red" size="6">Account Login</font></td></tr>
<tr>
<td align="center" colspan="3"><b><font color="red" size="5">
<% Object obj= request.getAttribute("invalidLogin");
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
<td><b><font color="blue" size="5">Password</font><b></td>
<td><input type="password" name="pass" id="pass" style="font-size:25; color:green;"/></td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("PasswordErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr>
<td colspan="3" align="center"><br>
<input type="submit" value="Login Me" style="font-size:20; color:red;"/></td>
</tr>
<td colspan="3" align="center"><br>
<b><font color="black" size="5"> New User:</font><a href="register.jsp">
<font color="blue" size="5">Sign Up</font></a></b></td>
</tr>
<tr><td colspan="3" align="center"><br><b>
<font color="black" size="5"> Forget Password!</font><a href="forgotpassword.jsp"><br><font color="blue" size="5">Click Here</font></a>
<font color="black" size="5">To Retrieve Password</font></b></td>
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