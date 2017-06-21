<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bonuses</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">

    <script src="../../../js/jquery-3.1.1.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-md-2">
        <c:import url="sideMenu.jsp"/>
    </div>

    <div class="col-md-1">

    </div>

    <div class="col-md-7 list-group ">
        <br>

        <button class="btn btn-success">Пакет 1</button>
        <button class="btn btn-success">Пакет 2</button>
        <button class="btn btn-primary">Пакет 3</button>
        <button class="btn btn-info">Пакет 4</button>
        <button class="btn btn-info">Пакет 5</button>
        <button class="btn btn-info">Пакет 6</button>
        <button class="btn btn-info">Пакет 7</button>

        <br>
        <h3>Это рекалама номер 2 из пакета</h3>
        <br>

        <p id="topic">Депозиты от Приват Банка</p>

        <p>Выгодные депозиты в крупнейшем банке Украины</p>


        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQsVCt70R2M_2Xq7bDVlcoJFjufnIqJZ0n7dL_cH00mvTIWi36">


        <p>Лучшая ставка по депозитам</p>

        <sf:form modelAttribute="answerDTO" method="POST"
                 enctype="multipart/form-data" action="/cashalot/user/watch/answer">

        <p>Какая депозитная ставка на гривневые вклады в Приват Банке?</p>
            <div class="questions">

                <div class="variants question hidden">
                    <div class="radio">
                        <label><sf:radiobutton name="optradio" path="answer" value="16,3"/>16,3</label>
                    </div>
                    <div class="radio">
                        <label><sf:radiobutton name="optradio" path="answer" value="5"/>5</label>
                    </div>
                    <div class="radio ">
                        <label><sf:radiobutton name="optradio" path="answer" value="3"/>3</label>
                    </div>
                </div>
                <div class="emotion question hidden">
                    <!--
                     <button id="snap">Snap Photo</button>
                     <canvas id="canvas" width="640" height="480"></canvas> -->
                    <video id="video" width="640" class="hidden" height="480" autoplay></video>
                    <sf:input type="text" path="photo1" value=""/>
                    <sf:input type="text" path="photo2" value=""/>
                    <sf:input type="text" path="photo3" value=""/>
                    <sf:input type="text" path="photo4" value=""/>
                    <sf:input type="text" path="photo5" value=""/>

                </div>

                <div>
                    <button class="btn btn-success" name="answer" type="submit" disabled >Ответить</button>

                    <ul class="pager">
                        <li><a href="#">Предыдущая реклама</a></li>
                        <li><a href="#">Следующая реклама</a></li>
                    </ul>

                    <button class="btn btn-danger" disabled>Оправить пакет на проверку</button>
                </div>
            </div>
        </sf:form>
    </div>
</div>
</body>
</html>
<script type="text/javascript">

    // Put event listeners into place
    window.addEventListener("DOMContentLoaded", function () {
        // Grab elements, create settings, etc.
        // var canvas = document.getElementById('canvas');
        // var context = canvas.getContext('2d');
        var video = document.getElementById('video');
        var mediaConfig = {video: true};
        var errorMedia = false;
        var currStream;
        var pictures = [];
        var btn = $('button[name="answer"]');
        var errBack = function (e) {
            errorMedia = true;
            console.log('An error has occurred!', e)
        };
        var getPictures = function (stream) {
            if (stream !== undefined && stream.getVideoTracks().length > 0) {
                var canvas = document.createElement('CANVAS');
                var ctx = canvas.getContext('2d');
                var dataURL;
                ctx.drawImage(video, 0, 0, 640, 480);
                var img = canvas.toDataURL();
                return img;
            }

        };



        // Put video listeners into place
        if (navigator.mediaDevices && navigator.mediaDevices.getUserMedia) {
            navigator.mediaDevices.getUserMedia(mediaConfig).then(function (stream) {
                currStream = stream;
                video.src = window.URL.createObjectURL(stream);
                video.play();
            }, errBack);
        }

        /* Legacy code below! */
        else if (navigator.getUserMedia) { // Standard
            navigator.getUserMedia(mediaConfig, function (stream) {
                currStream = stream;
                video.src = stream;
                video.play();
            }, errBack);
        } else if (navigator.webkitGetUserMedia) { // WebKit-prefixed
            navigator.webkitGetUserMedia(mediaConfig, function (stream) {
                currStream = stream;
                video.src = window.webkitURL.createObjectURL(stream);
                video.play();
            }, errBack);
        } else if (navigator.mozGetUserMedia) { // Mozilla-prefixed
            navigator.mozGetUserMedia(mediaConfig, function (stream) {
                currStream = stream;
                video.src = window.URL.createObjectURL(stream);
                video.play();
            }, errBack);
        }

        setTimeout(function () {
            $(".questions .variants.question input:radio").change(function () {
                if ($(this).closest('.variants.question').find('input:checked').length > 0 && (errorMedia || pictures.length > 0)) {
                    btn.prop('disabled', false);
                }
                else {
                    btn.prop('disabled', true);
                }
            });
            // $(".questions .emotion.question").removeClass('hidden');
            if (!errorMedia && currStream !== undefined && currStream.getVideoTracks().length > 0) {

                var count = 5;
                var snapshots = setInterval(function () {
                    var img = getPictures(currStream);
                    if (img !== undefined) {
                        pictures.push(img);
                        console.log(count, img[100])
                        $(".questions .emotion.question").find("input[name='photo" + count + "']").val(img.replace(/^data:image\/(png|jpg);base64,/, ""));
                    }
                    count--;
                    if (count < 1) {
                        clearInterval(snapshots);
                        $(".questions .variants.question input:radio").first().trigger('change');
                    }
                }, 1000);

            }
            $(".questions .variants.question").removeClass('hidden');


        }, 3000)

        // Trigger photo take
        // document.getElementById('snap').addEventListener('click', function() {
        //     context.drawImage(video, 0, 0, 640, 480);
        // });
    }, false);


</script>