<%@ page
	language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="model.User"
	import="model.Mutter"
	import="java.util.ArrayList"
%>

<%
	User user = (User) session.getAttribute("user");
	ArrayList<Mutter> mutterList = (ArrayList<Mutter>) application.getAttribute("mutterList");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>どこつぶ</title>
	</head>
	<body>
		<h1>どこつぶメイン</h1>
		
		<p>ようこそ<%= user.getName() %>さん</p>
		
		<a href="<%= request.getContextPath() %>/Logout">ログアウト</a>
		
		<form method="post" action="<%= request.getContextPath() %>/Main">
			
			<input type="text" name="mutter">
			<input type="submit" value="つぶやく">
		
		</form>
		
		<% for (Mutter mutter : mutterList) { %>
			
			<p><%= mutter.getUserName() %>：<%= mutter.getText() %></p>
			
		<% } %>
		
	</body>
</html>