<%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 12/05/2022
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Département list</title>
</head>
<body>
        <table>
            <thead>
                <th >#ID</th>
                <th>nom</th>

            </thead>
            <tbody>
            <tr th:each="departement : ${departements}">
                <td th:text="${departement.id}"></td>
                <td th:text="${departement.name}"></td

                <td > <a href="${departement.id}/delete"></a></td>
            </tr>
            </tbody>
        </table>
</body>
</html>
