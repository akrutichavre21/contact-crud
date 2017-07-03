<!doctype html>
<html lang="en" class="no-js">
<head>
%{--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>--}%
    <title>
        CRUD In Database
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
%{--    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>--}%
<!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <ul class="navbar-right nav navbar-nav">
            <li><g:link controller="testgroup" action="show"><b>View Group</b></g:link></li>
            <li><g:link controller="testgroup" action="index"><b>Create Group</b></g:link></li>
            <li><g:link controller="test" action="show"><b>View Contacts</b></g:link></li>
            <li><g:link controller="test" action="index"><b>Create Contact</b></g:link></li>
        </ul>
    <div class="navbar-header">
        <a class="navbar-brand" href="#">My Contacts</a>
    </div>
    <ul class="nav navbar-nav">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
                <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                <li> hi </li>
                <li><a href="/test/show">View Group</a></li>
                <li><a href="/test/index">Create Group</a></li>
                <li><a href="#">Page 1-3</a></li>
            </ul>
        </li>
    </ul>
    </div>
</nav>
<div class="container">
    <g:layoutBody/>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files
        as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
