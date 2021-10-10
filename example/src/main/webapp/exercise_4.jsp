<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="exercise_4.Employee" %>
    
<%
	
	Employee emp = new Employee("0001", "湊 雄輔");
	String employee = "";
	String pTag = "";
	for (int i = 1; i <= 10; i++) {
		if (i == 1 || i == 4 || i == 7 || i == 10) {
			pTag = "<p style = color:red>";
		} else {
			pTag = "<p>";
		}
		employee += pTag + "IDは" + emp.getId() + "、名前は" + emp.getName() + "です。</p>";
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeInfo</title>
</head>
<body>
	<%= employee %>
</body>
</html>