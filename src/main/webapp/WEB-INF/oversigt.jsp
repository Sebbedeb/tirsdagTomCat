<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 07/03/2023
  Time: 15.48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin siden</title>
</head>
<body>

<h1> velkommen til adminstrator siden</h1>

<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>




<table>
    <tr>
        <th>Navn</th>
        <th>Valg</th>
    </tr>



    <c:forEach var="person" items="${applicationScope.kunder}">
        <tr>
            <td> ${person.value.navn}</td>
            <td>
                <form action="ServletSlet">
                    <input type="text" hidden name="valg" value="${person.value.navn}">
                    <input type="submit" value="Slet">
                </form>
                <form action="ServletEdit">
                    <input type="text" hidden name="Valg" value="${person.value.navn}">
                    <input type="submit" value="Edit">
                </form>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
