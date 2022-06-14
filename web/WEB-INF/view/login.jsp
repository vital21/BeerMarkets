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
</head>
<body>
        <div class="form">
            <h1>Вход</h1><br>
            <form method="get" action="Servlet">
                <input type="text" required placeholder="login" name="login"><br>
                <input type="password" required placeholder="password" name="password"><br><br>
                <input  type="submit" value="войти">
                <input  type="submit" value="регестрация">
            </form>
        </div>
</body>
</html>
