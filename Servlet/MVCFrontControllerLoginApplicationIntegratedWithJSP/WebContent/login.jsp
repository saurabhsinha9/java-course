<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>login</title>
</head>
<body>
<center>
<h1>My Application BookStore</h1>
<h3>Customer Login Form</h3>
<form action="login.sau">
<table bgcolor="#c3d599">
	<tr>
		<td>UserName</td>
		<td><input type="text" name="uname"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pword"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" name="login" value="submit"/></td>
	</tr>
</table>
</form>
<h2>
<a href="register.jsp">New User SignUp</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="forgot.jsp">Forgot My Password</a>
</h2>
</center>
</body>
</html>