<%@ taglib uri="/struts-tags" prefix="s" %>


<html>
<head>
<title>Struts2 File Upload Example</title>
<s:head/>
</head>
<body>
<center>
<br/>
<s:actionerror/>
<h2>Struts2 File Upload Example</h2>
<s:form action="UploadFile" method="post" enctype="multipart/form-data">
<s:file name="resume" label="Upload Your Resume"/>
<s:submit/>
</s:form>
</center>
</body>
</html>