<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Header</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}

input[type=text] {
	width: 130px;
	-webkit-transition: width 0.4s ease-in-out;
	transition: width 0.4s ease-in-out;
}

/* When the input field gets focus, change its width to 100% */
input[type=text]:focus {
	width:100%;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 50px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
	color: black;
	padding: 8px 10px;
	text-decoration: none;
	display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
	background-color: #f1f1f1
}

/* Show the dropdown menu on hover */
.drop:hover .dropdown-content {
	display: inline-block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.drop:hover .dropbtn {
	background-color: #3e8e41;
}
</style>

<body class="w3-content" style="max-width: 100%">
	<div class="w3-main" style="margin-left: 250px">

		<!-- Top menu on small screens -->
		<header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
			<div class="w3-bar-item w3-padding-24 w3-wide">Electro-World</div>
			<a href="javascript:void(0)"
				class="w3-bar-item w3-button w3-padding-24 w3-right"
				onclick="w3_open()"> <i class="fa fa-bars"></i>
			</a> <a href="login.jsp"
				class="w3-bar-item w3-button w3-padding-24 w3-right"
				> <i class="material-icons">person</i>
			</a> <a href="Start.jsp"
				class="w3-bar-item w3-button w3-padding-24 w3-right"> <i
				class="material-icons">home</i>
			</a>
		</header>

		<!-- Push down content on small screens -->
		<div class="w3-hide-large" style="margin-top: 83px; width: 100%"></div>

		<!-- Top header -->
		<header class="w3-container w3-xlarge">
			<p class="w3-left w3-text-blue">
				<b>For all your Electronic needs</b>
			</p>

			<p class="w3-right w3-hide-small">
				<a href="login.jsp" class="material-icons w3-margin-right w3-button">person</a>
			</p>

			<p class="w3-right">
				<i class="fa fa-shopping-cart w3-button" onclick="checkout()"></i>
			</p>

			<form method="get" action="Search">
				<p class="w3-left" style="margin-left: 20px" onclick="search()">
					<i class="w3-medium"><input type="text" name="search"
						placeholder="Search.."><input type="submit" name="search"
						value="Search"></i>
				</p>
			</form>

			<p class="w3-right w3-hide-small">
				<a href="Start.jsp" class="material-icons w3-button">home</a>
			</p>
		</header>
	</div>
	<script>
		function login() {

		}
		function checkout() {

		}
		function search() {

		}
	</script>
</body>
</html>