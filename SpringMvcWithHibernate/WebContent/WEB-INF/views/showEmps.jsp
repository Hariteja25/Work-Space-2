
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body>
${msg}

<jsp:include page="header.jsp"></jsp:include>
<h2>Show All Employees</h2>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>LName</th>
		<th>Age</th>
		<th>Login Name</th>
		<th>Salary</th>
		<th>Email</th>
	</tr>

	<c:forEach var="emp" items="${emps}">

		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.lName}</td>
			<td>${emp.age}</td>
			<td>${emp.loginName}</td>
			<td>${emp.salary}</td>
			<td>${emp.email}</td>
			<td><a href="./editEmp?empId=${emp.id}">Edit</a></td>
			<td><a href="./deleteEmp1?empId=${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
	
     
</table>
</body>
</html>
