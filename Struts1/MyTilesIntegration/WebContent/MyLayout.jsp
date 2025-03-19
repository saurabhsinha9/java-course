<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles"%>
<html>
<body bgcolor="green" bottommargin="10%" topmargin="10%" rightmargin="10%" leftmargin="10%">
	<center>
	<table width="90%" height="90%" bgcolor="wheat">
	<tr height="10%" bordercolor="red" bgcolor="yellow">
	<td colspan="2" align="center">
	<tiles:insert attribute="HEADER"/>
	</td>
	</tr>
	
	<tr height="80%" bordercolor="brown" bgcolor="pink">
	<td width="20%" bgcolor="snow">
	<tiles:insert attribute="LMENU"/>
	</td>
	<td width="40%"  bgcolor="violet">
	<tiles:insert attribute="BODY"/>
	</td>
	<td width="20%" bgcolor="blue">
	<tiles:insert attribute="RMENU"/>
	</td>
	</tr>
	
	<tr height="10%" bordercolor="red" bgcolor="yellow" align="center">
	<td colspan="2" align="center" width="90%">
	<tiles:insert attribute="FOOTER"/>
	</td>
	</tr>
	</table>
	</center>
</body>
</html>