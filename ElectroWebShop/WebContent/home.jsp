<!DOCTYPE html>
<html>
<title>Homepage</title>
<meta charset="ISO-8859-1">
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
	<jsp:include page="header.jsp" flush="true" />


	<!-- !PAGE CONTENT! -->
	<div class="w3-main" style="margin-left: 250px">

		<!-- Push down content on small screens -->

		<h3 class="w3-center">Welcome ${currentSessionUser}!</h3>
		<div class="w3-hide-large" style="margin-top: 83px"></div>

		<!-- Image header -->
		<div class="w3-display-container w3-container">
			<img src="Images/banner1.jpg" alt="Electro"
				style="max-width: 1200px; width: 100%">
			<div class="w3-display-topleft w3-text-white"
				style="padding: 24px 48px">
				<h1 class="w3-jumbo w3-hide-small">Large Collection of
					Electronics</h1>
				<h1 class="w3-hide-large w3-hide-medium">Large Collection of
					Electronics</h1>

				<p>
					<a href="/ElectroWebShop/ListAll" class="w3-button w3-black w3-padding-large w3-large">SHOP
						NOW</a>
				</p>
			</div>
		</div>

		<!-- Push down content on small screens -->
		<div class="w3-hide-large" style="margin-top: 83px; width: 100%"></div>

		<div class="w3-container w3-xlarge w3-text-black">
			<p>
				<b>Best Sellers</b>
			</p>
		</div>

		<!-- Product grid -->
		<div class="w3-row">
			<div class="w3-col l3 s6">
				<div class="w3-container w3-button">
					<img src="Images/Asus1.jpg" alt="Asus"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						Asus ROG Strix II<br> <b>$1609.99</b>
					</p>
				</div>

				<div class="w3-container w3-button">
					<img src="Images/HP-Omen.jpeg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						HP OMEN 15-CE018DX<br> <b>$849.00</b>
					</p>
				</div>
			</div>

			<div class="w3-col l3 s6">
				<div class="w3-container w3-button">
					<img src="Images/Alienware.jpg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						Alienware M15<br> <b>$1249.99</b>
					</p>
				</div>
				<div class="w3-container w3-button">
					<img src="Images/acer.predator.jpeg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						Acer Predator 21-X<br> <b>$8999</b>
					</p>
				</div>
			</div>

			<div class="w3-col l3 s6">
				<div class="w3-container w3-button">
					<img src="Images/Xbox one.jpg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						Microsoft Xbox One S<br> <b>$269.99</b>
					</p>
				</div>
				<div class="w3-container w3-button">
					<div class="w3-display-container">
						<img src="Images/Playstation4.jpg"
							style="max-width: 100%; width: 100%; height: auto;"> <span
							class="w3-tag w3-display-topleft">Sale</span>
						<div class="w3-display-middle w3-display-hover">
							<button class="w3-button w3-black">
								Buy now <i class="fa fa-shopping-cart"></i>
							</button>
						</div>
					</div>
					<p>
						Playstation 4 Pro 1TB<br> <b class="w3-text-red">$474.99</b>
					</p>
				</div>
			</div>

			<div class="w3-col l3 s6">
				<div class="w3-container w3-button">

					<img src="Images/Elegoo.jpg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						ELEGOO Mega 2560 Starter Kit<br> <b>$50.99</b>
					</p>
				</div>
				<div class="w3-container w3-button">
					<img src="Images/Nvidia.jpg"
						style="max-width: 100%; width: 100%; height: auto;">
					<p>
						EVGA GeForce GTX 1080 Ti<br> <b>$769.99</b>
					</p>
				</div>
			</div>
		</div>
		<!-- Subscribe section -->
		<form method="get" action="Subscribe">
			<div class="w3-container w3-black w3-padding-32">
				<h1>Subscribe</h1>
				<p>To get special offers and VIP treatment:</p>
				<p>
					<input class="w3-input w3-border" type="text" name="email" required
						placeholder="Enter e-mail" style="width: 100%">
				</p>
				<input type="submit" value="Subscribe" class="w3-round w3-red w3-large">
			</div>
		</form>
	</div>

	<jsp:include page="footer.jsp" flush="true" />


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
