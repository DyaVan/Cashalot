<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

        <h2>${order.content.topic}</h2>

        Дата начала:
        <div>
            <p><fmt:formatDate pattern = "yyyy-MM-dd"
                               value = "${order.startDate}" /></p>
        </div>
        Дата окончания:
        <div>
            <p><fmt:formatDate pattern = "yyyy-MM-dd"
                               value = "${order.endDate}" /></p>
        </div>
        Ограничение по полу:
        <div>
            <c:choose>
                <c:when test="${order.sexLimited}">
                    <c:choose>
                        <c:when test="${order.sex}">

                            Только мужчины

                        </c:when>
                        <c:otherwise>
                            Только женщины
                        </c:otherwise>
                    </c:choose>


                </c:when>
                <c:otherwise>
                    Нету
                </c:otherwise>
            </c:choose>

        </div>
        Ограничение по возрасту:
        <div>
            <c:choose>
                <c:when test="${order.ageLimited}">
                    <p>От <c:out value="${order.minAge}"/> до <c:out value="${order.maxAge}"/></p>
                </c:when>
                <c:otherwise>
                    Нету
                </c:otherwise>
            </c:choose>


        </div>
        Оплачено показов:
        <div>
            <p>${order.totalViews}</p>
        </div>


        <div >
            <p>Вопрос:</p>
            <p>${order.quiz.questionText}</p>
            <table class="table ">
                <thead>
                <tr>
                    <th>Варианты ответа:</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${order.quiz.decoupledAnswerOptions}" var="option">
                    <tr>
                        <td>${option}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <p>Правильный ответ:</p>
            <p>${order.quiz.answer}</p>

        </div>
        <br>
        Продукт:
        <div>
            <p>${order.subject.name}</p>
        </div>

        Ссылка в интернете:
        <div>
            <p>${order.subject.webLink}</p>
        </div>

        Описание:
        <div>
            <p>${order.subject.productInfo}</p>
        </div>

        Категория:
        <div>
            <p>${order.subject.category.name}</p>
        </div>

        <br>
        <div>
            <p>Медиа:</p>
            <div>
                <img src="/media/${order.content.id}.jpg">
            </div>
        </div>
        <br>
        Текст перед медиа:
        <div>
            <p>${order.content.beforeText}</p>
        </div>
        <br>
        Текст после медиа:
        <div>
            <p>${order.content.afterText}</p>
        </div>

        <br>

        <sf:form action="affirm/${order.id}" method="post">
            <input type="submit" class="btn btn-success" value="Утвердить заказ"/>
        </sf:form>

        <button class="btn btn-danger" data-toggle="collapse" data-target="#demo2">Отклонить</button>

        <sf:form modelAttribute="dto" method="post" action="reject/${order.id}" >
            <div id="demo2" class="collapse">
                <div class="form-group">
                    <label for="question">Причина отказа:</label>
                    <sf:textarea class="form-control" rows="5" id="question" path="rejectionComment"/>
                    <input type="submit" class="btn btn-danger" value="Отклонить"/>
                </div>
            </div>
        </sf:form>

    </div>

</div>

</body>
</html>

</body>
</html>
