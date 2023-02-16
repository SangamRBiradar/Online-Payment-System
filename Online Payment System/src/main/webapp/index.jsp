<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage ModernPay</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.banner_background {
	clip-path: polygon(50% 0%, 81% 0, 100% 0, 100% 78%, 80% 90%, 50% 100%, 20% 90%, 0
		96%, 0 0, 20% 0);
}
</style>
<body>
	<!-- navbar -->
	<%@include file="navbar.jsp"%>
	<div class="container-fluid p-0 m-0">
		<div class="jumbotron main-1 banner_background">
			<h3 class="display-3 text-center">
				Welcome to <span style="font-weight: 700;"> Modern Pay </span>
			</h3>
			<br> <br>
			<div class="row" style="padding: 2em 2em;">
				<div class="col-sm-6">

					<br> <br>
					<h1
						style="margin-top: 48px; width: 390px; font-size: 36px; font-weight: 700; line-height: 46px;">
						Pay anyone directly from your wallet account.</h1>
				</div>
				<div class="col-sm-6">
					<img style="width: 500px" alt="" src="img/add-money-to-wallet.png">
				</div>

			</div>
		</div>


		<div class="row" style="padding: 2em 2em;">
			<div class="col-sm-6">


				<img style="width: 500px" alt="" src="img/e-wallet.png">

			</div>
			<div class="col-sm-6 text-center">
				<br> <br>
				<h1 class="text-center offset-2"
					style="padding-left: 10px; margin-top: 48px; width: 390px; font-size: 36px; font-weight: 700; line-height: 46px;">
					Money made simple, by ModernPay.</h1>
				<p class="" style="margin-top: 48px; font-size: 32px">
					Built for India with all the features and plus much more. <br>
					Modern Pay is the simplest way to send money home to your family
					or pay the neighbourhood chaiwala.
				</p>

			</div>
			<hr>
		</div>

		<div class="jumbotron main-1 banner_background">

			<br> <br>
			<div class="row" style="padding: 2em 2em;">
				<div class="col-sm-6">

					<br> <br>
					<h1
						style="margin-top: 48px; width: 390px; font-size: 36px; font-weight: 700; line-height: 46px;">
						Money in your bank</h1>

					<p class="" style="margin-top: 30px; font-size: 25px">
						Pay and receive money instantly using your existing wallet accounts.
			             It is your money, made simple. Modern Pay protects your money with a world class security system that helps detect fraud and prevents hacking.<br>
						
					</p>



				</div>
				<div class="col-sm-6">
					<img style="width: 500px" alt=""
						src="img/image-removebg-preview.png">
				</div>

			</div>
		</div>


	</div>

	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
		integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/myjs.js"></script>
</body>
</html>