

<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 13.06.2022
  Time: 21:30
  To change this template use File | Settings | File Templates.
  private String nameBeer;
    public enum ContainerType{
       BOTTLE,CAN,DRAFT;
    }
    private ContainerType containerType;
    private double volumeContainerBeer;
    private String typeBeer;
    private double percentageOfAlcoholBeer;
    private int bitternessOfBeer;
    private int  quantityOfBeer;
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>product</title>
</head>
<body>
<h1>Product List</h1>
<table>
<tr><th>Name</th><th>container type</th><th>volumeContainerBeer</th><th>typeBeer</th><th>percentageOfAlcoholBeer</th><th>bitternessOfBeer</th><th>quantityOfBeer</th><th></th></tr>
<c:forEach var="product" items="${products}">
    <tr><td>${product.nameBeer}</td>
        <td>${product.containerType}</td>
        <td>${product.volumeContainerBeer}</td>
        <td>${product.typeBeer}</td>
        <td>${product.percentageOfAlcoholBeer}</td>
        <td>${product.bitternessOfBeer}</td>
        <td>${product.quantityOfBeer}</td>
        <td>
            <form method="get" action="Servlet">
                <input  type="submit" name="command" value="view_products_command">
                <input  type="submit" name="command" value="registration_command">
            </form>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
