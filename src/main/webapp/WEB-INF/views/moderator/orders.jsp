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
        <c:forEach items="${orders}" var="order">
            <div class="list-group">
                <a href="/cashalot/moderator/orders/${order.id}" class="list-group-item">
                    <h4 class="list-group-item-heading">${order.content.topic}</h4>
                    <p class="list-group-item-text">Дата заказа: ${order.orderDate}</p>
                </a>
            </div>
        </c:forEach>


    </div>

</div>

</body>
</html>

</body>
</html>
