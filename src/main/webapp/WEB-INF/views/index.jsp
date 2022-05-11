<%@page import="java.util.*"%>
<%@page isELIgnored="false" %>
<html>
<body>
	<h1>This is home page</h1>
	<h1>Called by Home controller</h1>
	<h1>Url /home</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	%>
	<h1>
		Name is
		<%=name%></h1>
		<h1>Id id <%=id%></h1>
</body>
</html>
