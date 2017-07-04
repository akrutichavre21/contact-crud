

<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container">

        <div class="container">
            <br>
            <br>
            <div class="row">
               <div class="col-md-4 col-md-offset-4 panel panel-default">
                   <h2 align="center">Login Form</h2>
                   <br>
                   <br>
                   <g:if test="${flash.passwordIncorrect}">
                       <div class=" alert alert-danger">${flash.passwordIncorrect}</div>
                   </g:if>
                   <g:if test="${flash.notLogin}">
                       <div class=" alert alert-danger">${flash.notLogin}</div>
                   </g:if>
                   <g:if test="${flash.usernameIncorrect}">
                       <div class=" alert alert-danger">${flash.usernameIncorrect}</div>
                   </g:if>
                   <form action="/mylogin/login">
                       <label><b>Username</b></label>
                       <input type="text" name="username" class="form-control" required>
                       <br>
                       <label><b>Password</b></label>
                       <input type="password" name="password" class="form-control" required>
                       <br>
                       <br>
                       <input type="submit" class="btn btn-primary btn-block"/>
                   </form>
                   <br>
               </div>
            </div>
        </div>
    </div>
</body>
</html>