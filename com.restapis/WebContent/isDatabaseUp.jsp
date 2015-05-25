<%@page import="code.MongoServlet,java.util.*,com.mongodb.DBObject"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
		DBObject status = MongoServlet.isDatabaseUp();
		// Here you put the check on the username and password
		if (status!=null) {
			out.println("Host: "+status.get("host")+"<br>");
			out.println("Process: "+status.get("process")+"<br>");
			out.println("is Datbase working: "+status.get("ok")+"<br>");
		}
			%>
</body>
</html>