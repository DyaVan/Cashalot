<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Вопрос</title>
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
        <a href="quizzes" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            К списку вопросов
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Вопрос</h2>

        <div class="panel panel-info">
            <div class="panel-heading">Текст вопроса:</div>
            <div class="panel-body">
                <div class="col-md-10">Какое на вкус пшеничное пиво?</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Правильный ответ:</div>
            <div class="panel-body">
                <div class="col-md-10">Мягкое</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div>
            <p>Вариантов ответа может быть от 2 до 6.</p>

            <table class="table  ">
                <thead>
                <tr>
                    <th>Варианты ответа:</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Да!</td>
                    <td><button class="btn btn-danger">Удалить</button></td>
                </tr>
                <tr>
                    <td>Нет!</td>
                    <td><button class="btn btn-danger">Удалить</button></td>
                </tr>

                </tbody>
            </table>


            <div class="form-group">
                <label for="answer-option">Вариант ответа:</label>
                <input type="text" class="form-control" id="answer-option">
                <br>
                <button class="btn btn-info">Добавить вариант ответа</button>
            </div>
        </div>

        <button class="btn btn-success">Сохранить изменения</button>
    </div>


</div>
</body>
</html>
