<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 14.06.2022
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <meta charset="utf-8" />
</head>
<body>
<div class="form">
  <h1>input</h1><br>
  <form method="get" action="Servlet">
    <input type="text" required placeholder="login" name="login"><br>
    <input type="email" required placeholder="email" name="email"><br>
    <input type="password" required placeholder="password" name="password"><br><br>
    <input class="button" type="submit" name="command" value="registration_user_command">
  </form>

</div>

</body>
</html>
