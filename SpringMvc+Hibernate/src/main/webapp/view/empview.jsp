<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="empinsert.html" method="post">
<form:input path="empid"></form:input>
<br>
<br>
<form:input path="empname"></form:input>
<br>
<br>
<form:input path="job"></form:input>
<br>
<br>
<input type="submit" name="btnsubmit" value="Click" />


</form:form>

<%
if(request.getAttribute("res")!=null)
{
	out.print(request.getAttribute("res"));
}

%>

</body>
</html>