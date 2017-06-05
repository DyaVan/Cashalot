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


        <table class="table  ">
            <thead>
            <tr>
                <th>Модераторы:</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>maxim@gmail.com</td>
                <td><button class="btn btn-danger">Удалить</button></td>
            </tr>
            <tr>
                <td>oleg.vasykov@mail.ru</td>
                <td><button class="btn btn-danger">Удалить</button></td>
            </tr>

            </tbody>
        </table>


        <a href="newModerator" class="btn btn-default">Добавить нового модератора</a>

    </div>

</div>

</body>
</html>

</body>
</html>
