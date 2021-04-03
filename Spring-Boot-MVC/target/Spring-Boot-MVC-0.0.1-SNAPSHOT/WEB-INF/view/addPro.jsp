
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>
<head>
<title>Product manager</title>
</head>

<body>

	<h2>Add Product</h2>
	<font color="red">${msg }</font>


	<form:form method="get" action="addProduct" >
		<table>
			<tr>
				<td><form:label path="articleId">Artile Id</form:label></td>
				<td><form:input path="articleId" /></td>
			</tr>
			<tr>
				<td><form:label path="title">Title</form:label></td>
				<td><form:password path="title" /></td>
			</tr>
			<tr>
				<td><form:label path="category">Category</form:label></td>
				<td><form:input path="category" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Product" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
