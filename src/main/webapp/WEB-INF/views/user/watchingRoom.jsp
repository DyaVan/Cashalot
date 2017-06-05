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

    <div class="col-md-7 list-group ">
        <br>

        <button class="btn btn-success">Пакет 1</button>
        <button class="btn btn-success">Пакет 2</button>
        <button class="btn btn-primary">Пакет 3</button>
        <button class="btn btn-info">Пакет 4</button>
        <button class="btn btn-info">Пакет 5</button>
        <button class="btn btn-info">Пакет 6</button>
        <button class="btn btn-info">Пакет 7</button>

        <br>
        <h3>Это рекалама номер 2 из пакета</h3>
        <br>

        <p id="topic">Депозиты от Приват Банка</p>

        <p>Выгодные депозиты в крупнейшем банке Украины</p>


            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQsVCt70R2M_2Xq7bDVlcoJFjufnIqJZ0n7dL_cH00mvTIWi36">


        <p>Лучшая ставка по депозитам</p>

        <p>Какая депозитная ставка на гривневые вклады в Приват Банке?</p>

        <div class="radio">
            <label><input type="radio" name="optradio">16,3</label>
        </div>
        <div class="radio">
            <label><input type="radio" name="optradio">5</label>
        </div>
        <div class="radio ">
            <label><input type="radio" name="optradio" >3</label>
        </div>
        <button class="btn btn-success">Ответить</button>

        <ul class="pager">
            <li><a href="#">Предыдущая реклама</a></li>
            <li><a href="#">Следующая реклама</a></li>
        </ul>

        <button class="btn btn-danger" disabled>Оправить пакет на проверку</button>
    </div>

</div>
</body>
</html>
