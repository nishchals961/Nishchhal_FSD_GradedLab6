<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>Student ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Course</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.firstName}</td>
                <td>${student.lastName}</td>
                <td>${student.course}</td>
                <td>${student.country}</td>
                <td>
                    <a href="<c:url value='/students/showFormForUpdate?studentId=' + student.studentId />">Edit</a>
                    <a href="<c:url value='/students/delete?studentId=' + student.studentId />" onclick="return confirm('Are you sure you want to delete this student?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="<c:url value='/students/showFormForAdd' />">Add Student</a>
</body>
</html>
