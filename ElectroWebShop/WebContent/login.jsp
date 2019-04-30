<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>login</title>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>

<body>
	<body class="w3-content" style="max-width: 1200px">
		<jsp:include page="sidebar.jsp" flush="true" />
		<jsp:include page="startHeader.jsp" flush="true" />
				
		<div class="w3-main" style="margin-left: 250px">
		<form class="w3-main" style="margin-left: 250px; margin-top: 75px; margin-bottom: 75px" method="get" action="Login">
			
			<h1 style="color:black">Login</h1><br/>
			
			<table>
				<tr>
					<td><b>User Name</b></td>
					<td><input type="text" name="uname" style="width:100%"></td>
				</tr>
				<tr>
					<td><b>Password</b></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="w3-blue w3-round" type="submit" value="login"></td>
				</tr>
			</table><br/><br/>
			Don't have an account yet?
			<a href="register.jsp">Please register first!</a>
		</form>
		
		</div>
		<jsp:include page="footer.jsp" flush="true" />
	</body>
</html>