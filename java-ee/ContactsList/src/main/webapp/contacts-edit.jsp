<%@ page import="model.JavaBeans" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Cast request attribute to JavaBeans
    JavaBeans contact = (JavaBeans) request.getAttribute("contact");
%>
<html>
<head>
    <meta charset="utf-8">
    <title>Update contact</title>
    <link rel="icon" href="img/favicon.png">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Update contact</h1>
    <form name="contactForm" action="update">
        <input type="hidden" name ="id" value = "<%= contact.getId() %>" />
        <input type="text" name="name" value="<%= contact.getName() %>"/><br/>
        <input type="text" name="phone" value="<%= contact.getPhone() %>"/><br/>
        <input type="email" name="email" value="<%= contact.getEmail() %>"/><br/>
        <input type="button" value="Save" class="btn btn-create-contact">
    </form>
    <script type="text/javascript" src="scripts/jquery-3.7.1.min.js"></script>
    <script type="text/javascript" src="scripts/validator.js"></script>
</body>
</html>
