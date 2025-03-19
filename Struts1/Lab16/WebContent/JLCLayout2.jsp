<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html>
<body>
<table width="90%" height="90%">
	<tr height="10%">
		<td colspan="3" bgcolor="red" align="center">
		<tiles:insert attribute="HEADER"/>
		</td>
	</tr>
	
	<tr height="80%">
		<td width="20%" bgcolor="#c3d599" align="left">
		<tiles:insert attribute="LMENU"/>
		</td>
		
		<td width="65%" bgcolor="#c3d599" align="center">
		<tiles:insert attribute="BODY"/>
		</td>
		
		<td width="15%" bgcolor="#c3d599" align="left">
		<tiles:insert attribute="RMENU"/>
		</td>
	</tr>
	<tr height="10%">
		<td colspan="3" bgcolor="red" align="center">
		<tiles:insert attribute="FOOTER"/>
		</td>
	</tr>
</table>
</body>
</html>