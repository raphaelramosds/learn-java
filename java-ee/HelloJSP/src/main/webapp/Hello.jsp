<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Olá, Java Server Page (JSP)</h1>
	<% out.println("Professor José de assis, suas aulas são ótimas"); %>
	
	<%
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String currDate = fmt.format(LocalDateTime.now());
	%>

	<%!int counter = 0; %>
	<p>Número de visitas: <%=counter++%></p>
</body>
</html>