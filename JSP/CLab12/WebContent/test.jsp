<%@ page import="com.jlcindia.jsp.Customer"%>
<html>
<body>
<%
Customer cust=new Customer();
cust.setCid(101);
cust.setCname("Srinivas");
cust.setEmail("sri@jlc");
cust.setPhone(12345);
cust.setCity("Bang");
session.setAttribute("CUST",cust);
%>
<h1>Done</h1>
<%
Object obj=session.getAttribute("CUST");
Customer cust1=(Customer)obj;
%>
Cid:<%= cust1.getCid()%><br/>
Cname:<%= cust1.getCname()%><br/>
Email:<%= cust1.getEmail()%><br/>
Phone:<%= cust1.getPhone()%><br/>
City:<%= cust1.getCity()%><br/>
</body>
</html>