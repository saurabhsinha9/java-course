<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>register</title>
</head>
<body>
<center>
<h1>My Application BookStore</h1>
<h3>Customer Registration Form</h3>
<form action="register.sau">
<table bgcolor="#c3d599">
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fname"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lname"/></td>
	</tr>
	<tr>
		<td>Email Id</td>
		<td><input type="text" name="email"/></td>
	</tr>
	<tr>
		<td>Phone No.</td>
		<td><input type="text" name="phone" value=""/></td>
	</tr>
	<tr>
		<td>Gender</td>

		<td><input type="radio" name="gender" value="Male"/>Male</td>
		<td><input type="radio" name="gender" value="Female"/>Female</td>
	
	</tr>
	<tr>
		<td>Card Type</td>
		<td><select name="ctype">
			<option value="Visa">Visa</option>
			<option value="Master">Master</option>
			<option value="Amex">Amex</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Card number</td>
		<td><input type="text" name="cnum"/></td>
	</tr>
	<tr>
		<td>Favourite Color</td>
		<td><input type="checkbox" name="color" value="Red"/>Red
		<input type="checkbox" name="color" value="Blue"/>Blue
		<input type="checkbox" name="color" value="Green"/>Green</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="uname"/></td>
	</tr>	
	<tr>
		<td>Password</td>
		<td><input type="password" name="pword"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" name="register" value="submit"/></td>
	</tr>
</table>
</form>
</center>
</body>
</html>