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

        <div>
            <div class="form-group">
                <label for="topic">Тема:</label>
                <input type="text" class="form-control" id="topic">
            </div>
        </div>

        <div class="form-group">
            <label for="sel2"> Виберите продукт:</label>
            <select class="form-control" id="sel2">
                <option>Пшеничное пиво</option>
                <option>Бухло</option>
                <option>Темное кравтовое пиво</option>
                <option>Пятничные скидки</option>
                <option>Праздник 23 Июня!</option>
            </select>
            <br>
            <a href="createSubject" class="btn btn-primary">Новый продукт</a>
            <br>
        </div>

        <div>
            <div class="form-group">
                <label for="sel1">Выберите вопрос:</label>
                <select class="form-control" id="sel1">
                    <option>Какое на вкус пшеничное пиво?</option>
                    <option>Какое новое пиво появилось в Пивной Думе?</option>
                    <option>Когда бухичь?</option>
                    <option>В честь чего устроен праздник в Пивной думе?</option>
                    <option>Что привлекает в Думу людей по пятницам?</option>
                </select>
                <br>
                <a href="createQuiz" class="btn btn-primary">Новый вопрос</a>
                <br>
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="sel3"> Выберите тип медиа файла:</label>
                <select class="form-control" id="sel3">
                    <option>Видео</option>
                    <option>Изображение</option>
                </select>
            </div>
        </div>
        Загрузите медиа файл:
        <div>
            <input type="file" class="btn btn-default" value="ссілки.txt">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQc3nOX9OFMpYjmi68pqfln1OSgCMAU0xbTJBdMaPISCZHnTgeJGA">
        </div>

        <div>
            <div class="form-group">
                <label for="beforeText">Текст перед медиа:</label>
                <textarea class="form-control" rows="5" id="beforeText"></textarea>
            </div>
        </div>

        <div>
            <div class="form-group">
                <label for="afterText">Текст после медиа:</label>
                <textarea class="form-control" rows="5" id="afterText"></textarea>
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
