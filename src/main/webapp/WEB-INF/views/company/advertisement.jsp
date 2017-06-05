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
        <a href="advertisements.jsp" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            К списку рекламы
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Пшеничное пиво</h2>

        Просмотрено:
        <div>
            <p>68%</p>
        </div>
        Дата начала:
        <div>
            <p>1.06.2017</p>
        </div>
        Дата окончания:
        <div>
            <p>25.08.2017</p>
            <button class="btn ">Изменить</button>
        </div>
        Ограничение по полу:
        <div>
            <p>Нету</p>
            <button class="btn ">Изменить</button>
        </div>
        Ограничение по возрасту:
        <div>
            <p>От 18 до 99</p>
            <button class="btn ">Изменить</button>
        </div>
        Оплачено показов:
        <div>
            <p>20000</p>
        </div>
        Уже посмотрели:
        <div>
            <p>3521</p>
        </div>
        Просканировано на емоцию:
        <div>
            <p>2620</p>
        </div>

        Радость:
        <div>
            <p>521</p>
        </div>
        Удивление:
        <div>
            <p>5</p>
        </div>
        Грусть:
        <div>
            <p>0</p>
        </div>
        Отвращение:
        <div>
            <p>0</p>
        </div>
        Злость:
        <div>
            <p>4</p>
        </div>
        Нейтральная:
        <div>
            <p>2900</p>
        </div>

        <div style=" background-color: lightblue">
            <p>Вопрос:</p>
            <p>Какое на вкус пшеничное пиво?</p>
            <table class="table ">
                <thead>
                <tr>
                    <th>Варианты ответа:</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Кислое</td>
                </tr>
                <tr>
                    <td>Горькое</td>
                </tr>
                <tr>
                    <td>Мягкое</td>
                </tr>

                </tbody>
            </table>
            <p>Правильный ответ:</p>
            <p>Мягкое</p>
            <button class="btn ">Изменить вопрос</button>

        </div>
        <br>
        Продукт:
        <div>
            <p>Пшеничное пиво</p>
            <button class="btn ">Изменить</button>
        </div>

        <br>
        <div>
            <p>Медиа:</p>
            <div>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQc3nOX9OFMpYjmi68pqfln1OSgCMAU0xbTJBdMaPISCZHnTgeJGA">
            </div>
            <button class="btn ">Изменить медиа</button>
        </div>
        <br>
        Текст перед медиа:
        <div>
            <p>Самое лучшее пшеничное пиво!</p>
            <button class="btn ">Изменить</button>
        </div>
        <br>
        Текст после медиа:
        <div>
            <p>Приходите в Пивную Думу!</p>
            <button class="btn ">Изменить</button>
        </div>

        <br>
        <button class="btn btn-warning">Приостановить показ</button>
        <button class="btn btn-success">Оплатить дополнительные показы</button>


    </div>


</div>
</body>
</html>
