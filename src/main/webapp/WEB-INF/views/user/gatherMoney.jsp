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

    <h2>Бонусы</h2>
    <p>Бонусы полученые за просмотри пакетов рекламы</p>
    <div class="table-responsive col-md-8   ">
        <table class="table table-bordered">
            <thead>
            <tr class="success">
                <th>#</th>
                <th>Деньги</th>
                <th>Кол-во вопросов</th>
                <th>Кол-во правильных ответов</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>5 грн</td>
                <td>8</td>
                <td>7</td>
                <td><button class="btn btn-success">Собрать деньги</button></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
