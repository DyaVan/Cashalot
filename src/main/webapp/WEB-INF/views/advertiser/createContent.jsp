<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Content</title>
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
        <h2>Создание контента</h2>

        <sf:form modelAttribute="content" enctype="multipart/form-data" method="post" htmlEscape="true" action="createContent">

            <div>
                <div class="form-group">
                    <label for="topic">Тема:</label>
                    <sf:input type="text" class="form-control" id="topic" path="topic"/>
                </div>
                <sf:errors path="topic"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="sel3"> Выберите тип медиа файла:</label>
                    <sf:select class="form-control" id="sel3" path="contentType">
                        <option value="video">Видео</option>
                        <option value="image">Изображение</option>
                    </sf:select>
                </div>
                <sf:errors path="contentType"/>
            </div>
            <br>
            <div>
                <div class="form-group">
                    <label for="mediaFile">Загрузите медиа файл:</label>
                    <sf:input type="file" class="btn btn-default" id="mediaFile" path="mediaFile"/>
                </div>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQc3nOX9OFMpYjmi68pqfln1OSgCMAU0xbTJBdMaPISCZHnTgeJGA">
            </div>
            <sf:errors path="mediaFile"/>

            <div>
                <div class="form-group">
                    <label for="beforeText">Текст перед медиа:</label>
                    <sf:textarea class="form-control" rows="5" id="beforeText" path="beforeText"/>
                </div>
                <sf:errors path="beforeText"/>
            </div>

            <div>
                <div class="form-group">
                    <label for="afterText">Текст после медиа:</label>
                    <sf:textarea class="form-control" rows="5" id="afterText" path="afterText"/>
                </div>
                <sf:errors path="afterText"/>
            </div>

            <input type="submit" class="btn btn-success" value="Добавить контент"/>
            
        </sf:form>
    </div>


</div>
</body>
</html>
