<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New subject</title>
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
        <a href="newOrder" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            К созданию заказа
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Новый продукт</h2>

        <div>
            <div class="form-group">
                <label for="name">Название:</label>
                <input type="text" class="form-control" id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="link">Ссылка в интернете:</label>
                <input type="text" class="form-control" id="link">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="productInfo">Описание:</label>
                <textarea class="form-control" rows="7" id="productInfo"></textarea>
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="sel3"> Выберите категорию:</label>
                <select class="form-control" id="sel3">
                    <option>Спорт</option>
                    <option>Наука</option>
                    <option>Финансы</option>
                </select>
            </div>
        </div>

        <button class="btn btn-success">Добавить продукт</button>
    </div>


</div>
</body>
</html>
