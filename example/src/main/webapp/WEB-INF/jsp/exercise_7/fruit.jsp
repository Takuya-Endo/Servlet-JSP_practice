<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="exercise_7.Fruit" %>

<% Fruit fruit = (Fruit) request.getAttribute("fruit"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>果物の値段</title>
</head>
<body>
	<h1>果物の値段</h1>
	<p><%= fruit.getName() %>の値段は<%= fruit.getPrice() %>円です。</p>
</body>
</html>