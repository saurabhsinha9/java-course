<html>
<body>
<h1><jsp:useBean id="cust" class="com.jlcindia.jsp.Customer" scope="session">
<jsp:setProperty property="cid" name="cust" value="102"/>
<jsp:setProperty property="cname" name="cust" value="saurabh"/>
<jsp:setProperty property="phone" name="cust" value="9999"/>
<jsp:setProperty property="city" name="cust" value="gaya"/>
</jsp:useBean>
<h1>Done</h1>
<h1>Using getProperty</h1>
Cid:<jsp:getProperty property="cid" name="cust"/><br/>
Cname:<jsp:getProperty property="cname" name="cust"/><br/>
Email:<jsp:getProperty property="email" name="cust"/><br/>
Phone:<jsp:getProperty property="phone" name="cust"/><br/>
City:<jsp:getProperty property="city" name="cust"/><br/>
<br/>
<h1>Using EL</h1>
Cid:${cust.cid}<br/>
Cname:${cust.cname}<br/>
Email:${cust.email}<br/>
Phone:${cust.phone}<br/>
City:${cust.city}
</h1>
</body>
</html>