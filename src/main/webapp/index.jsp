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
<a href="hello-servlet">Bag muren via Servlet</a>
<br>
<a href="WEB-INF/Hemmelig.jsp">bag muren</a>
<br>
<a href="FriSiden.jsp">fri</a>
<br>
<br>
<br>

${requestScope.besked}

<form action="hello-servlet">
    <label for="navn">navn:</label><br>
    <input type="text" id="navn" name="navn" value="John"><br>
    <label for="kode">skriv kode:</label><br>
    <input type="text" id="kode" name="kode" value="Doe"><br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>