<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
        <a href="newOrder" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            К созданию заказа
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <h2>Новый продукт</h2>
        <sf:form modelAttribute="subject" method="post" action="createSubject" htmlEscape="true">
            <div>
                <div class="form-group">
                    <label for="name">Название:</label>
                    <sf:input type="text" class="form-control" id="name" path="name"/>
                </div>
                <sf:errors path="name"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="link">Ссылка в интернете:</label>
                    <sf:input type="text" class="form-control" id="link" path="webLink"/>
                </div>
                <sf:errors path="webLink"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="productInfo">Описание:</label>
                    <sf:textarea class="form-control" rows="7" id="productInfo" path="productInfo"/>
                </div>
                <sf:errors path="productInfo"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="sel3"> Выберите категорию:</label>
                    <sf:select class="form-control" id="sel3" path="categoryId">
                        <c:forEach items="${categories}" var="category">
                            <option value="${category.id}"><c:out value="${category.name}" escapeXml="true"/></option>
                        </c:forEach>
                    </sf:select>
                </div>
                <sf:errors path="categoryId"/>
            </div>

            <input type="submit" class="btn btn-success" value="Добавить продукт"/>
        </sf:form>
    </div>


</div>
</body>
</html>
