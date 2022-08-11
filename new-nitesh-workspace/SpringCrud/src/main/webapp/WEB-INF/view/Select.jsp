<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>${EmployeRecord}; </h1> --%>
<ul>
    <c:forEach var="listValue" items="${EmployeRecord}">
        <li>${listValue}</li>
    </c:forEach>
</ul>

</body>
</html>