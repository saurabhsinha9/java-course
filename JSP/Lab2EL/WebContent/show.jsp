<html>
<body>
<h1>Java Learning Center</h1>
<table>
	<tr bgcolor="red">
		<td>1.Strings,Wrappers and Date</td>
		<td>${requestScope.EM}<br/>
		${sessionScope.PH}<br/>
		${applicationScope.DOB}<br/>
		</td>
	</tr>

	<tr bgcolor="green">
		<td>2.Collection of Strings,Wrappers and Date.</td>
		<td>${requestScope.AL[0]}<br/>
		${requestScope.AL[1]}<br/>
		${requestScope.AL[2]}<br/>
		${requestScope.AL[3]}<br/>
		${requestScope.AL[4]}<br/>
		${sessionScope.STR[0]}<br/>
		${sessionScope.STR[1]}<br/>
		${sessionScope.STR[2]}<br/>
		${sessionScope.STR[3]}<br/>
		</td>
	</tr>
	<tr bgcolor="yellow">
		<td>3.Collection of Collections(*JSTL)</td>
		<td>Coming Soon</td>
	</tr>
	<tr bgcolor="grey">
		<td>4.Custom or User defined class object</td>
		<td>Cid:${CUST.cid}<br/>
		Cname:${sessionScope.CUST.cname}<br/>
		Email:${sessionScope.CUST.email}<br/>
		Phone:${sessionScope.CUST.phone}<br/>
		Accno:${sessionScope.CUST.account.accno}<br/>
		Atype${sessionScope.CUST.account.atype}<br/>
		Bal:${sessionScope.CUST.account.bal}<br/>
		Street:${sessionScope.CUST.account.address.street}<br/>
		City:${sessionScope.CUST.account.address.city}<br/>
		</td>
	</tr>
	<tr bgcolor="sketch">
		<td>5.Collection of User defined class object</td>
		<td>Cid:${CS[0].cid}<br/>
		Cname:${sessionScope.CS[0].cname}<br/>
		Email:${sessionScope.CS[0].email}<br/>
		Phone:${sessionScope.CS[0].phone}<br/>
		Accno:${sessionScope.CS[0].account.accno}<br/>
		Atype:${sessionScope.CS[0].account.atype}<br/>
		Bal:${sessionScope.CS[0].account.bal}<br/>
		Street:${sessionScope.CS[0].account.address.street}<br/>
		City:${sessionScope.CS[0].account.address.city}<br/>
		</td>
	</tr>
	<tr bgcolor="purple">
		<td>6.Map object</td>
		<td>
			Sid:${sessionScope.HM["sid"]}<br/>
			Sname:${sessionScope.HM["sname"]}<br/>
			Email:${sessionScope.HM["email"]}<br/>
		</td>
	</tr>
	<tr bgcolor="pink">
		<td>7.Collection of Map object(*JSTL)</td>
		<td>Coming Soon</td>
	</tr>
</table>
</body>
</html>