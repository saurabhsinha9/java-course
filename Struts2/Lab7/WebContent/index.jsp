<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<title><s:text name="login.title"/></title>
<link rel="stylesheet" href="mystyle.css" type="text/css"/>
</head>
<body>
<center>
<br/>
<table align="center" width="80%">
	<tr>
		<td>
			<h2 align="center"><s:text name="login.title"/></h2>
		</td>
	</tr>
	
	<tr>
		<td width="100%" align="center">
			<table bgcolor="#e8e7f8" align="center" width="100%">
				<tr>
					<td colspan="3"><div class="boldred"><s:actionerror/></div></td>
				</tr>
				
				<tr>
					<td colspan="3" align="center"><s:text name="login.header"/></td>
				</tr>
				
				<tr>
					<td align="center">
						<s:form action="login" method="post">
							<s:textfield name="username" key="login.username" size="15" labelposition="top" cssStyle="font-size:20px;color:green"/>
							<s:textfield name="password" key="login.password" size="15" labelposition="top" cssStyle="font-size:20px;color:green"/>
							<s:submit key="login.submit" align="center" cssStyle="font-size:20px;color:red"/>
						</s:form>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	
	<tr>
		<td colspan="3"><br/><br/><hr>
		<div align="right">
		<a href="index.action?request_locale=hi"><s:text name="locale.hindi"/></a>|
		<a href="index.action?request_locale=en"><s:text name="locale.english"/></a>|
		<a href="index.action?request_locale=te"><s:text name="locale.telugu"/></a>|
		<a href="index.action?request_locale=kn"><s:text name="locale.kannada"/></a>|
		<a href="index.action?request_locale=tn"><s:text name="locale.tamil"/></a>|
		</div>
		</td>
	</tr>
</table>
</center>
</body>
</html>