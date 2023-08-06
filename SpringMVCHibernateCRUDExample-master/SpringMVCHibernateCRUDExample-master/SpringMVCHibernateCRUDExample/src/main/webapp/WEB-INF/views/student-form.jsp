<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <h2>Student Form</h2>
    <form action="<c:url value='/students/saveStudent' />" method="post">
        <input type="hidden" name="studentId" value="${student.studentId}" />
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" value="${student.firstName}" /><br>
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" value="${student.lastName}" /><br>
        <label for="course">Course:</label>
        <input type="text" name="course" value="${student.course}" /><br>
        <label for="country">Country:</label>
        <input type="text" name="country" value="${student.country}" /><br>
        <input type="submit" value="Save" />
    </form>
    <br>
    <a href="<c:url value='/students/list' />">Back to List</a>
</body>
</html>
