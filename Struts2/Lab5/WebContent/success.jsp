		<%@taglib uri="/struts-tags" prefix="s"%>
		

<html>
<head>
<title>JLC Struts2 Action Test</title>
<s:head/>
</head>
<body>
<center>
<br/>
<h1>JLC Struts2 Action Test</h1>
<table bgcolor="grey">
	<tr>
		<td>Name</td>
		<td>
			<s:property value="user.name"/>
		</td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td>
			<s:property value="user.email"/>
		</td>
	</tr>
	
	<tr>
		<td>Phone</td>
		<td>
			<s:property value="user.phone"/>
		</td>
	</tr>
	
	<tr>
		<td>Email Attribute from Request</td>
		<td>
			<s:property value="#request.EMAIL"/>
		</td>
	</tr>
	
	<tr>
		<td>User Attribute from Request</td>
		<td bgcolor="pink">
			<s:property value="#request.USER.name"/><br/>
			<s:property value="#request.USER.email"/><br/>
			<s:property value="#request.USER.phone"/><br/>			
		</td>
	</tr>
	
	<tr>
		<td>Phone Attribute from Request</td>
		<td>
			<s:property value="#request.PHONE"/>
		</td>
	</tr>
	
	<tr>
		<td>Message Attribute from Request</td>
		<td>
			<s:property value="#request.MSG"/>
		</td>
	</tr>
	
	<tr>
		<td>User Attribute from Session</td>
		<td bgcolor="yellow">
			<s:property value="#session.USER.name"/><br/>
			<s:property value="#session.USER.email"/><br/>
			<s:property value="#session.USER.phone"/><br/>	
		</td>
	</tr>
	
	<tr>
		<td>Name Attribute from Application</td>
		<td bgcolor="red">
			<s:property value="#application.NAME"/>
		</td>
	</tr>
	
	<tr>
		<td>Name Attribute from Session</td>
		<td bgcolor="green">
			<s:iterator id="nam" value="#session.NAMES">
			<s:property value="nam"/><br/>
			</s:iterator>
		</td>
	</tr>
	
	<tr>
		<td>User Attribute from Application</td>
		<td bgcolor="wheat">
			<s:iterator id="user1" value="#{application.USERS}"/>
			<s:property value="user1.name"/>
			<s:property value="user1.email"/>
			<s:property value="user1.phone"/>
		</td>
	</tr>
	
	<tr>
		<td>Msg from Hai</td>
		<td bgcolor="pink">
			<s:property value="#msg"/>
		</td>
	</tr>
	
	<tr>
		<td>Str from Hello</td>
		<td>
			<s:property value="hello.str"/>
		</td>
	</tr>
	
	
	
	<tr>
		<td>Students from Action</td>
		<td bgcolor="brown">
			<s:iterator value="#session.JLC"><br/>
			Name:<s:property value="sname"/><br/>
				<s:iterator value="address">
				City:<s:property value="city"/><br/>
						<s:iterator value="phones">
						<s:property/><br/>
						</s:iterator>
				</s:iterator>
				<br/>
			</s:iterator>
		</td>
	</tr>
</table>
</center>
</body>
</html>