<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">
<title>repairs</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>
<body class="w3-content" style="max-width: 1200px">
	<jsp:include page="sidebar.jsp" flush="true" />
	<%--check to see if user has logged in --%>
	<%
		String user = (String) session.getAttribute("currentSessionUser");
		if (user != null) {
	%>
	<jsp:include page="header.jsp" flush="true" />
	<%
		} else if (user == null) {
	%>
	<jsp:include page="startHeader.jsp" flush="true" />
	<%
		}
	%>

	<!-- Page Content -->
	<div class="w3-main" style="margin-left: 250px">
		<header class="w3-container w3-xlarge">
			<p class="w3-center w3-text-black">
				<b>Repairs Form</b>
			</p>
		</header>

		<!-- Product Grid -->

		<form method="get" action="Repairs">
			<table class="w3-centered w3-table  w3-large" style="margin-bottom: 100px">
				<tr>
					<td><b>Name</b></td>
					<td><input  type="text" name="name" style="width:100%"></td>
				</tr>
				<tr>
					<td><b>Email</b></td>
					<td><input class="w3-input" required type="text" name="email" style="width:100%"></td>
				</tr>
				<tr>
					<td><b>Address</b></td>
					<td><input class="w3-input" required type="text" name="address" style="width:100%"></td>
				</tr>
				<tr>
					<td><b>Description</b></td>
					<td><input class="w3-input" required type="text" name="description" style="width:100%;height:80px"></td>
				</tr>
				<tr><td></td><td><input type="submit" value="Repairs" class="w3-blue w3-round" ></td></tr>
			</table>
		</form>


	</div>

	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>