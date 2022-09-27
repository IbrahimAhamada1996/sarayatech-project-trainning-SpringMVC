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
  <title>Title</title>
  <link rel="stylesheet" href="./../../bootstrap-4.0.0-dist/css/bootstrap.css">
  <script src="bootstrap-4.0.0-dist/js/bootstrap.bundle.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <div class="text-center w-50">
    <form class="form-control" style="margin: 200px" method="post" action="/add">
      <h1 class="h3 mb-3 font-weight-normal">Inscription</h1>
      <div class="form-group">
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
      </div>
      <div class="form-group">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required="">
      </div>


      <button class="btn btn-lg btn-primary btn-block col-8 text-center ml-lg-5" type="submit">Sign in</button>
      <a href="/">connexion</a>
      <p class="mt-5 mb-3 text-muted">© 2021-2022</p>
    </form>
  </div>

</div>

</body>
</html>
