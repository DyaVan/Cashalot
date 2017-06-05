<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bonuses</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/jquery-3.1.1.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <c:import url="sideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7  ">

        <h3>Сохраненная реклама</h3>

        <ul class="list-group">
            <li class="list-group-item"  data-toggle="collapse" data-target="#demo">
                <div>
                    <h4>Депозиты от Приват Банка</h4>
                    <div id="demo" class="collapse">
                        <p>Выгодные депозиты в крупнейшем банке Украины</p>

                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQsVCt70R2M_2Xq7bDVlcoJFjufnIqJZ0n7dL_cH00mvTIWi36">

                        <p>Лучшая ставка по депозитам</p>
                    </div>
                </div>
            </li>
            <li class="list-group-item"  data-toggle="collapse" data-target="#demo2">
                <div>
                    <h4>Пшеничное пиво</h4>
                    <div id="demo2" class="collapse">
                        <p>Лушчшее пшеничное пиво</p>

                        <img src="imgs/Без названия.jpg">

                        <p>Приходите в Пивную Думу!</p>
                    </div>
                </div>
            </li>

        </ul>


    </div>

</div>
</body>
</html>
</img>