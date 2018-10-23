<%@ page contentType="text/html" pageEncoding="GBK"%>
<jsp:useBean id="simple" scope="page" class="elect.SimpleBean"/>
<html>
<head><title>hello jsp</title></head>
<body>
<%
	simple.setName("Joywy");
	simple.setAge(23);
%>
<h3>Name:<%=simple.getName()%></h3>
<h3>Age:<%=simple.getAge()%></h3>
</body>
</html>