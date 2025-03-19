<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html>
<body>
<h1><bean:message key="label.header"/></h1>
<html:form action="/Search.do">
<html:text property="hello"/>
<br/>
<html:submit value="Search"/>
</html:form><hr/>
<html:link forward="english">English</html:link>&nbsp;&nbsp;
<html:link forward="hindi">Hindi</html:link>&nbsp;&nbsp;
<html:link forward="kannada">Kannada</html:link>&nbsp;&nbsp;
<html:link forward="telugu">Telugu</html:link>&nbsp;&nbsp;
<html:link forward="tamil">Tamil</html:link>&nbsp;&nbsp;
</body>
</html>