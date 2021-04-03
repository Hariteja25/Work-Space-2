<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>


<body>

	<h1>Change Password</h1>
	<font color="Red">${msg}</font>
	<form:form action="setpassword" method="post" >
		<table>
			<tr>
				<td>Old Password</td>
				<td><input type="password" name="psd1" ></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="psd2" ></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="psd3" ></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="submit"></td>
			</tr>
		</table>
	</form:form>
	
			
</body>
</html>