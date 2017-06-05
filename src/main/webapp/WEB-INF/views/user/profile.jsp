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
            <div class="panel-heading">Пол:</div>
            <div class="panel-body">
                <div class="col-md-10">Мужской</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Возраст:</div>
            <div class="panel-body">
                <div class="col-md-10">24</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Город:</div>
            <div class="panel-body">
                <div class="col-md-10">Киев</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Интересы:</div>
            <div class="panel-body">
                <div class="col-md-10">Спорт, Наука</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Интересные компании:</div>
            <div class="panel-body">
                <div class="col-md-10">Приват банк, Спортлайф</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>


    </div>

</div>

</body>
</html>
