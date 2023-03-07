<%--
  Created by IntelliJ IDEA.
  User: Sebastian Egeberg
  Date: 07-03-2023
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Du er nu bag muren</h1>

<h2>Velkommen ${requestScope.navn}</h2>

<p>dit sessionID er ${requestScope.id}</p>
<p>dit navn er ${sessionScope.navn} og din kode er ${sessionScope.kode}</p>

<br>
<br>
<br>

<form action= "ServletLogOut">

    <input type = "submit" value="log af">

</form>

<form action= "ServletDeleteUser">

    <input type = "submit" value="slet bruger">

</form>

<form action= "ServletChangePassword">

    <label for="nyKode">ny kode:</label><br>
    <input type="text" id="nyKode" name="nyKode" value="ny kode hér"><br>
    <input type = "submit" value="Ændr kodeord">

</form>

</body>
</html>
