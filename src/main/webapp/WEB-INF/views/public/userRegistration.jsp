<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Registration</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/bootstrap.min.js"></script>
    <script src="../../../js/jquery-3.1.1.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <br>
        <br>
        <br>

        <a href="home" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            На домашнюю страницу
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">

        <sf:form modelAttribute="user" htmlEscape="true"
                 action="register" method="post">
            <br>
            <div class="input-group">
                <span class="input-group-addon">Name</span>
                <sf:input  type="text" class="form-control"  path="name" placeholder="Full Name"/>
            </div>
            <sf:errors path="name" />

            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <sf:input id="email" type="text" class="form-control" path="email" placeholder="Email"/>
            </div>
            <sf:errors path="name" />

            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <sf:input id="password" type="password" class="form-control" path="password" placeholder="Password"/>
            </div>
            <sf:errors path="password" />

            <br>
            <div class="input-group">
                <span class="input-group-addon">Sex</span>
                <sf:select path="sex" placeholder="Sex" class="form-control" id="sex-selext">
                    <option value="1">Male</option>
                    <option value="0">Female</option>
                </sf:select>
            </div>
            <sf:errors path="sex" />

            <br>
            <div class="input-group">
                <span class="input-group-addon">Age</span>
                <sf:input  type="number" min="0" max="120" class="form-control" path="age" placeholder="Age"/>
            </div>
            <sf:errors path="age" />

            <br>

            <input type="submit" class="btn btn-success" value="Регистрация"/>
        </sf:form>

    </div>


</div>
</body>
</html>

