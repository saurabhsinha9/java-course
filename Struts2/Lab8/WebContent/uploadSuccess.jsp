<%@ taglib uri="/struts-tags" prefix="s" %>


<html>
<head>
<title>Struts2 File Upload Example</title>
<s:head/>
</head>
<body>
<center>
<br/>
<h2>Struts2 File Upload Example</h2><br/>
<table>
	<tr>
		<td colspan="3">Upload File details</td>
	</tr>
	
	<tr>
		<td><label>File Name:</label></td>
		<td><s:property value="resumeFileName"/></td>
	</tr>
	
	<tr>
		<td><label>Content Type:</label></td>
		<td><s:property value="resumeContentType"/></td>
	</tr>
	
	<tr>
		<td><label>File Size:</label></td>
		<td><s:property value="size"/></td>
	</tr>
	
	<tr>
		<td><label>File Path:</label></td>
		<td><s:property value="path"/></td>
	</tr>
	
	
</table>
</center>
</body>
</html>