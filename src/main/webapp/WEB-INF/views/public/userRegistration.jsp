<<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <a href="home" class="btn btn-primary">
            <span class="glyphicon glyphicon-arrow-left"></span>
            На домашнюю страницу
        </a>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7">

        <form>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input id="email" type="text" class="form-control" name="email" placeholder="Email">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <input id="password" type="password" class="form-control" name="password" placeholder="Password">
            </div>

            <br>
            <div class="input-group">
                <span class="input-group-addon">Пол</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Возраст</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon">Город</span>
                <input id="msg" type="text" class="form-control" name="msg" placeholder="Additional Info">
            </div>

            <br>
            <div>
                <p>Выберете интересные для себя темы.</p>

                <table class="table">
                    <thead>
                    <tr>
                        <th>Интересы:</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Спорт</td>
                        <td><button class="btn btn-danger">Удалить</button></td>
                    </tr>
                    <tr>
                        <td>Развлечения</td>
                        <td><button class="btn btn-danger">Удалить</button></td>
                    </tr>

                    </tbody>
                </table>

                <div>
                    <div class="form-group">
                        <label for="sel1">Еще интересные темы:</label>
                        <select class="form-control" id="sel1">
                            <option>Спорт</option>
                            <option>Развлечения</option>
                            <option>Наука</option>
                            <option>Армейское дело</option>
                            <option>Политика</option>
                            <option>Финансы</option>
                        </select>
                        <br>
                        <button class="btn btn-info">Добавить интерес</button>
                        <br>
                    </div>
                </div>


            </div>



        </form>

        <button class="btn btn-success">Регистрация</button>
    </div>


</div>
</body>
</html>

