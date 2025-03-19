<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table width="76%" height="99%" align="center" border="1">
			<tr height="10%">
				<td colspan="2" align="center"><f:subview id="Header">
						<tiles:insert attribute="HEADER" flush="false" />
					</f:subview></td>
			</tr>

			<tr height="80%">
				<td width="15%" valign="top"><f:subview id="Menu">
						<tiles:insert attribute="MENU" flush="false" />
					</f:subview></td>

				<td width="75%" valign="top"><f:subview id="Body">
						<tiles:insert attribute="BODY" flush="false" />
					</f:subview></td>
			</tr>

			<tr height="10%">
				<td colspan="2" align="center"><f:subview id="Footer">
						<tiles:insert attribute="FOOTER" flush="false" />
					</f:subview></td>
			</tr>

		</table>
	</center>
</body>
</html>