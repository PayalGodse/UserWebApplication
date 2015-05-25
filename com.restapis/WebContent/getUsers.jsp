<%@page import="code.MongoServlet,java.util.*,com.mongodb.DBObject"%>  

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	 
	int age = Integer.parseInt(request.getParameter("age"));
		List<DBObject> list = MongoServlet.getAllUsers(age);
		
		out.println("Group by cities filtered by age<br>");
		
		for(DBObject result:list) {
			out.println(result+"<br>");
		}
		
	%>
</body>
</html>