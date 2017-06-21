<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>New Content</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div>
    <sf:form modelAttribute="test" method="POST"
             enctype="multipart/form-data" action="/cashalot/rest/upload">

        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>


        <sf:input path="str"/>
        <sf:input path="strings"/>
        <sf:input path="strings"/>

        <sf:input type="text"  path="startDate"  placeholder="dd/MM/yyyy"/>
        <sf:errors path="startDate"/>

        <br>
        File to upload:
        <br>
        <sf:input type="file" path="file"/>
        <sf:errors path="file"/>

        <input type="submit" value="Upload"/>

    </sf:form>
</div>


</body>
</html>