<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.*"%>
<%@ page import="web.customer.*"%>
<%@ page import="web.DAO.*"%>
<%@ page import="web.entitites.*"%>
<%@ page import="web.info.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">
<title>Electro-World:Cart</title>
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

.empty {
	font-size: 20px;
	font-weight: 700;
	color: rgb(255, 0, 0);
	padding: 12px;
	position: relative;
	left: 200px;
	top: 11px;
}

.price {
	font-size: 20px;
	font-weight: 700;
	color: rgb(255, 0, 0);
	padding: 12px;
	position: relative;
	top: 60px;
}

table {
	background-color: #DEECF7;
	width: 80%;
	margin: 0 auto;
	position: relative;
	top: 64px;
	box-shadow: 10px 10px 5px #888888;
	padding: 10px;
}

.right {
	float: right
}

.checkout {
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

.checkout:hover {
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #6dc1f2
		), color-stop(1, #d1e1e6));
	background: -moz-linear-gradient(center top, #6dc1f2 5%, #d1e1e6 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#6dc1f2',
		endColorstr='#d1e1e6');
	background-color: #6dc1f2;
}

.checkout:active {
	position: relative;
	top: 1px;
}

tr.border_bottom td {
	border-bottom: 2pt solid rgb(236, 106, 106);
	padding-bottom: 10px;
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
				<b>ShoppingCart</b>
			</p>
		</header>

		<!-- Product Grid -->
		<div style="margin-top:-40px;margin-bottom:100px">
			<%
				if (session.getAttribute("shop") != null) {
					ShoppingCart sh = (ShoppingCart) session.getAttribute("shop");
					ArrayList<ProductBean> pd = sh.getIt();
					float total = 0;
					out.println("<table>");
					out.println("<tr class='border_bottom'>");
					out.println("<td><span class='name'><b>Item Name</b></span></td>");
					out.println("<td><span class='image'><b>Image</b></span></td>");
					out.println("<td><span class='desc'><b>Description</b></span></td>");
					out.println("<td><span class='prc'><b>$ Price</b></span></td>");
					out.println("</tr>");
					for (int i = 0; i < pd.size(); i++) {
						out.println("<tr>");
						out.println("<td><span class='name'>" + pd.get(i).getProductName() + "</span></td>");
						out.println("<td><span class='image'><img src='data:image/jpg;base64," + pd.get(i).getBase64image()
								+ "' width='160px' height='160px'></span></td>");
						out.println("<td><span class='desc'>" + pd.get(i).getProductDetails() + "</span></td>");
						out.println("<td><span class='price'>$" + pd.get(i).getProductPrice() + "</span></td>");
						out.println("</tr>");
						total += pd.get(i).getProductPrice();
					}
					out.println("<tr class='border_bottom'>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("<span class='price right'>Total</span>");
					out.println("</td>");
					out.println("<td>");
					out.println("<span class='price'>$" + total + "</span>");
					out.println("<tr>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("<span class='price'><a href='checkout.jsp' class='checkout'>Checkout</a></span>");
					out.println("</td>");
					out.println("<tr>");
					out.println("<tr>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("</td>");
					out.println("<td>");
					out.println("<span class='price'></span>");
					out.println("</td>");
					out.println("<tr>");
					out.println("</table>");
				} else {
					out.println("<div class='w3-container w3-center' style='margin-top:50px'><span class='w3-text-red w3-xlarge'>Shopping cart is currently empty</span></div>");
				}
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>