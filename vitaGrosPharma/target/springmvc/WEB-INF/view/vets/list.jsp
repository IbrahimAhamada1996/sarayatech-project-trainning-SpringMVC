<%@ page import="java.util.List" %>
<%@ page import="com.saraya.models.Owner" %>
<%@ page import="com.saraya.models.Pet" %>
<%@ page import="com.saraya.models.Vet" %>
<%@ page import="com.saraya.models.Specialty" %><%--
<%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 01/05/2022
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list of owners</title>
    <link rel="stylesheet" href="./../../bootstrap-4.0.0-dist/css/bootstrap.css">
    <script src="bootstrap-4.0.0-dist/js/bootstrap.bundle.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<body>
<%@include file="./../header.jsp" %>
<div class="container">

    <h2>Veterinarians</h2>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Specialies</th>
        </tr>
        </thead>
        <tbody>
        <%  List<Vet> vets = (List<Vet>)  request.getAttribute("vets");
            if(vets!=null){
                for (Vet vet:vets
                ) {%>
        <tr>
            <td><%= vet.getId()  %></td>
            <td><%= vet.getFirstname()  %> <%= vet.getLastname()  %></td>

            <td>  <% if(vet.getSpecialties()!=null){ for (Specialty special:vet.getSpecialties()
            ) {%>
               <span><%= special.getName() %>  </span>
                <% }}%>
            </td>

        </tr>
        <%
                }
            }
        %>

        </tbody>
    </table>


</div>

</body>
</html>
