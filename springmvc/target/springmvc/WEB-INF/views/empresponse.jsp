<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp"/>

${message}

<br/>

Id == ${emp.id}<br/>
Age == ${emp.age}<br/>
Name == ${emp.name}<br/>
Last Name == ${emp.lName}<br/>
Salary == ${emp.salary}<br/>
 
</body>
</html>
  
  
  