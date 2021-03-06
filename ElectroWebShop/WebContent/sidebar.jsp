<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Sidebar</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>

<body class="w3-content" style="max-width: 250px">
	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top"
		style="z-index: 3; width: 250px" id="mySidebar">

		<div class="w3-container w3-display-container w3-padding-16">
			<i onclick="w3_close()"
				class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
			<h3 class="w3-container">
				<img src="Images/Logo.jpeg" style="width: 25px; height: 25px">
				<b>ELECTRO-WORLD</b>
			</h3>
		</div>

		<div class="w3-padding-64 w3-large w3-text-grey"
			style="font-weight: bold">
			<a onclick="myAccFunc()" href="javascript:void(0)"
				class="w3-button w3-block w3-white w3-left-align w3-text-grey">
				Phones & Accessories<i class="fa fa-caret-down"></i>
			</a>

			<div id="demoAcc"
				class="w3-bar-block w3-hide w3-padding-large w3-medium">
				<a class="w3-bar-item w3-button w3-light-grey"
					href="/ElectroWebShop/ListPhones"> <i
					class="fa fa-caret-right w3-margin-right"></i>Phone's
				</a> <a class="w3-bar-item w3-button"
					href="/ElectroWebShop/ListAccessories">Accessories</a>
			</div>

			<a onclick="myAccFunc1()" href="javascript:void(0)"
				class="w3-block w3-white w3-left-align w3-button w3-text-grey">
				Video Games & Consoles<i class="fa fa-caret-down"></i>
			</a>

			<div id="demoAcc1"
				class="w3-bar-block w3-hide w3-padding-large w3-medium">
				<a href="/ElectroWebShop/ListVideoGames"
					class="w3-bar-item w3-button w3-light-grey"> <i
					class="fa fa-caret-right w3-margin-right"></i>Video Games
				</a> <a href="/ElectroWebShop/ListConsoles"
					class="w3-bar-item w3-button">Consoles</a>
			</div>

			<a onclick="myAccFunc2()" href="javascript:void(0)"
				class="w3-button w3-block w3-white w3-left-align w3-text-grey">
				Computer Parts<i class="fa fa-caret-down"></i>
			</a>

			<div id="demoAcc2"
				class="w3-bar-block w3-hide w3-padding-large w3-medium">
				<a href="/ElectroWebShop/ListPowerSupply"
					class="w3-bar-item w3-button w3-light-grey"><i
					class="fa fa-caret-right w3-margin-right"></i>Power Supply</a> <a
					href="/ElectroWebShop/ListMotherboards"
					class="w3-bar-item w3-button">Motherboards</a> <a
					href="/ElectroWebShop/ListCPUs" class="w3-bar-item w3-button">CPU's</a>
				<a href="/ElectroWebShop/ListGPUs" class="w3-bar-item w3-button">GPU's</a>
			</div>

			<a onclick="myAccFunc3()" href="javascript:void(0)"
				class="w3-button w3-block w3-white w3-left-align w3-text-grey">
				Laptops & PC's<i class="fa fa-caret-down"></i>
			</a>

			<div id="demoAcc3"
				class="w3-bar-block w3-hide w3-padding-large w3-medium">
				<a href="/ElectroWebShop/ListLaptops"
					class="w3-bar-item w3-button w3-light-grey"> <i
					class="fa fa-caret-right w3-margin-right"></i>Laptops
				</a> <a href="/ElectroWebShop/ListPCs" class="w3-bar-item w3-button">PC's</a>
			</div>

			<a href="/ElectroWebShop/ListIcChips" class="w3-bar-item w3-button">IC-chips</a>
			<a href="/ElectroWebShop/ListTools" class="w3-bar-item w3-button">Tools</a>
			<a href="repairs.jsp" class="w3-bar-item w3-button">Repairs</a>
		</div>
		<a href="#footer" class="w3-bar-item w3-button w3-padding">Contact</a>
		<a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding"
			onclick="document.getElementById('newsletter').style.display='block'">Newsletter</a>
		<a href="#footer" class="w3-bar-item w3-button w3-padding">Subscribe</a>
	</nav>

	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Newsletter Modal -->
	<div id="newsletter" class="w3-modal">
		<div class="w3-modal-content w3-animate-zoom" style="padding: 32px">
			<div class="w3-container w3-white w3-center">
				<i
					onclick="document.getElementById('newsletter').style.display='none'"
					class="fa fa-remove w3-right w3-button w3-transparent w3-xxlarge"></i>
				<h2 class="w3-wide">NEWSLETTER</h2>
				<p>Join our mailing list to receive updates on new arrivals and
					special offers.</p>
				<form method="get" action="Subscribe">
					<p>
						<input class="w3-input w3-border" type="text" name="email" required
							placeholder="Enter e-mail" style="width: 100%" >
					</p>
					<input class="w3-round w3-red w3-large" type="submit"
						value="Subscribe">
				</form>
			</div>
		</div>
	</div>
	<script>
		// Accordion 
		function myAccFunc() {
			var x = document.getElementById("demoAcc");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
		function myAccFunc1() {
			var x = document.getElementById("demoAcc1");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
		function myAccFunc2() {
			var x = document.getElementById("demoAcc2");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
		function myAccFunc3() {
			var x = document.getElementById("demoAcc3");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}

		// Click on the "Jeans" link on page load to open the accordion for demo purposes
		document.getElementById("myBtn").click();

		// Open and close sidebar
		function w3_open() {
			document.getElementById("mySidebar").style.display = "block";
			document.getElementById("myOverlay").style.display = "block";
		}

		function w3_close() {
			document.getElementById("mySidebar").style.display = "none";
			document.getElementById("myOverlay").style.display = "none";
		}
	</script>
</body>
</html>