<%@page import="com.model.bank"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.model.showhistory"%>
<%@page import="java.util.List"%>
<%@page import="com.model.profiledisplay"%>
<%@page import="com.model.message"%>
<%@page import="com.model.user"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page errorPage="error.jsp"%>

<%
profiledisplay user = (profiledisplay) session.getAttribute("currentuser");
bank b = (bank) session.getAttribute("bankinfo");
if (user == null) {
	response.sendRedirect("UserLogin.jsp");
}
message msg = (message) session.getAttribute("msg");
%>
<!---->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard ModernPay</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
</head>
<body>

	<!-- navbar -->

	<nav class="navbar navbar-expand-lg navbar-dark primary_background">
		<a class="navbar-brand" href="index.jsp"> <span class="fa fa-bank">&nbsp;Modern Pay</span>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home<span
						class="sr-only">(current)</span></a></li>
				<li class="nav-item "><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#bank_model">&nbsp;Bank</a></li>
				<div class="modal fade" id="bank_model" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">
									<span class="fa fa-bank">&nbsp;Modern Pay</span>
								</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
								<div class="container text-center">
									<img alt="" src="img/default-profile.png"
										style="border-radius: 50px;">
									<h5 class="modal-title" id="exampleModalLabel"><%=user.getUname()%></h5>
								</div>
								<table class="table">

									<tbody>
										<tr>
											<th scope="row">Account No. :</th>
											<td><%=b.getBankname()%></td>

										</tr>
										<tr>
											<th scope="row">Account number :</th>
											<td><%=b.getAccount_Number()%></td>

										</tr>
										<tr>
											<th scope="row">Account Holder Name :</th>
											<td><%=b.getAcc_holder_name()%></td>
										</tr>
										<tr>
											<th scope="row">Account type :</th>
											<td><%=b.getAccount_type()%></td>
										</tr>
										<tr>
											<th scope="row">Balance :</th>
											<td><%=b.getAmount()%></td>
										</tr>


									</tbody>
								</table>
							</div>

							<div class="modal-footer">
								<p>
								<a class = "btn btn-outline-dark" href = "transfertobank.jsp">Transfer wallet to bank</a>
									<a class = "btn btn-outline-dark" href = "transfermoney.jsp">Transfer money to wallet</a>
									<button type="button" class = "btn btn-outline-dark"
										data-dismiss="modal">Close</button>
								</p>

							</div>
						</div>
					</div>
				</div>
				<li class="nav-item"><a class="nav-link" href="contactus.jsp">Contact us</a></li>
				
				


			</ul>
			<ul class="navbar-nav mr-right">
				<li class="nav-item "><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#profile-model"><span
						class="uil uil-user-circle"></span>&nbsp;<%=user.getUname()%></a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/logoutcontroller"><span
						class="uil uil-sign-out-alt"></span>&nbsp;logout</a></li>
						
			</ul>
		</div>
	</nav>
	<!-- end of navbar -->

	<!-- profile model -->

	<!-- Modal -->
	<div class="modal fade" id="profile-model" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">
						<span class="fa fa-bank">&nbsp;Modern Pay</span>
					</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<img alt="" src="img/default-profile.png"
							style="border-radius: 50px;">
						<h5 class="modal-title" id="exampleModalLabel"><%=user.getUname()%></h5>
					</div>
					<table class="table">

						<tbody>
							<tr>
								<th scope="row">Wallet No. :</th>
								<td><%=user.getCust_id()%></td>

							</tr>
							<tr>
								<th scope="row">Name :</th>
								<td><%=user.getFname()%></td>

							</tr>
							<tr>
								<th scope="row">Phone No. :</th>
								<td><%=user.getPhonenumber()%></td>
							</tr>
							<tr>
								<th scope="row">Gender :</th>
								<td><%=user.getGender()%></td>
							</tr>
							<tr>
								<th scope="row">Birth Date :</th>
								<td><%=user.getBday()%></td>
							</tr>
							<tr>
								<th scope="row">Occupation :</th>
								<td><%=user.getOccupation()%></td>
							</tr>
							<tr>
								<th scope="row">Address :</th>
								<td><%=user.getAddress()%></td>
							</tr>

						</tbody>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	<!-- End of profile model -->

	<!-- check balance -->
	<div class="row" style="padding: 2em 2em;">
		<div class="col-sm-6">
			<div class="card">
				<div class="card-header">
					<h3 class="card-title">Send Money</h3>
				</div>
				<%
				if (msg != null) {
				%>
				<div class="alert <%=msg.getCss()%>" role="alert">
					<%=msg.getContent()%>
				</div>
				<%
				session.removeAttribute("msg");
				}
				%>
				<div class="card-body">
					<form action="sendmoneycontroller">
						<div class="form-group">
							<label for="exampleInputnumber1">Receiver ID : </label> <input
								type="number" name="rid" class="form-control"
								id="exampleInputnumber1" aria-describedby="numberHelp"
								placeholder="Enter receiver id">

						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Amount : </label> <input
								type="number" name="amount" class="form-control"
								id="exampleInputnumber1" placeholder="Enter Amount here">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Password</label> <input
								type="password" name="password" class="form-control"
								id="exampleInputPassword1" placeholder="Password"> <small
								id="textHelp" class="form-text text-muted">Your data is safe with us.
								</small>
						</div>
						<input type="hidden" name="uid" value="<%=user.getCust_id()%>">
						<input type="hidden" name="currentamount"
							value="<%=user.getAmount()%>"> <input type="hidden"
							name="realpassword" value="<%=user.getPassword()%>">
						<button type="submit" value="submit" class="btn btn-primary">Transfer</button>
					</form>
				</div>
			</div>
		</div>
		<div class="col-sm-6">
			<div class="card">
			<h3 class="card-title">Check Wallet balance</h3>
				</div>
				<div class="card-body">
					<h5 class="card-title">Wallet Balance</h5>
					<h5 class="card-text"><%=user.getAmount()%></h5>
					<form action="showhistorycontroller">
						<input type="hidden" name="uid" value="<%=user.getCust_id()%>">
						<p>
							<input class="btn btn-primary" type="submit" value="refresh">
							<input class="btn btn-primary" type="button" value="Show history"
								data-toggle="collapse" data-target="#collapseExample"
								aria-expanded="false" aria-controls="collapseExample">

						</p>
					</form>
					<%
					LinkedList<showhistory> sh = (LinkedList<showhistory>) session.getAttribute("lst");
					;
					%>
					<div class="collapse" id="collapseExample">
						<div class="card card-body">

							<table class="table">
								<thead>

									<tr>

										<th scope="col">Wallet no.</th>
										<th scope="col">Amount</th>
										<th scope="col">Date & time</th>
									</tr>
								</thead>
								<tbody>
									<%
									
									String color = null;
									if (sh != null) {
										for (showhistory l : sh) {
											if (l.getStatus().contentEquals("credited")) {
										color = "green";
											} else {
										color = "red";
											}
									%>
									<tr>

										<th scope="row"><%=l.getCust_id()%></th>
										<th scope="row" style="color: <%=color%>"><%=l.getAmount()%></th>
										<td><%=l.getDate()%></td>

									</tr>
									<%
									}
									}
									session.removeAttribute("lst");
									%>
								</tbody>
							</table>
						</div>
					</div>

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