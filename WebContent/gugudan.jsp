<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
int dan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugudan.jsp</title>
<style>
body {
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<table border=1>
		<%
		for (int i = 1; i < 10; i++) {
		%>
		<tr>
			<td><%=dan%></td>
			<td>x</td>
			<td><%=i%></td>
			<td>=</td>
			<td><%=dan * i%></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>