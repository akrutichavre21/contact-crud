<%--
  Created by IntelliJ IDEA.
  User: akruti
  Date: 29/6/17
  Time: 7:05 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="myLayout"/>
    <title></title>
</head>

<body>
<br>
<br>
<div class="col-md-4">
    <form action="/test/save" method="post" >
        <label>Enter First Name :</label>
        <input type="text" name="fname" class="form-control"/>
        <br>
        <br>
        <label>Enter Last Name :</label>
        <input type="text" name="lname" class="form-control"/>
        <br>
        <br>
        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>
</body>
</html>