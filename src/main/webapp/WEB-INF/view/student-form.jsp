<%--
  Created by IntelliJ IDEA.
  User: Huynh Thi Man Uyen
  Date: 10/25/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processStudentForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    Favorite Sport:
    Soccer <form:radiobutton path="favoriteSport" value="Soccer"/>
    E-Sport <form:radiobutton path="favoriteSport" value="E-Sport"/>
    <br><br>
    Programming Language:
    C# <form:checkbox path="programmingLanguage" value="C#"/>
    Java <form:checkbox path="programmingLanguage" value="Java"/>
    Javascript <form:checkbox path="programmingLanguage" value="Javascript"/>
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
