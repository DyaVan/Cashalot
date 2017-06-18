<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ivan_Diachuk
  Date: 5/16/2017
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<%--${sessionScope.get("sesa")}--%>
a
<div>
    <sf:form modelAttribute="test" method="POST" enctype="multipart/form-data" action="/cashalot/rest/upload">

        <sf:input path="str"/>
        <sf:input path="strings"/>
        <sf:input path="strings"/>
        <sf:input path="strings"/>

        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}" />
        <table>
            <tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
            <tr><td></td><td><input type="submit" value="Upload" /></td></tr>
        </table>
    </sf:form>
</div>


</body>
</html>