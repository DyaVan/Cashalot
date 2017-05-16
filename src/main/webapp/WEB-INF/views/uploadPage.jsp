<%--
  Created by IntelliJ IDEA.
  User: Ivan_Diachuk
  Date: 5/16/2017
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<html xmlns:th="http://www.thymeleaf.org">
<body>

<div>
    <form method="POST" enctype="multipart/form-data" action="/CashalotRest/upload">
        <table>
            <tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
            <tr><td></td><td><input type="submit" value="Upload" /></td></tr>
        </table>
    </form>
</div>


</body>
</html>