<%@page import="com.model.message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login at ModernPay</title>
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
	<main style="height: 90vh; background: #e0e0e0;">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="card">
						<div class="card-header">
							<h1>Login here</h1>
						</div>
						<%
						message msg = (message) session.getAttribute("msg");
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
							<form action="logincontroller" id="reg-form" method = "post">
								
								<div class="form-group">
									<label for="exampleInputtext1">User Name</label> <input
										type="text"  required="required"
										class="form-control" id="exampleInputtext1"
										aria-describedby="textHelp" name="username"
										placeholder="Enter name">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" required="required" class="form-control"
										id="exampleInputPassword1" name="password"
										placeholder="Password">
								</div>
								<br>

								<div class="container text-center">
									<button type="submit" class="btn btn-primary">Submit</button>
									<button type="reset" class="btn btn-primary">Reset</button>
								</div>

							</form>
							<br>
							<h4>
								new user <a href="userregister.jsp">click here</a>
								forgot password <a href="forgotpassword.jsp">click here</a>
							</h4>
						</div>

					</div>
				</div>
			</div>


		</div>
	</main>



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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

	<script>
		
	</script>
</body>
</html>