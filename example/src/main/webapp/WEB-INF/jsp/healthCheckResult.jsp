<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="health.model.Health" %>

<% Health health = (Health) request.getAttribute("health"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断の結果</title>
</head>
<body>
	<p>身長：<%= health.getHeight() %></p>
	<p>体重：<%= health.getWeight() %></p>
	<p>BMI：<%= health.getBmi() %></p>
	<p>体型：<%= health.getShape() %></p>
	<a href="/example/HealthCheck">戻る</a>
</body>
</html>