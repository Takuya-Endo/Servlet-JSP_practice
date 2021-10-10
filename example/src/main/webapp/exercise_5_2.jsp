<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<h1>お問い合わせフォーム</h1>
	<form action="/example/Exercise_5_2Servlet" method="post">
		お名前：
		<input type="text" name="name">
		お問い合わせの種類：
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
		</select>
		お問い合わせ内容：
		<textarea name="body" rows="5" cols="20"></textarea>
		<input type="submit" value="送信">
	</form>
</body>
</html>