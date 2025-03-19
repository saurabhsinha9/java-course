<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>login</title>
</head>
<h3></h3>
<body>
<a href="login.jsp">LoginPage</a>
<center>
<h1>My Application BookStore</h1>
<h3>Customer Login Form</h3>
<form method="post" action="login.sau">
<table bgcolor="#c3d599">
	<tr>
		<td>UserName</td>
		<td><input type="text" name="uname"/></td>
		
		<%Object o=request.getAttribute("unameError");
		if(o!=null){%>
			<td>
		<%=o %>
			</td>	<%
		}
		%>
		
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pword"/></td>
		
		<%Object o1=request.getAttribute("passError");
		if(o1!=null){%>
			<td>
		<%=o1 %>
			</td>	<%
		}
		%>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<input type="submit" name="login" value="Login"/></td>
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