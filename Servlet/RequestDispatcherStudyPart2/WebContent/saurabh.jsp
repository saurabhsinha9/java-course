<html>
<body>
saurabh.jsp
<%
Object obj=request.getAttribute("UN");
if(obj.equals("aditya")){
	RequestDispatcher rd=request.getRequestDispatcher("aditya.jsp");
	rd.include(request,response);
}
%>
</body>
</html>