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

            <h2>Owner Information</h2>

            <table class="table table-striped">

                <tbody>
                <%  Owner owner = (Owner)  request.getAttribute("owner");%>

                <tr>
                    <td>name</td>
                    <td> <%= owner.getLastname() %> <%= owner.getFirstname() %> </td>

                </tr>
                <tr>
                    <td>Address</td>
                    <td><%= owner.getAddress()%></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><%= owner.getCity() %></td>
                </tr>
                <tr>
                    <td>Télephone</td>
                    <td><%= owner.getTelephone() %></td>
                </tr>

                </tbody>
            </table>
            <a href="/owners/<%= owner.getId() %>/update" ><button type="button" class="btn btn-success">Edite Owner</button> </a>
            <a href="/pets/<%= owner.getId() %>/add" ><button type="button" class="btn btn-primary">Add new Pet</button> </a>
            <h2>Pets and Visits </h2>
        <hr>

            <table class="table table-striped">

                <tbody>
                <% if(owner.getPets()!=null){
                    for(Pet pet:owner.getPets()){%>
                <tr>
                    <td>name</td>
                    <td> <%= pet.getName() %> </td>
                    <td> Visit date  Decription </td>
                </tr>
                <tr>
                    <td>date Of Birth</td>
                    <td> <%= pet.getDateOfBirth() %> </td>
                    <td>
                        <a href="/pets/<%= pet.getId() %>/update" ><button type="button" class="btn btn-success">Edit pet</button> </a>
                        <a href="/visits/<%= pet.getId() %>/add" ><button type="button" class="btn btn-danger">add visit</button> </a>

                    </td>
                </tr>
                <tr>
                    <td>Type</td>
                    <td> <%= pet.getPetType() %> </td>
                </tr>
                <hr>
                <%}}%>

                </tbody>
            </table>

        </div>

</body>
</html>
