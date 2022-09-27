<%@ page import="java.util.List" %>
<%@ page import="com.saraya.models.Owner" %>
<%@ page import="com.saraya.models.Pet" %><%--
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

    <h2>Owners</h2>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Adress</th>
            <th>City</th>
            <th>Telephone</th>
            <th>Pets</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%  List<Owner> owners = (List<Owner>)  request.getAttribute("owners");
            if(owners!=null){
                for (Owner owner:owners
                ) {%>
        <tr>
            <td><%= owner.getId()  %></td>
            <td><%= owner.getFirstname() %></td>
            <td><%= owner.getLastname() %></td>
            <td><%= owner.getAddress()%></td>
            <td><%= owner.getCity() %></td>
            <td><%= owner.getTelephone() %></td>
            <td>  <% if(owner.getPets()!=null){ for (Pet pet:owner.getPets()
                ) {%>
                <%= pet.getName() %>
                <% }}%>
            </td>
            <td>
                <a href="/owners/<%= owner.getId() %>/delete" ><button type="button" class="btn btn-danger">delete</button> </a>

                <a href="/owners/<%= owner.getId() %>/update" ><button type="button" class="btn btn-primary"> update </button></a>
                <a href="/owners/<%= owner.getId() %>/show" ><button type="button" class="btn btn-success"> show </button></a>

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
