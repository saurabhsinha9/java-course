
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<html>
<head>
<title>Login Application</title>
<s:head/>
</head>
<body>
<center><br/>
<h1>Account login</h1>
<s:actionerror/>
<s:form action="annotatedLogin">
	
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:submit/>
	
</s:form>
</center>
</body>
</html>