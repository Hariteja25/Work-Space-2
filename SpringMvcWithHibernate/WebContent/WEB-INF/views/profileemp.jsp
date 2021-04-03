<!DOCTYPE table PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<form >
<form:hidden path="id" />
<form:hidden path="loginName" />
<table border="1" width="30%">
	
	<tr>
		<td><label id="fNameLbl">First Name</label></td>
		<td>${emp.name}</td>
	</tr>

	<tr>
		<td><label id="lNameLbl">Last Name</label></td>
		<td>${emp.lName}</td>
	</tr>
<tr>
		<td><label id="loginLbl">Email</label></td>
		<td>${emp.email}</td>
	</tr>
	<tr>
		<td><label id="lNameLbl">Age</label></td>
		<td>${emp.age}</td>
	</tr>

	<tr>
		<td><label id="salLbl">Salary</label></td>
		<td>${emp.salary}</td>
	</tr>


</table>




</form>



</body>

</html>
