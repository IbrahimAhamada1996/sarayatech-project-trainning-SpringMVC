<%@ page import="com.saraya.models.Owner" %>
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
<div class="container">

    <h2>Add Owner</h2>

    <div class="row">
        <div class="col">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <div class="title"><h1 class=" text-center">Add Owner</h1></div>
                </div>
                <div class="card-body">
                    <form action="/owners/add" method="post">

                        <div class="form-group">
                            <label for="username">firstname:</label>
                            <input type="text" class="form-control" placeholder="Enter firstname" id="username" name="firstname">
                        </div>
                        <div class="form-group">
                            <label for="lastname">lastname:</label>
                            <input type="text" class="form-control" placeholder="Enter lastname" id="lastname"  name="lastname">
                        </div>
                        <div class="form-group">
                            <label for="address">address:</label>
                            <input type="text" class="form-control" placeholder="Enter dateOfBirth" id="address"  name="address">
                        </div>
                        <div class="form-group">
                            <label for="city">city:</label>
                            <input type="text" class="form-control" placeholder="Enter registrationDate" id="city"  name="city">
                        </div>
                        <div class="form-group">
                            <label for="telephone">telephone:</label>
                            <input type="text" class="form-control" placeholder="Enter registrationDate" id="telephone"  name="telephone">
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
