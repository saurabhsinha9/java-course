		<%@taglib uri="/struts-tags" prefix="s"%>
	
<html>
<head>
<title>JLC Struts2 Interceptors Test</title>
<s:head theme="ajax"/>
</head>
<body>
<center>
<br/>
<h1>JLC Struts2 Interceptors Test</h1>
<s:actionerror/>
<table width="50%">
	<tr>
		<td>UserName</td>
		<td>
			<s:property value="userId"/>
		</td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td>
			<s:property value="emailId"/>
		</td>
	</tr>
	
	<tr>
		<td>Greeting</td>
		<td>
			<s:property value="#session.Greeting"/>
		</td>
	</tr>
	
	<tr>
		<td>JLC MSG</td>
		<td>
			<s:property value="#session.JLCMSG"/>
		</td>
	</tr>
</table>

</center>
</body>
</html>