<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register at ModernPay</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	<!-- navbar -->
	<%@include file="navbar.jsp"%>
	<main class="" style="background: #e0e0e0;">
		<div class="container">
			<div class="background: #e0e0e0;">
				<div class="card">
					<div class="card-header align-center">
						<h1>REGISTER HERE</h1>
					</div>
					<div class="card-body">
						<form action="registercontroller" id="reg-form">
							<h3>Personal Details</h3>
							<br>
							<div class="form-group">
								<label for="exampleInputtext1">Name</label> <input type="text"
									class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="fname"
									placeholder="Enter name">
							</div>
							<div class="form-group">
								<label for="exampleInputtext1">User-Name</label> <input
									type="text" class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="uname"
									placeholder="Enter User-name">
							</div>
							<div class="form-group">
								<label for="exampleInputtext1">Mobile No</label> <input
									type="text" class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="phonenumber"
									placeholder="Enter Phone number">
							</div>
							<div class="form-group">
								<label for="exampleInputradio1">Gender</label> <br> <input
									type="radio" name="user_gender" value="Male">Male
								&nbsp;&nbsp; <input type="radio" name="user_gender"
									value="Female">Female<br>
							</div>
							<div class="form-group">
								<label for="exampleInputtext1">Birth Date</label> <input
									type="date" class="form-control" id="exampleInputdate1"
									aria-describedby="dateHelp" name="bday"
									placeholder="Enter your bday">
							</div>
							<div class="form-group">
								<label for="exampleInputtext1">Occupation</label> <input
									type="text" class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="occupation"
									placeholder="Enter your Occupation">
							</div>
							<div class="form-group">
								<label for="exampleInputtext1">Address</label> <input
									type="text" class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="address"
									placeholder="Enter Phone Address">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									name="password" placeholder="Password">
							</div>
							<br>
							<h3>Bank Details</h3>
							<br>
							<div class="form-group">
								<label for="exampleFormControlSelect1">Bank name</label> <select
									class="form-control" id="exampleFormControlSelect1"
									name="bankname">
									<option>--Select Bank--</option>
									<option value="Bank of India">Bank of India</option>
									<option value="State Bank of India">State Bank of India</option>
									<option value="Central Bank of India">Central Bank of India</option>
									<option value="Bank of Maharashtra">Bank of Maharashtra</option>
									<option value="Bank of Baroda">Bank of Baroda</option>
									<option value="Axis Bank">Axis Bank</option>
									<option value="HDFC Bank">HDFC Bank</option>
									<option value="ICICI Bank">ICICI Bank</option>
								</select>
							</div>
							<div class="form-group">
								<label for="exampleInputtext1"></label>Account Holder Name<input
									type="text" class="form-control" id="exampleInputtext1"
									aria-describedby="textHelp" name="Acc_holder_name"
									placeholder="Enter Account Holder Name">
							</div>
							<div class="form-group">
								<label for="exampleInputnumber1">Account Number</label> <input
									type="number" class="form-control" id="exampleInputnumber1"
									aria-describedby="numberHelp" name="Account_Number"
									placeholder="Enter Account Number">
							</div>
							<div class="form-group">
								<label for="exampleFormControlSelect1">Account Type</label> <select
									class="form-control" id="exampleFormControlSelect1"
									name="Account_type">
									<option>--Account Type--</option>
									<option value="Saving">Savings</option>
									<option value="Current">Current</option>
								</select>
							</div>
						
							<div class="form-group">
								<label for="exampleInputnumber1">Amount</label> <input
									type="number" class="form-control" id="exampleInputnumber1"
									aria-describedby="numberHelp" name="Amount"
									placeholder="Enter Amount">
							</div>
							<br>
							<button type="submit" class="btn btn-primary">Submit</button>
							<button type="reset" class="btn btn-primary">Reset</button>
						</form>
						<br>
						<h4>
							Existing user <a href="UserLogin.jsp">click here</a>
						</h4>
					</div>
				</div>
			</div>
		</div>
	</main>
	<script src="https://code.jquery.com/jquery-3.6.1.js"
		integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/myjs.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script>
		
		$(document).ready(function()
		{
			console.log("loaded....");
			$(document).on('submit','#reg-form', function(event)
			{
				event.preventDefault();
				let form = new FormData(this);
				
				//send register servlet
				$.ajax({
					url:"registercontroller",
					type:'POST',
					data:form,
						success: function(data,textStatus,jqXHR){
							console.log(data);
							if(data.trim()==='done')
								{
							swal("Register Successfully...Login again to continue")
							.then((value) => {
							  window.location = "UserLogin.jsp";
							});
								}
							else
								{swal("Something went wrong...Try again")}
							
						},
						error: function(jqXHR, textStatus, errorThrown) {
							swal("Something went wrong...Try again")
							.then((value) => {
							  window.location = "userregister.jsp"
							});
						},
					processData: false,
					contentType: false
				});
			});
			
				
		});
				
			
		
	</script>

</body>
</html>