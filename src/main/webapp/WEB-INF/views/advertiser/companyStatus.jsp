<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Кабинет</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/bootstrap.min.js"></script>
    <script src="../../../js/jquery-3.1.1.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <c:import url="companySideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Пивная Дума</h2>

        <div class="panel panel-info">
            <div class="panel-heading">Продукты:</div>
            <div class="panel-body">5</div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Рекламные обьявления:</div>
            <div class="panel-body">3</div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Теекущие заказы в обработке:</div>
            <div class="panel-body">1</div>
        </div>


    </div>

</div>
</body>
</html>
