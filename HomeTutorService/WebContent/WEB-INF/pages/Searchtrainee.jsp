<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri ="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Search Trainee</h1>
<c:form action="searchTrainee" method="post" ModelAttribute="searchtrainee">
<table>
<tr>
<td>Enter Tutor id to search trainee</td>
<input type="number" name="id">
<td><input type="submit" value="Search Trainee" >
</table></c:form>
<table border="1">
<tr>


</tr>
</table>


</body>
</html>