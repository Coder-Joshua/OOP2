
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="web.customer.*"%>
<%@ page import="web.DAO.*"%>
<%@ page import="web.entitites.*"%>
<%@ page import="web.info.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>accessories</title>
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

table {
	background-color: #DEECF7;
	width: 37%;
	margin: 0 auto;
	position: relative;
	top: 110px;
	box-shadow: 10px 10px 5px #888888;
	padding: 10px;
	color: rgb(21, 126, 185);
	font-weight: 700;
}

.error {
	position: relative;
	color: red;
	font-size: 15px;
}

.form-row label {
	margin-left: 15px;
}

tr.border_top td {
	border-top: 2pt solid rgb(236, 106, 106);
	padding-top: 10px;
	border-bottom: 2pt solid rgb(236, 106, 106);
	padding-bottom: 10px;
}

tr.payment {
	text-align: center;
	font-size: 20px;
	font-weight: 700;
	color: rgb(21, 126, 185);
}

.btn {
	float: right;
	width: 135px;
	height: 33px;
	font-size: 13px;
	background-color: rgb(109, 236, 145);
	border: 0;
	border-radius: 7px;
	color: rgb(231, 10, 10);
	font-weight: 700;
}

.price a {
	-moz-box-shadow: inset 0px 0px 0px 0px #ffffff;
	-webkit-box-shadow: inset 0px 0px 0px 0px #ffffff;
	box-shadow: inset 0px 0px 0px 0px #ffffff;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #d1e1e6
		), color-stop(1, #6dc1f2));
	background: -moz-linear-gradient(center top, #d1e1e6 5%, #6dc1f2 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#d1e1e6',
		endColorstr='#6dc1f2');
	background-color: #d1e1e6;
	-moz-border-radius: 6px;
	-webkit-border-radius: 6px;
	border-radius: 6px;
	border: 1px solid #dcdcdc;
	display: inline-block;
	color: #777777;
	font-family: arial;
	font-size: 15px;
	font-weight: bold;
	padding: 6px 24px;
	text-decoration: none;
	text-shadow: 1px 1px 0px #ffffff;
}

.price a:hover {
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #6dc1f2
		), color-stop(1, #d1e1e6));
	background: -moz-linear-gradient(center top, #6dc1f2 5%, #d1e1e6 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#6dc1f2',
		endColorstr='#d1e1e6');
	background-color: #6dc1f2;
}

.price a:active {
	position: relative;
	top: 1px;
}
</style>

<body class="w3-content" style="max-width: 1200px">
	<jsp:include page="sidebar.jsp" flush="true" />
	<jsp:include page="header.jsp" flush="true" />

	<!-- Page Content -->
	<div class="w3-main" style="margin-left: 250px">
		<header class="w3-container w3-xlarge">
			<p class="w3-center w3-text-black">
				<b>Purchase Succesfull!</b>
			</p>
		</header>
		
		<div class="w3-container w3-center w3-text-black" style="margin-top:-100px;margin-bottom:150px">
		<table class="w3-large">
		<tr><td><b class="w3-text-large">Thank you for your Purchase!</b></td></tr>
		<tr><td>Feel free to keep shopping at ElectroWorld</td></tr>
		<tr><td>for all you Electronic needs!^^</td></tr>
		</table>
		
		
		</div>
	</div>

	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>