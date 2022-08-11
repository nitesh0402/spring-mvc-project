<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
    <c:forEach var="listValue" items="${lists}">
        <li>${listValue}</li>
    </c:forEach>
</ul>
</body>
</html>