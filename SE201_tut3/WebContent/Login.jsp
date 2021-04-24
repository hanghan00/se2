<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
form {
	width: fit-content;
	text-align: center;
	margin-top: 30px;
}
</style>
</head>
<body>
	<center>
		<form action="Login">
			<fieldset>
				Enter your username: 
				 <input type="text" name="username" size="20" require="required"> <br> <br> 
				
				Enter your password: 
				<input type="text" name="password" size="10" require="required"> <br> <br> 
				<input type="submit" value="Submit">
				</fieldset>
		</form>
	</center>

</body>
</html>