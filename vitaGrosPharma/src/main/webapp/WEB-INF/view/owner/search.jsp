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

    <h2>Find Owners</h2>
    <form class="form-inline my-2 my-lg-0" method="get" action="/owners/search2">
        <input class="form-control mr-sm-2" name="lastname" type="search" placeholder="Search by lastname" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
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
        <%  List<Owner> owners = (List<Owner>)  request.getAttribute("ownersSearch");
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
            </td>
        </tr>
        <%
                }
            }
        %>

        </tbody>
    </table>

    <a href="/owners/add"> <button class="btn btn-success my-2 my-sm-0" type="submit">Add Owner</button></a>
</div>

</body>
</html>
