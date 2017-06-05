<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bonuses</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/bootstrap.min.js"></script>
    <script src="../../../js/jquery-3.1.1.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <c:import url="sideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">

        <div class="panel panel-info">
            <div class="panel-heading">Множитель бонусов</div>
            <div class="panel-body">х2</div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Денежные бонусы:</div>
            <div class="panel-body">63.25 грн</div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Количество рефералов</div>
            <div class="panel-body">1</div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Бонусов от рефералов за эту неделю:</div>
            <div class="panel-body">2.50 грн</div>
        </div>


        <div class="panel panel-info">
            <div class="panel-heading">Бонусов от рефералов за весь период:</div>
            <div class="panel-body">24 грн</div>
        </div>

        <p>На <mark>множитель бонусов</mark> влияет процент заполнения профиля и ваша активность. Детали на странице правил.</p>
        <button class="btn btn-primary">Дозаполнить профиль</button>
        <button class="btn btn-warning">Пригласить друга</button>
        <button class="btn btn-success">Вывести деньги</button>


    </div>

</div>
</body>
</html>
