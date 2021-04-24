<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Management</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<form action="insert" method="post">
		<h3 class="text-center">ADD STUDENT</h3>
		<fieldset class="form-group">
			<label>Name</label> <input type="text" class="form-control"
				name="name" required="required">
		</fieldset>
		<fieldset class="form-group">
			<label>Address</label> <input type="text" class="form-control"
				name="address" required="required">
		</fieldset>
		<fieldset class="form-group">
			<label>Phone</label> <input type="text" class="form-control"
				name="phone" required="required">
		</fieldset>
		<div class="col text-center">
			<button type="submit" class="btn btn-success">ADD</button>
		</div>
	</form>


</body>
</html>