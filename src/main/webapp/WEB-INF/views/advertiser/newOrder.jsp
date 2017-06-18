<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Order</title>
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

    <div class="col-md-7">
        <h2>Новый заказ</h2>


        <div class="form-group">
            <label for="selSubj"> Виберите продукт:</label>
            <select class="form-control" id="selSubj">
                <c:forEach items="${advertiser.subjects}" var="subject">
                    <option value="${subject.id}"><c:out value="${subject.name}" escapeXml="true"/></option>
                </c:forEach>
            </select>
            <br>
            <a href="createSubject" class="btn btn-primary">Новый продукт</a>
            <br>
        </div>

        <div>
            <div class="form-group">
                <label for="selContents">Выберите контент:</label>
                <select class="form-control" id="selContents">
                    <c:forEach items="${advertiser.adContents}" var="adContent">
                        <option value="${adContent.id}"><c:out value="${adContent.topic}" escapeXml="true"/></option>
                    </c:forEach>
                </select>
                <br>
                <a href="createContent" class="btn btn-primary">Новый контент</a>
                <br>
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="selQuiz">Выберите вопрос:</label>
                <select class="form-control" id="selQuiz">
                    <c:forEach items="${advertiser.quizzes}" var="quiz">
                        <option value="${quiz.id}"><c:out value="${quiz.questionText}" escapeXml="true"/></option>
                    </c:forEach>
                </select>
                <br>
                <a href="createQuiz" class="btn btn-primary">Новый вопрос</a>
                <br>
            </div>
        </div>


        <div>
            <div class="form-group">
                <label for="name">Дата начала:</label>
                <input type="text" class="form-control" id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Дата окончания:</label>
                <input type="text" class="form-control" id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Ограничение по полу:</label>
                <input type="checkbox" class="checkbox" id="name">
            </div>
        </div>

        <div class="form-group">
            <label for="sel4">Только для:</label>
            <select class="form-control " disabled id="sel4">
                <option class="active">Мужчин</option>
                <option>Женщин</option>
            </select>

        </div>

        <div>
            <div class="form-group">
                <label for="name">Ограничение по возрасту:</label>
                <input type="checkbox" class="checkbox" id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Возраст от:</label>
                <input type="text" class="form-control " disabled id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Возраст до:</label>
                <input type="text" class="form-control " disabled id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Кол-во показов:</label>
                <input type="number" class="form-control "  id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Кол-во показов одному человеку:</label>
                <input type="number" class="form-control "  id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Вознаграждение за просмотр:</label>
                <input type="text" class="form-control "  id="name">
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="name">Итоговая цена заказа:</label>
                <p>10,453.00 грн</p>
                <button class="btn btn-success">Сделать заказ</button>
            </div>
        </div>

    </div>


</div>
</body>
</html>
