<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table width="90%" height="99%" align="center">
			<tr height="10%">
				<td colspan="2" align="center">
				<tiles:insert name="HEADER"></tiles:insert>
				</td>
				</tr>
				

			<tr height="80%">
				<td width="25%" valign="top">
				<tiles:insert attribute="MENU"/>
			</td>
				<td width="75%" valign="top">
						<tiles:insert attribute="BODY"/>
		</td>
			</tr>

			<tr height="10%">
				<td colspan="2" align="center">
						<tiles:insert attribute="FOOTER"/>
	</td>
			</tr>

		</table>
	</center>
</body>
</html>