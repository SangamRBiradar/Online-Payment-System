<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       
 <%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.banner_background{
	clip-path: polygon(50% 0%, 81% 0, 100% 0, 100% 78%, 80% 90%, 50% 100%, 20% 90%, 0 96%, 0 0, 20% 0);
}
</style>
<body>
	<div class="container text-center"  >
		<img alt="" src="img/system.png" class="img-fluid" style="height: 20rem;padding: 7em 0 0 0" >
		<h3 class="display-4">Sorry... Something went wrong</h3>
		<%= exception %>
		<a href="index.jsp" class="btn btn-primary btn-ig text-white mt-3">Home</a>
	</div>
</body>

</html>