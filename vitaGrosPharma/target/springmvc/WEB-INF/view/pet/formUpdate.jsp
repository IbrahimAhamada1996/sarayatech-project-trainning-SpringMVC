<%@ page import="com.saraya.models.Owner" %>
<%@ page import="com.saraya.models.PetType" %>
<%@ page import="java.util.List" %>
<%@ page import="com.saraya.models.Pet" %>
<%--
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
<body><%@include file="./../header.jsp" %>

<% PetType[] petTypes = (PetType[])  request.getAttribute("petTypes"); Pet pet = (Pet)  request.getAttribute("pet");%>
<div class="container">

    <h2>Update Owner</h2>

    <div class="row">
        <div class="col">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <div class="title"><h1 class=" text-center">Update Pet</h1></div>
                </div>
                <div class="card-body">
                    <form action="/pets/<%= pet.getId() %>/update" method="post">

                        <div class="form-group">
                            <label for="name">Name:</label>
                            <input type="text" class="form-control" value="<%= pet.getName() %>" placeholder="Enter name" id="name" name="name">
                        </div>
                        <div class="form-group">
                            <label for="dateOfBirth">Date Of Birth:</label>
                            <input type="date" class="form-control" value="<%= pet.getDateOfBirth() %>" placeholder="Enter date Of Birth" id="dateOfBirth"  name="dateOfBirth">
                        </div>
                        <div class="form-group">
                            <label for="petType">PetType:</label>
                            <select class="form-control" id="petType" name="petType">
                                <%   if(petTypes!=null){
                                    for (PetType petType:petTypes
                                    ) {%>
                                <option value="<%= petType.name()  %>"><%= petType.name() %></option>
                                <% }}%>
                            </select>

                        </div>


                        <button type="submit" class="btn btn-primary">Update</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
