
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<html>
<head>
<title>Login Application</title>
<s:head/>
</head>
<body>
<center><br/>
<h1>Account Login</h1>
<s:actionerror/>
<s:form action="Login">
	
	<s:textfield name="username" label="UserName" cssClass="font-size=25px; color=red"/>
	
	<s:password name="password" label="Password" cssClass="font-size=25px; color=red"/>
	
	<s:submit cssClass="font-size=25px; color=red"/>
	
</s:form>
</center>
</body>
</html>