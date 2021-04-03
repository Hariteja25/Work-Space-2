<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp"/>
${message }
<br/>

<ul>names are :

<c:forEach items="${names}" var="name">
 <li>${name}</li>
 </c:forEach>
 
</ul> 
<br/>

  </body>
</html>
