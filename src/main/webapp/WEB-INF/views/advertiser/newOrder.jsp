<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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

        <sf:form modelAttribute="order" method="post" htmlEscape="true" action="/cashalot/advertiser/newOrder">

            <div class="form-group">
                <label for="selSubj"> Виберите продукт:</label>
                <sf:select class="form-control" id="selSubj" path="subjectId">
                    <c:forEach items="${advertiser.subjects}" var="subject">
                        <option value="${subject.id}"><c:out value="${subject.name}" escapeXml="true"/></option>
                    </c:forEach>
                </sf:select>
                <br>
                <sf:errors path="subjectId"/>
                <br>
                <a href="createSubject" class="btn btn-primary">Новый продукт</a>
                <br>
            </div>

            <div>
                <div class="form-group">
                    <label for="selContents">Выберите контент:</label>
                    <sf:select class="form-control" id="selContents" path="contentId">
                        <c:forEach items="${advertiser.adContents}" var="adContent">
                            <option value="${adContent.id}"><c:out value="${adContent.topic}"
                                                                   escapeXml="true"/></option>
                        </c:forEach>
                    </sf:select>
                    <br>
                    <sf:errors path="contentId"/>
                    <br>
                    <a href="createContent" class="btn btn-primary">Новый контент</a>
                    <br>
                </div>
            </div>

            <div>
                <div class="form-group">
                    <label for="selQuiz">Выберите вопрос:</label>
                    <sf:select class="form-control" id="selQuiz" path="quizId">
                        <c:forEach items="${advertiser.quizzes}" var="quiz">
                            <option value="${quiz.id}"><c:out value="${quiz.questionText}" escapeXml="true"/></option>
                        </c:forEach>
                    </sf:select>
                    <br>
                    <sf:errors path="quizId"/>
                    <br>
                    <a href="createQuiz" class="btn btn-primary">Новый вопрос</a>
                    <br>
                </div>
            </div>


            <div>
                <div class="form-group">
                    <label for="name">Дата начала:</label>
                    <sf:input type="text" class="form-control" id="name" placeholder="dd/MM/yyyy" path="startDate"/>
                </div>
                <sf:errors path="startDate"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="name">Дата окончания:</label>
                    <sf:input type="text" class="form-control" id="name" placeholder="dd/MM/yyyy" path="endDate"/>
                </div>
                <sf:errors path="endDate"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="sexLimited">Ограничение по полу:</label>
                    <sf:checkbox  class="checkbox" id="sexLimited" path="sexLimited"/>
                </div>
                <sf:errors path="sexLimited"/>
            </div>

            <div class="form-group">
                <label for="sel4">Только для:</label>
                <sf:select class="form-control " id="sel4" path="sex">
                    <option value="true" class="active">Мужчин</option>
                    <option value="false">Женщин</option>
                </sf:select>
                <sf:errors path="sex"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="name">Ограничение по возрасту:</label>
                    <sf:checkbox class="checkbox" id="sexLimited" path="ageLimited"/>
                </div>
                <sf:errors path="ageLimited"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="minAge">Возраст от:</label>
                    <sf:input type="text" class="form-control " id="minAge" path="minAge"/>
                </div>
                <sf:errors path="maxAge"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="maxAge">Возраст до:</label>
                    <sf:input type="text" class="form-control " id="maxAge" path="maxAge"/>
                </div>
                <sf:errors path="maxAge"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="totalViews">Кол-во показов:</label>
                    <sf:input type="text" class="form-control" id="totalViews" path="totalViews"/>
                </div>
                <sf:errors path="totalViews"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="name">Кол-во показов одному человеку:</label>
                    <sf:input type="text" class="form-control " id="maxAge" path="viewsPerUser"/>
                </div>
                <sf:errors path="viewsPerUser"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="name">Вознаграждение за просмотр:</label>
                    <sf:input type="text" class="form-control " id="maxAge" path="cost"/>
                </div>
                <sf:errors path="cost"/>
            </div>

            <div>
                <div class="form-group">
                        <%--<label for="name">Итоговая цена заказа:</label>--%>
                        <%--<p>10,453.00 грн</p>--%>
                    <input type="submit" class="btn btn-success" value="Сделать заказ"/>
                </div>
            </div>

        </sf:form>
    </div>


</div>
</body>
</html>
