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
        <tr><td>User:</td><td>
            <label th:value="Username">
                <input type='text' name='username' value=''/>
            </label></td></tr>
        <tr><td>Password:</td>
            <td><label th:value="Password">
                <input type='password' name='password'/>
            </label></td></tr>
        <tr><td colspan='2'>
            <input name="submit" type="submit" value="Login"/></td></tr>
        Listing 9.8 A custom login page for the Spittr application (as a Thymeleaf template)
        Submit to /login
        Authenticating users 269
    </table>
</form>

</body>
</html>

