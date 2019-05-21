<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<tr>
<td>Tutor ID</td>
<td>Product Name</td>
<td>Product Price</td>
<td>Product Description</td>
<td>Product Category</td>

</tr>

<a:forEach var="tutor" items="${showproduct}">
<tr>
<td>${pro.id}</td>
<td>${pro.name}</td>
<td>${pro.price}</td>
<td>${pro.description}</td></tr>
</a:forEach>
</body>
</html>