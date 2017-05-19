<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Registration</title>
</head>
<body onload='document.f.username.focus();'>

<h1>Registration</h1>

<form name='f' th:action='@{/login}' method='POST'>
    <table>

        <tr><td>Name:</td>
            <td><label th:value="name">
                <input type='text' name='name'/>
            </label></td></tr>

        <tr><td>Email:</td><td>
            <label th:value="email">
                <input type='text' name='username' value=''/>
            </label></td></tr>

        <tr><td>Password:</td>
            <td><label th:value="password">
                <input type='password' name='password'/>
            </label></td></tr>

        <tr><td>Sex</td>
            <td><label th:value="sex">
                <input type='radio' name='sex' value="male"/>
                <input type='radio' name='sex' value="female"/>
            </label></td></tr>

        <tr><td>Age:</td>
            <td><label th:value="age">
                <input type='number' name='age'/>
            </label></td></tr>

        <tr><td colspan='2'>
            <input name="submit" type="submit" value="Register"/></td></tr>

    </table>
</form>

</body>
</html>

