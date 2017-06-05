<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заказы компании</title>
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

    <div class="col-md-7 list-group ">

        <h2>Список теущих заказов</h2>
        <div class="list-group">

            <a href="#" class="list-group-item list-group-item-success">
                <h4 class="list-group-item-heading">Пшеничное пиво</h4>
                <p class="list-group-item-text">Статус: подтверждено</p>
            </a>

            <a href="#" class="list-group-item list-group-item-warning">
                <h4 class="list-group-item-heading">Темное крафтовое пиво!</h4>
                <p class="list-group-item-text">Статус: в обработке</p>
            </a>

            <a href="#" class="list-group-item list-group-item-danger">
                <h4 class="list-group-item-heading">БУХАТЬ БУХАТЬ!</h4>
                <p class="list-group-item-text">Статус: Отклонено</p>
                <p class="list-group-item-text">Причина: Неприемлемое наполнение</p>
            </a>

            <a href="#" class="list-group-item list-group-item-success">
                <h4 class="list-group-item-heading">Пятничные скидки</h4>
                <p class="list-group-item-text">Статус: подтверждено</p>
            </a>

            <a href="#" class="list-group-item list-group-item-success">
                <h4 class="list-group-item-heading">Праздник 23 Июня!</h4>
                <p class="list-group-item-text">Статус: подтверждено</p>
            </a>
        </div>
    </div>


</div>

</body>
</html>

</body>
</html>
