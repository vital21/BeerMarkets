<%--
  Created by IntelliJ IDEA.
  User: vital
  Date: 18.06.2022
  Time: 17:14
  To change this template use File | Settings | File Templates.
  String nameBeer=request.getParameter("nameBeer");
        Beer.ContainerType containerType= Beer.ContainerType.BOTTLE;
        double volumeContainerBeer= Double.parseDouble(request.getParameter("volumeContainerBeer"));
        String typeBeer=request.getParameter("typeBeer");
        double percentageOfAlcoholBeer= Double.parseDouble(request.getParameter("percentageOfAlcoholBeer"));
        int bitternessOfBeer= request.getIntHeader("bitternessOfBeer");
        int quantityOfBeer= request.getIntHeader("quantityOfBeer");
        <label>Name beer</label><br>
    <input>name ="nameBeer"/><br><br>
    <label>Type container</label><br>
    <input>name ="containerType"/><br><br>
    <label>Volume</label><br>
    <input>name ="volumeContainerBeer" min="0,5"/><br><br>
    <label>Type beer</label><br>
    <input>name ="typeBeer"/><br><br>
    <label>Percentage of alcohol</label><br>
    <input>name ="percentageOfAlcoholBeer" min ="0,1" max="20"/><br><br>
    <label>Bitterness</label><br>
    <input>name ="bitternessOfBeer"/><br><br>
    <label>Quantity</label><br>
    <input>name ="quantityOfBeer"/><br><br>
    <input type="submit" value="Save"/>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Insert beer</title>
</head>
<body>
<h1>New beer</h1>
    <form method="post" action="Servlet">
        <label>Name beer</label><br>
        <input type="text" name="nameBeer"><br>
        <label>Type container</label><br>
        <select name="containerType">
            <option>Бутылка</option>
            <option>Банка</option>
            <option>Разлив</option>
        </select><br>
        <label>Volume</label><br>
        <input type="number" step="any" name="volumeContainerBeer"><br>
        <label>Type beer</label><br>
        <select name="typeBeer">
            <option>Эль</option>
            <option>Смешанное</option>
            <option>Лагер</option>
        </select><br>
        <label>Percentage of alcohol</label><br>
        <input type="number" step="any" min="0.1" max="30" name="percentageOfAlcoholBeer"><br>
        <label>Bitterness</label><br>
        <input type="number" name="bitternessOfBeer"><br>
        <label>Quantity</label><br>
        <input type="number" name="quantityOfBeer"><br>
        <input type="submit" name="command" value="insert_beer_in_db">
        <input type="submit" name="command" value="view_products_command">
    </form>
</body>
</html>
