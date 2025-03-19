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
<s:actionerror/>
<s:form action="TestAction">

<s:textfield key="name"/>
<s:textfield key="email"/>
<s:fielderror>
<s:param>email1</s:param>
</s:fielderror>

<s:textfield key="phone"/>
<s:fielderror>
<s:param>phone</s:param>
</s:fielderror>

<s:submit/>
</s:form>
</center>
</body>
</html>