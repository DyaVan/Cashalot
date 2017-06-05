<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/jquery-3.1.1.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <c:import url="moderatorSideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7 list-group ">

        <h2>Темное крафтовое пиво!</h2>

        Дата начала:
        <div>
            <p>5.07.2017</p>
        </div>
        Дата окончания:
        <div>
            <p>25.08.2017</p>
        </div>
        Ограничение по полу:
        <div>
            <p>Нету</p>
        </div>
        Ограничение по возрасту:
        <div>
            <p>От 18 до 99</p>

        </div>
        Оплачено показов:
        <div>
            <p>20000</p>
        </div>


        <div style=" background-color: lightblue">
            <p>Вопрос:</p>
            <p>Какое на вкус темное пиво?</p>
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
            <p>Горькое</p>

        </div>
        <br>
        Продукт:
        <div>
            <p>Пшеничное пиво</p>
        </div>

        Ссылка в интернете:
        <div>
            <p>pivnaduma.kiev.ua</p>
        </div>

        Описание:
        <div>
            <p>Самое популярное пиво! Выбор киевлян номер 1!</p>
        </div>

        Категория:
        <div>
            <p>Развлечения</p>
        </div>

        <br>
        <div>
            <p>Медиа:</p>
            <div>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQc3nOX9OFMpYjmi68pqfln1OSgCMAU0xbTJBdMaPISCZHnTgeJGA">
            </div>
        </div>
        <br>
        Текст перед медиа:
        <div>
            <p>Самое лучшее пшеничное пиво!</p>
        </div>
        <br>
        Текст после медиа:
        <div>
            <p>Приходите в Пивную Думу!</p>
        </div>

        <br>

        <button class="btn btn-success">Утвердить заказ</button>
        <button class="btn btn-danger" data-toggle="collapse" data-target="#demo2" >Отклонить</button>

        <div id="demo2" class="collapse" >
            <div class="form-group">
                <label for="question">Причина отказа:</label>
                <textarea class="form-control" rows="5" id="question"></textarea>
                <button class="btn btn-danger">Отклонить</button>
            </div>
        </div>

    </div>

</div>

</body>
</html>

</body>
</html>
