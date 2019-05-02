<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">
<title>Electro-World: Accessories</title>
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
			<p class="w3-left w3-text-black">
				<b></b>
			</p>
		</header>

		<!-- Product Grid -->
		<div class="w3-row" style="margin-bottom: 50px">

			<!--  Invoked when the user adds any item to the cart-->
			<c:if test="${!empty param.Add}">
				<c:set var="id" value="${param.Add}" />
				<c:set var="setName" value="${param.name}" />
				<p>
					You added <font color="red" size="+2"> <strong>${setName}</strong>
					</font>to your shopping cart.
				</p>
			</c:if>

			<!-- Invoked if an item is added to the cart and the number of items are greater than 0 -->
			<c:if test="${sessionScope.cart.numberOfItems > 0}">
				<p>
					<c:url var="url" value="/showcart">
						<c:param name="Clear" value="0" />
						<c:param name="Remove" value="0" />
					</c:url>
					<a href="${url}">Show Cart</a>&nbsp;&nbsp;&nbsp;
					<c:url var="url" value="/buyItems" />
					<a href="${url}">Buy Items</a>
				</p>
				<p>&nbsp;</p>
			</c:if>
			<c:forEach var="setList" items="${setDetailsList}">
				<div align="center">

					<table style="width: 541; height: 201; border: 1">
						<tr>
							<td width="335" height="33"><c:url var="url"
									value="/itemDetails">
									<c:param name="setID" value="${setList.setID}" />
								</c:url> <a href="${url}">${setList.setName}</a></td>
							<td width="355" rowspan="4"><img
								src="images/Anointed_Armor_of_Ruination_Set.png" width="256"
								height="171" alt="abaddon.png"
								longdesc="images/Anointed_Armor_of_Ruination_Set.png"></td>
						</tr>
						<tr>
							<td height="42">Price: ${setList.setPrice}</td>
						</tr>
						<tr>
							<td height="70">Quality: ${setList.setQuality}</td>
						</tr>
						<tr>
							<td height="42"><div align="center">
									<!--  Adds the specific item to the cart.-->
									<c:url var="url2" value="/itemcatalog">
										<c:param name="Add" value="${setList.setID}" />
										<c:param name="name" value="${setList.setName}" />
									</c:url>
									<a href="${url2}">Add to Cart</a>
								</div></td>
						</tr>
					</table>
				</div>

			</c:forEach>
			<p>&nbsp;</p>


		</div>

	</div>

	<jsp:include page="footer.jsp" flush="true" />
</body>
</html>