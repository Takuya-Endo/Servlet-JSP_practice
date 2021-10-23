<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="register.model.User" %>
    
<% User user = (User) session.getAttribute("user"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録確認画面</title>
</head>
<body>
	<p>ログインID：<%= user.getId() %></p>
	<p>名前：<%= user.getName() %></p>
	<a href="<%= request.getContextPath() %>/RegisterUser">戻る</a>　
	<a href="<%= request.getContextPath() %>/RegisterUser?action=done">登録</a>
</body>
</html>