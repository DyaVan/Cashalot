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
        <c:import url="moderatorSideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7 list-group ">


        <h2>Список заказов</h2>
        <div class="list-group">
            <a href="affirmation" class="list-group-item">
                <h4 class="list-group-item-heading">Темное крафтовое пиво!</h4>
                <p class="list-group-item-text">Дата заказа: 5.07.2017</p>
            </a>
            <a href="affirmation" class="list-group-item">
                <h4 class="list-group-item-heading">Депозиты от Приват Банка!</h4>
                <p class="list-group-item-text">Дата заказа: 3.07.2017</p>
            </a>
        </div>



    </div>

</div>

</body>
</html>

</body>
</html>
