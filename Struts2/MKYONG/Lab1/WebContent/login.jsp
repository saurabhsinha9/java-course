
<%@ taglib uri="/struts-tags" prefix="s" %>    
<html>
<body>
<center><br/>
<h1>Account Login</h1>
<s:actionerror/>
<s:form action="Login">
<s:textfield name="username" label="UserName"/>
<s:password name="password" label="Password"/>
<s:submit label="LoginMe"/>
</s:form>
</center>
</body>
</html>