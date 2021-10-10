<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="exercise_4.Employee" %>

<%
	Employee emp = new Employee("0001", "湊 雄輔");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for (int i = 1; i <= 10; i++) { %>
		<% if (i == 1 || i % 3 == 1) { %>
			<p style="color:red">IDは <%= emp.getName() %> 、名前は <%= emp.getName() %> です。</p>
		<% } else { %>
			<p>IDは <%= emp.getName() %> 、名前は <%= emp.getName() %> です。</p>
		<% } %>
	<% } %>
</body>
</html>