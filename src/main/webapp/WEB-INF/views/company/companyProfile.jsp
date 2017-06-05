<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Company Profile</title>
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
        <h2>Пивная Дума</h2>

        <div class="panel panel-info">
            <div class="panel-heading">Название:</div>
            <div class="panel-body">
                <div class="col-md-10">Пивная Дума</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Имейл авторизации:</div>
            <div class="panel-body">
                <div class="col-md-10">pivo.duma@gmail.com</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Контактный имейл</div>
            <div class="panel-body">
                <div class="col-md-10">pivo.duma@gmail.com</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Сайт компании:</div>
            <div class="panel-body">
                <div class="col-md-10">pivnaduma.kiev.ua</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Контактный телефон:</div>
            <div class="panel-body">
                <div class="col-md-10">044 383 78 00</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">Дополнительная информация:</div>
            <div class="panel-body">
                <div class="col-md-10">Мы – это:
                    Самая большая крафтовая пивоварня в Украине. Всегда свежее светлое, пшеничное или темное пиво,
                    сваренное для вас. У нас варят классические сорта пива по авторской рецептуре под руководством
                    уважаемого, а главное, знающего пивовара Сергея Гойко.</div>
                <div class="col-md-2"><button class="btn btn-success">Изменить</button></div>
            </div>
        </div>


    </div>

</div>

</body>
</html>

</body>
</html>
