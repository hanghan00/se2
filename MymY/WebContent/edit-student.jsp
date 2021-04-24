<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<form action="update" method="post">
		<h3 class="text-center">UPDATE STUDENT</h3>
		<input type="hidden" name="id" value="<c:out value='${student.id}' />">

		<fieldset class="form-group">
			<label>Name</label> <input type="text"
				value="<c:out value='${student.name}' />" class="form-control"
				name="name" required="required">
		</fieldset>

		<fieldset class="form-group">
			<label>Address</label> <input type="text"
				value="<c:out value='${student.address}' />" class="form-control"
				name="address">
		</fieldset>

		<fieldset class="form-group">
			<label>Phone</label> <input type="text"
				value="<c:out value='${student.phone}' />" class="form-control"
				name="phone">
		</fieldset>
		<div class="col text-center">
			<button type="submit" class="btn btn-success">UPDATE</button>
		</div>
	</form>
</body>
</html>