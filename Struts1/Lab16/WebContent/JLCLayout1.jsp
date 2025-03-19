<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html>
<body>
<table width="90%" height="90%">
	<tr height="10%">
		<td bgcolor="red" align="center">
		<tiles:insert attribute="HEADER"/>
		</td>
	</tr>
	
	<tr height="80%">
		<td bgcolor="#c3d599" align="center">
		<tiles:insert attribute="BODY"/>
		</td>
	</tr>
	<tr height="10%">
		<td bgcolor="red" align="center">
		<tiles:insert attribute="FOOTER"/>
		</td>
	</tr>
</table>
</body>
</html>