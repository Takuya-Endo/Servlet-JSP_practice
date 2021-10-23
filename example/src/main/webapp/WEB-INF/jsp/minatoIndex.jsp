<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="siteEV.model.SiteEV" %>

<% SiteEV siteEV = (SiteEV) application.getAttribute("siteEV"); %>

<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="UTF-8">
		<title>湊くんのページ</title>
	</head>
	<body>
		<h1>湊くんのページへようこそ</h1><br>
		
		<a href="<%= request.getContextPath() %>/MinatoIndex?action=like">よいね</a>
		<%= siteEV.getLike() %>：人　
		<a href="<%= request.getContextPath() %>/MinatoIndex?action=dislike">よくないね</a>
		<%= siteEV.getDislike() %>：人
		
	</body>
</html>