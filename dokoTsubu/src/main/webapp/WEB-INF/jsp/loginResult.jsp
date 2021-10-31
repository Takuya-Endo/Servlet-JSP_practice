<%@ page
	language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="model.User"
	import="java.util.Objects"
%>

<% User user = (User) session.getAttribute("user"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>どこつぶ</title>
	</head>
	<body>
		<h1>どこつぶログイン</h1>
		
		<% if (Objects.isNull(user)) { %>
		
			<p>ログインに失敗しました</p>
			<a href="<%= request.getContextPath() %>">トップへ</a>
		
		<% } else { %>
		
		<% } %>
		
	</body>
</html>