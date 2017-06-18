<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Quiz</title>
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
        <a href="newOrder" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            К созданию заказа
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Новый вопрос</h2>

        <sf:form modelAttribute="quiz" method="post" htmlEscape="true" action="createQuiz">

            <div>
                <div class="form-group">
                    <label for="question">Вопрос:</label>
                    <sf:textarea class="form-control" rows="5" id="question" path="questionText"/>
                </div>
                <sf:errors path="questionText"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="answer">Правильный ответ:</label>
                    <sf:input type="text" class="form-control" id="answer" path="answer"/>
                </div>
                <sf:errors path="answer"/>
            </div>

            <div>


                <p>Вариантов ответа может быть от 2 до 6.</p>

                    <%----------------------------------------------------------------------------------------------%>
                <div class="form-group">
                    <label for="answer">Вариант ответа:</label>
                    <sf:input type="text" class="form-control" id="answer" path="answerOptions"/>
                </div>
                <sf:errors path="answerOptions"/>

                <div class="form-group">
                    <label for="answer">Вариант ответа:</label>
                    <sf:input type="text" class="form-control" id="answer2" path="answerOptions"/>
                </div>
                <sf:errors path="answerOptions"/>

                <div class="form-group">
                    <label for="answer">Вариант ответа:</label>
                    <sf:input type="text" class="form-control" id="answer3" path="answerOptions"/>
                </div>
                <sf:errors path="answerOptions"/>

                    <%----------------------------------------------------------------------------------------------%>

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
                        <td>
                            <button class="btn btn-danger">Удалить</button>
                        </td>
                    </tr>
                    <tr>
                        <td>Нет!</td>
                        <td>
                            <button class="btn btn-danger">Удалить</button>
                        </td>
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

            <input type="submit" class="btn btn-success" value="Добавить вопрос"/>

        </sf:form>
    </div>


</div>
</body>
</html>
