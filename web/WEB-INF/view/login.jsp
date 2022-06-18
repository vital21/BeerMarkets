<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 13.06.2022
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <meta charset="utf-8" />
</head>
<body>
        <div class="form">
            <h1>Вход</h1><br>
            <form method="get" action="Servlet">
                <input type="text"  placeholder="login" name="login"><br>
                <input type="password"  placeholder="password" name="password"><br><br>
                <input  type="submit" name="command" value="insert_page">
                <input  type="submit" name="command" value="registration_command">
            </form>
        </div>
</body>
</html>
