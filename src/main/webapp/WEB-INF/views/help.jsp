<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//String name=(String)request.getAttribute("Name");

%>
 <!--<h1>Hello My Name Is  </h1>--><%-- <%=name --%> 
 <h1>Name is ${Name}</h1>
<h2>This is Help Page</h2>


<hr>
<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>


</body>
</html>