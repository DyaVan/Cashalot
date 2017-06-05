<<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

        <form>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input id="email" type="text" class="form-control" name="email" placeholder="Email">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <input id="password" type="password" class="form-control" name="password" placeholder="Password">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Контактный имейл</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Название</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Сайт компании</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Контактный телефон</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div>
                <div class="form-group">
                    <label for="name">Частное лицо</label>
                    <input type="checkbox" class="checkbox" id="name">
                </div>
            </div>
            <br>
            <div>
                <div class="form-group">
                    <label for="question">Дополнительная информация</label>
                    <textarea class="form-control" rows="5" id="question"></textarea>
                </div>
            </div>


        </form>

        <button class="btn btn-success">Регистрация</button>
    </div>


</div>
</body>
</html>

