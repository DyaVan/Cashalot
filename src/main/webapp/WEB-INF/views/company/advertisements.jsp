<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advertisements</title>
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

        <h2>Список рекламных объявлений</h2>
        <div class="list-group">
            <a href="advertisement" class="list-group-item">
                <h4 class="list-group-item-heading">Пшеничное пиво</h4>
                <p class="list-group-item-text">Просмотрено: 68%</p>
                <p class="list-group-item-text">Дата начала: 1.06.2017</p>
                <p class="list-group-item-text">Дата окончания: 25.08.2017</p>
            </a>

            <a href="advertisement" class="list-group-item">
                <h4 class="list-group-item-heading">Пятничные скидки</h4>
                <p class="list-group-item-text">Просмотрено: 70%</p>
                <p class="list-group-item-text">Дата начала: 1.06.2017</p>
                <p class="list-group-item-text">Дата окончания: 25.08.2017</p>
            </a>

            <a href="advertisement" class="list-group-item">
                <h4 class="list-group-item-heading">Праздник 23 Июня!</h4>
                <p class="list-group-item-text">Просмотрено: 59%</p>
                <p class="list-group-item-text">Дата начала: 1.06.2017</p>
                <p class="list-group-item-text">Дата окончания: 25.08.2017</p>
            </a>
        </div>


    </div>

</div>

</body>
</html>

</body>
</html>
