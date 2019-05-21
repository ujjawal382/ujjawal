<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a:forEach var="trainee" items="${key}">
<td>Trainee name ${trainee.name}</td>

<td>House no is ${trainee.address.house_no}</td>
<td>City is ${trainee.address.city}</td>
<td>State  is ${trainee.address.state}</td>
<td>Pincode  is ${trainee.address.pin_code}</td>
</a:forEach>
</body>
</html>