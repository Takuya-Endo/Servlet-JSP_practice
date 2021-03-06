<%@ page
	language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.Objects"
	import="model.User"
	import="model.Mutter"
	import="java.util.ArrayList"
%>

<%
	User user = (User) session.getAttribute("user");
	ArrayList<Mutter> mutterList = (ArrayList<Mutter>) request.getAttribute("mutterList");
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
		
		<%= Objects.nonNull(request.getAttribute("error")) ? "\n" + request.getAttribute("error") : "" %>
		
		<form method="post" action="<%= request.getContextPath() %>/Main">
			
			<input type="text" name="text">
			<input type="submit" value="つぶやく">
		
		</form>
		
		<% for (Mutter mutter : mutterList) { %>
			
			<p><%= mutter.getName() %>：<%= mutter.getText() %></p>
			
		<% } %>
		
	</body>
</html>