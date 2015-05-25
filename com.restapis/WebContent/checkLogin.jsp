<%@page import="code.MongoServlet"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		 String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username == null || password == null) {

			out.println("Invalid paramters ");
		}
 		
		boolean status = MongoServlet.authenticateUser(username,password);
		// Here you put the check on the username and password
		if (status) {
			out.println("Welcome user");
			%>
	<form action="getUsers.jsp">
		<table>
			<tr>
				<td>Age :</td>
				<td><input name="age" size=15 type="text" /></td>
				<td><input type="submit" value="AllUsers" /></td>
			</tr>
		</table>
	</form>

	<form action="isDatabaseUp.jsp">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="isDatabaseUp" /></td>
			</tr>
		</table>
	</form>

	<form action="getFiles.jsp" method="post">
		<table>
			<tr>
				<td>Directory :</td>
				<td><input name="Directory" size=15 type="text" /></td>
				<td><input type="submit" value="ListOf Files" /></td>
			</tr>
		</table>
	</form>
	<% 
		} else {
			out.println("Invalid username and password");
		}
	%>


</body>
</html>