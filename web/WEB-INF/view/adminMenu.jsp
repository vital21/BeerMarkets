<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 13.06.2022
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello admin</h1>
<a href="/logout">Logout</a>
<form method="get" action="DispatcherServlet">
    <input type="text" required placeholder="login" name="login"><br>
    <input type="password" required placeholder="password" name="password"><br><br>
    <input  type="submit" value="войти">
    <input  type="submit" value="регестрация">
</form>
</body>
</html>
