<html><body><center>
<form action="register.jsp" method="POST">
<table width="100%" height="100%">
<tr valign="top" height="10%">
<tr width="100%" align="center"><img alt="abc" src="JLCheader.jpg"/><hr></td>
</tr>
<tr valign="middle">
<td width="100%" align="center">
<table width="60%">
<tr>
<td align="center" colspan="3"><font color="red" size="6">Student Registration</font></td>
</tr>
<tr>
<td colspan="3" align="center"><b><font color="red" size="5">
<% Object obj= request.getAttribute("errorInRegistration");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr>
<td><font color="blue" size="5"><b>First Name</b></font></td>
<td><input type="text" name="fname" id="uname" style="font-size:25; color:green;"/>
</td>
<td><font color="red" size="5">
<% obj= request.getAttribute("firstNameErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr><td><font color="blue" size="5"><b>Last Name</b></font></td>
<td><input type="text" name="Iname" id="uname" style="font-size:25; color:green;"/>
</td>

<td><font color="red" size="4">
<% obj= request.getAttribute("lastNameErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>
<tr><td><font color="blue" size="5"><b>Email</b></font></td>
<td><input type="text" name="email" id="uname" style="font-size:25; color:green;"/>
</td>
<td><font color="red" size="5">
<% obj= request.getAttribute("emailErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr>
<td><font color="blue" size="5"><b>Phone</b></font></td>
<td><input type="text" name="phone" id="phone" style="font-size:25; color:green;"/>
</td>
<td><font color="red" size="5">
<% obj= request.getAttribute("phoneErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr><td><font color="blue" size="5"><b>Gender</b></font></td>
<td><input type="radio" value="Male" name="Gender"> 
<font color="green" size="5"><b>Male</b></font>
<td><input type="radio" value="Female" name="Gender"> 
<font color="green" size="5"><b>Female</b></font>
</td>
<td><font color="red" size="5">
<% obj= request.getAttribute("genderErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr><td><font color="blue" size="5"><b>Qualification</b></font></td>
<td><select name="qualification" style="font-size:20;color:green;">
<option value="">Select Qualification</option>
<option value="B.C.A">B.C.A</option>
<option value="B.E">B.E</option>
<option value="B.Sc">B.Sc</option>
<option value="B.Tech">B.Tech</option>
<option value="B.Sc">M.Sc</option>
<option value="B.Tech">M.Tech</option>
</select>
</td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("qualificationErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr>
<td><font color="blue" size="5"><b>Username</b></font></td>
<td><input type="text" name="uname" id="uname" style="font-size:25;color:green;/">
</td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("usernameErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr>
<td><font color="blue" size="5"><b>Password</b></font></td>
<td><input type="password" name="pass" id="pass" style="font-size:25;color:green;/">
</td>
<td><b><font color="red" size="5">
<% obj= request.getAttribute("passwordErrorMessage");
if (obj!=null)
{%><%=obj.toString()%><%}%> </font></b>
</td>
</tr>

<tr>
<td colspan="3" align="center"><br>
<input type="submit" value="Register Me" style="font-size:20; color:red;"/>
</td>
</tr>

<tr>
<td colspan="3" align="center"><br><b>
<font color="blue" size="5">
<a href="index.jsp">Click Here</a></font>
<font size="5">For Login</font></b></td>
</tr>

<table>
</td>
</tr>
<tr valign="bottom" height="4%">
<td width="100%" align="center"><hr><b>
<font color="red" size="5">All right reserved @ Java Learning Center</font></b>
</td>
</tr>
</table>
</form>
</center>
</body>
</html>