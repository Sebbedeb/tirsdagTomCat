<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 06/03/2023
  Time: 22.24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

dit sessionid er ${requestScope.id}

dit navn er ${sessionScope.navn} og din kode er ${sessionScope.kode}

<h1> du er nu bag muren </h1>

<h1> velkommen  ${requestScope.navn}</h1>

<br>
<br>
<br>

<form action="ServletLogOut">

    <input type="submit" value="log af">
</form>



${requestScope.msg}

<form action="ServletOversigt" method="get">

    <input type="submit" value="Gå til admin side">
</form>

<form action="ServletHuskeliste" method="get">

    <label for="ting">tilføj til huskeliste:</label><br>
    <input type="text" id="ting" name="ting" value="Fed ryger"><br>
    <input type="submit" value="Tilføj til huskeliste">
</form>

<form action="ServletHuskeliste" method="post">
    <input type="submit" value="Se huskeliste">
</form>



</body>
</html>