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

<%  Pet pet = (Pet)  request.getAttribute("pet");%>
<div class="container">

    <h2>Add Visit</h2>

    <div class="row">
        <div class="col">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <div class="title"><h1 class=" text-center">Add Visit</h1></div>
                </div>
                <div class="card-body">
                    <form  method="post">

                        <div class="form-group">
                            <label for="name">date:</label>
                            <input type="date" class="form-control" placeholder="Enter date" id="name" name="date">
                        </div>
                        <div class="form-group">
                            <label for="description">description:</label>
                            <textarea type="text" class="form-control" placeholder="description" id="description"  name="description" ></textarea>

                        </div>

                        <button type="submit" class="btn btn-primary">Add</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
