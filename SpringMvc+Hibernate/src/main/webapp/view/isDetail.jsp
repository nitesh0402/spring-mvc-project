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
<h1>hello</h1>

<form:form action="add.html" method="post">
<form:input path="srno"></form:input>
<br>
<br>
<form:input path="sname"></form:input>
<br>
<br>
<form:input path="schoolName"></form:input>
<br>
<br>
<input type="submit" name="btnsubmit" value="Click" />

</form:form>

<%-- <%
if(request.getAttribute("res")!=null)
{
	out.print(request.getAttribute("res"));
}

%> --%>


</body>
</html>