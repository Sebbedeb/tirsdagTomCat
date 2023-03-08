<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<br/>
<a href="hello-servlet">bag muren via min servlet</a>
<br>
<br>
<a href="WEB-INF/hemmelig.jsp">bag muren</a>
<br>
<br>
<a href="friside.jsp">fri</a>

<br>
<br>
<br>

${requestScope.besked}
<br>
<br>
<form action="hello-servlet" method="get">
    <label for="navn">angiv navn:</label><br>
    <input type="text" id="navn" name="navn" value="John"><br>
<label for="kode">skriv kode:</label><br>
<input type="text" id="kode" name="kode" value="Doe"><br><br>
    <input type="submit" value="Log ind">
</form>

<form action="hello-servlet" method="post">
    <label for="nyNavn">angiv navn:</label><br>
    <input type="text" id="nyNavn" name="nyNavn" value="John"><br>
    <label for="nyKode">skriv kode:</label><br>
    <input type="text" id="nyKode" name="nyKode" value="Doe"><br><br>
    <input type="submit" value="Ny Bruger">
</form>

</body>
</html>