<%@page isELIgnored="false" %>

<html>
<body>
${LoginError }


<form action="login.sau">
<table>
<tr>
<td><h2>First name</h2></td>
<td><input type ="text" name="uname" style="color:red;font-size:20"/></td>
</tr>
<tr>
<td><h2>Password</h2></td>
<td><input type ="text" name="pwd" style="color:red;font-size:20"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="submit" style="color:red;font-size:20"/></td>
</tr>
</table>
</form>
</body>
</html>