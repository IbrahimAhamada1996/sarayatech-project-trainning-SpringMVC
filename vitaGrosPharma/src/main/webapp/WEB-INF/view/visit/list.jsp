<%@ page import="java.util.List" %>
<%@ page import="com.saraya.models.Visit" %>
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

    <h2>The visitors</h2>
    <a href="/visits/<%= (Integer) request.getAttribute("idPet") %>/add" ><button type="button" class="btn btn-primary">Add Visit</button> </a>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Date</th>
            <th>description</th>
<%--            <th>Actions</th>--%>
        </tr>
        </thead>
        <tbody>
        <%  List<Pet> pets = (List<Pet>)  request.getAttribute("pets");
            if(pets!=null){
                for (Pet pet:pets
                ) {
                    if (pet.getVisits()!=null){
                        for (Visit visit: pet.getVisits()
                             ) {%>
                    <tr>
                        <td><%= visit.getId()  %></td>
                        <td><%= visit.getDate()  %></td>
                        <td><%= visit.getDescription() %></td>
                        <td>
<%--                            <a href="/visits/<%= visit.getId() %>/delete" ><button type="button" class="btn btn-danger">delete</button> </a>--%>

                           <%-- <a href="/visits/<%= visit.getId() %>/update" ><button type="button" class="btn btn-primary"> update </button></a>
                            <a href="/visits/<%= visit.getId() %>/show" ><button type="button" class="btn btn-success"> show </button></a>
--%>
                        </td>
                    </tr>
        <%
                        }
                    }

                }
            }
        %>

        </tbody>
    </table>

</div>

</body>
</html>
