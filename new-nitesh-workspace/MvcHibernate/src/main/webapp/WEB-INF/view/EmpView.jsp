<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

<%-- <h1>hello nitesh</h1>
${res}
 --%>
</body>
</html>

</body>
</html>