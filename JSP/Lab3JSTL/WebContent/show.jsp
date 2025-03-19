<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Java Learning Center</h1>
<table border="2" style="font-size:26;color:red;">
	
	<tr bgcolor="yellow">
		<td>1.Strings Wrappers and Date</td>
		<td>
		<c:out value="${requestScope.EM}"/><br/>
		${sessionScope.PH}<br/>
		${applicationScope.DOB}<br/>
		</td>
	</tr>
		
	<tr bgcolor="pink">
		<td>2.Collection of Strings,Wrappers and Date.</td>
		<td>
			<table bgcolor="#c3d599" style="font-size:26;color:red;">
				<tr><c:forEach var="x" items="${requestScope.AL}">
				<td>${x}</td>
				</c:forEach>
				</tr>
			</table>

		<table bgcolor="wheet" style="font-size:26;color:red;">
				<tr><c:forEach var="x" items="${sessionScope.STR}">
				<td>${x}</td>
				</c:forEach>
				</tr>
			</table>
		</td>
	</tr>
	
	<tr bgcolor="lightyellow">
		<td>3.Collection of Collections</td>
		<td>
			<table bgcolor="#c3d599" style="font-size:26;color:red;">
				<tr><c:forEach var="list" items="${requestScope.AL1}">
				<tr>
				<c:forEach var="x" items="${list}">
				<td>${x}</td>
				</c:forEach>
				</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
	
	<tr bgcolor="lightblue">
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
	
	<tr bgcolor="sunny">
		<td>5.Collection of User defined class object</td>
		<td>
			<table bgcolor="wheet" style="font-size:26;color:red;">
			<tr>
				<td>Cid</td>
				<td>Cname</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Accno</td>
				<td>Atype</td>
				<td>Bal</td>
				<td>Street</td>
				<td>City</td>
			</tr>	
		<c:forEach var="cust" items="${sessionScope.CS}">
			<tr>
				<td>${cust.cid}</td>
				<td>${cust.cname}</td>
				<td>${cust.email}</td>
				<td>${cust.phone}</td>
				<td>${cust.account.accno}</td>
				<td>${cust.account.atype}</td>
				<td>${cust.account.bal}</td>
				<td>${cust.account.address.street}</td>
				<td>${cust.account.address.city}</td>
			</tr>
		</c:forEach>
		</table>
	</td>
	</tr>
	
	<tr bgcolor="grey">
		<td>6.Map object</td>
		<td>
			<table bgcolor="yellow" style="font-size:26;color:red;">
			<tr>
				<td>Map Key</td>
				<td>Map Value</td>
			</tr>
			<c:forEach var="entry" items="${sessionScope.HM}">
				<tr>
				<td>${entry.key}</td>
				<td>${entry.value}</td>
				</tr>
			</c:forEach>
			</table>
		</td>
	</tr>
	<tr bgcolor="dear">
		<td>7.Collection of Map object</td>
		<td>
			<table bgcolor="wheet" style="font-size:26;color:red;">
				<c:forEach var="map" items="${sessionScope.AL2}">
					<tr>
						<td><table bgcolor="#c3d599" style="font-size:26;color:red;">
								<tr>
									<td>Map Key</td>
									<td>Map Value</td>
								</tr>
								<c:forEach var="entry" items="${map}">
								<tr>
									<td>${entry.key}</td>
									<td>${entry.value}</td>
								</tr>
								</c:forEach>
							</table>
						</td>
					</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>
</body>
</html>