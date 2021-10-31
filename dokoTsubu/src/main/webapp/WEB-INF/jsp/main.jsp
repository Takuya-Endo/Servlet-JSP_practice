<%@ page
	language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="model.User"
%>

<% User user = (User) session.getAttribute("user"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>どこつぶ</title>
	</head>
	<body>
		<h1>どこつぶメイン</h1>
		
		<p>ようこそ<%= user.getName() %>さん</p>
		
	</body>
</html>