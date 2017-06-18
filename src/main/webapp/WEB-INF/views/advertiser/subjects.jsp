<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
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



        <h2>Список рекламируемых продуктов/услуг</h2>
        <div class="list-group">
            <a href="subject" class="list-group-item">
                <h4 class="list-group-item-heading">Пшеничное пиво</h4>
                <p class="list-group-item-text">Самое популярное пиво! Лучшее в Киеве...</p>
            </a>

            <a href="subject" class="list-group-item">
                <h4 class="list-group-item-heading">Пятничные скидки</h4>
                <p class="list-group-item-text">Каждую пятницу в заведении действуют скидки</p>
            </a>

            <a href="subject" class="list-group-item">
                <h4 class="list-group-item-heading">Праздник 23 Июня!</h4>
                <p class="list-group-item-text">В честь дня рождения Пивной думы в заведении будет
                проведено шоу и ряд мастеркласов</p>
            </a>

            <a href="subject" class="list-group-item">
                <h4 class="list-group-item-heading">Темное крафтовое пиво</h4>
                <p class="list-group-item-text">В пивоварне появилось новое темное пиво.</p>
            </a>

            <a href="subject" class="list-group-item">
                <h4 class="list-group-item-heading">Бухло</h4>
                <p class="list-group-item-text">ПОдвезли новое бухло!</p>
            </a>
        </div>


    </div>

</div>

</body>
</html>

</body>
</html>
