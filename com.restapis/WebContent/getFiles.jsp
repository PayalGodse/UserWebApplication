<%@page import="code.MongoServlet,java.util.*,com.mongodb.DBObject,javax.servlet.RequestDispatcher"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	 
	String dir = request.getParameter("Directory");
	RequestDispatcher rd = request.getRequestDispatcher("/FilesFolder");
	request.setAttribute("msg",dir);
	rd.forward(request, response);
		
		
		// Here you put the check on the username and password
	%>
</body>
</html>