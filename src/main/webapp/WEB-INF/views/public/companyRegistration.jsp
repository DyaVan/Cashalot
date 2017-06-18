<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
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

        <a href="/cashalot/" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            На домашнюю страницу
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">
        <br>
        <br>
        <br>

        <sf:form modelAttribute="advertiser" htmlEscape="true"
                 action="register" method="post"  accept-charset="UTF-8">

            <div class="input-group">
                <span class="input-group-addon">Название</span>
                <sf:input id="name" type="text" class="form-control" placeholder="Company Name" path="name"/>
            </div>
            <sf:errors path="name"/>
            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <sf:input id="emailLogin" type="text" class="form-control" path="emailLogin" placeholder="Login Email"/>
            </div>
            <sf:errors path="emailLogin"/>
            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <sf:input id="password" type="password" class="form-control" path="password" placeholder="Password"/>
            </div>
            <sf:errors path="password"/>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Контактный имейл</span>
                <sf:input id="emailContact" type="text" class="form-control" path="emailContact"
                       placeholder="Contact Email"/>
            </div>
            <sf:errors path="emailContact"/>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Сайт компании</span>
                <sf:input id="webLink" type="text" class="form-control" path="webLink" placeholder="Web link"/>
            </div>
            <sf:errors path="webLink"/>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Контактный телефон</span>
                <sf:input id="telephone" type="text" class="form-control" path="telephone" placeholder="Telephone"/>
            </div>
            <sf:errors path="telephone"/>
            <br>
            <div>
                <div class="form-group">
                    <label for="notACompany">Частное лицо</label>
                    <sf:checkbox class="checkbox" id="notACompany" path="notACompany"/>
                </div>
                <sf:errors path="notACompany"/>
            </div>
            <br>
            <div>
                <div class="form-group">
                    <label for="additionalInfo">Дополнительная информация</label>
                    <sf:textarea class="form-control" rows="5" id="additionalInfo" path="additionalInfo"
                              placeholder="Additional info"/>
                </div>
                <sf:errors path="additionalInfo"/>
            </div>


            <input type="submit" class="btn btn-success" value="Регистрация"/>
        </sf:form>

    </div>


</div>
</body>
</html>

