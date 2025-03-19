		<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<title>JLC Struts2 Interceptors Test</title>
<s:head/>
</head>
<body>
<center>
<br/>
<h1>JLC Struts2 Interceptors Test</h1>
<s:actionerror/>
<s:form action="TestAction">
<table width="50%">
	<tr>
		<td>
			<s:textfield name="username" label="UserName"/>
		</td>
	</tr>
	
	<tr>
		<td>
			<s:textfield name="email" label="Email ID"/>
		</td>
	</tr>
	<tr>
		<td><s:submit/></td>
	</tr>
</table>
</s:form>
</center>
</body>
</html>