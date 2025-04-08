<%@page import="model.JavaBeans"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Cast request attribute to ArrayList<JavaBeans>
	ArrayList<JavaBeans> contacts = (ArrayList<JavaBeans>) request.getAttribute("contacts");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts List</title>
<link rel="icon" href="img/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Contacts List</h1>
	<a href="contacts-form.html" class="btn btn-info">New contact</a>
	<a href="report" class="btn btn-danger">Exportar</a>
	<table class="table">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Phone</th>
				<th>Email</th>
				<th>Ação</th>
			</tr>
		</thead>
		<tbody>
			<% for (JavaBeans contact : contacts) {%>
			<tr>
				<td><%=contact.getName()%></td>
				<td><%=contact.getPhone()%></td>
				<td><%=contact.getEmail()%></td>
				<td>
					<a href="edit?id=<%=contact.getId()%>" class="btn btn-info">Editar</a>
					<a href="javascript: void(0)" class="btn btn-danger btn-remove-contact" data-id="<%=contact.getId()%>">Excluir</a>
				</td>
			</tr>
			<%} %>
		</tbody>
	</table>

	<script type="text/javascript" src="scripts/jquery-3.7.1.min.js"></script>
	<script type="text/javascript" src="scripts/confirm.js"></script>
</body>
</html>