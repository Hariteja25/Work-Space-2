<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>
My Profile</title>

</head>
<body>

 <jsp:include page="header.jsp"/>
 <br>
 
 <br>
 <a href="./changepassword">Change Password</a>&nbsp;&nbsp;&nbsp;
<a href="./updateMyprofile">Update Profile</a>

 <h2>Profile Details</h2>
<font color="red"> ${msg}</font>

<jsp:include page="emp.jsp"/>

 </body>
 </html>
    