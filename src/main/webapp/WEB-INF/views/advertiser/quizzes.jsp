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


        <h2>Список задаваемых после рекламы вопросов:</h2>
        <div class="list-group">
            <a href="quiz" class="list-group-item">
                <h4 class="list-group-item-heading">Какое на вкус пшеничное пиво?</h4>
            </a>

            <a href="quiz" class="list-group-item">
                <h4 class="list-group-item-heading">Какое новое пиво появилось в Пивной Думе?</h4>
            </a>

            <a href="quiz" class="list-group-item">
                <h4 class="list-group-item-heading">Когда пьянка?</h4>
            </a>

            <a href="quiz" class="list-group-item">
                <h4 class="list-group-item-heading">В честь чего устроен праздник в Пивной думе?</h4>
            </a>

            <a href="quiz" class="list-group-item">
                <h4 class="list-group-item-heading">Что привлекает в Думу людей по пятницам?</h4>
            </a>
        </div>


    </div>

</div>

</body>
</html>

</body>
</html>
