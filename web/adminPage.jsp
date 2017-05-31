<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Entities.User" %>
<%@ page import="java.util.ArrayList" %>


<%--
  Created by IntelliJ IDEA.
  User: rzzayed
  Date: 5/29/17
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand">Administrator</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="listusers" >Users</a></li>
            <li><a href="listcourses">Courses</a></li>
            <li><a href="#">Teachers</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <h1>
        <% User user = (User) session.getAttribute("currentSessionUser");
        out.print("Welcome " + user.getUsername() );%>
    </h1>
</div>
<div style="width: 50%; margin: 0 auto; ">
    <c:choose>
        <c:when test="${action == 'listcourses'}">
            <table border="1" width="90%" class="table">
                <tr>
                    <th>Id</th>
                    <th>Course Id</th>
                    <th>Password</th>
                    <th>User Type</th>
                    <c:forEach items="${courses}" var="u">
                <tr>
                <td>${u.courseID}</td>
                <td>${u.courseName}</td>
            </tr>
                </c:forEach>
            </table>
            <br/><a href="insertUser.jsp">Add New Course</a>
        </c:when>
        <c:when test="${action == 'listusers'}">
            <table border="1" width="90%" class="table" >
                <tr><th>Id</th><th>UserName</th><th>Password</th><th>User Type</th>
                    <c:forEach items="${users}" var="u">
                <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.password}</td>
                <td>${u.userType}</td>
            </tr>
                </c:forEach>
            </table>
            <br/><a href="insertUser.jsp">Add New User</a>
        </c:when>
        <c:otherwise>
            <table border="1" width="90%" class="table" style="width: 50%; margin: 0 auto; ">
                <tr><th>Id</th><th>UserName</th><th>Password</th><th>User Type</th>
                    <c:forEach items="${users}" var="u">
                <tr>
                <td>${u.id}</td>
                <td>${u.username}</td>
                <td>${u.password}</td>
                <td>${u.userType}</td>
            </tr>
                </c:forEach>
            </table>
            <br/><a href="insertUser.jsp">Add New User</a>
        </c:otherwise>
    </c:choose>
</div>

</body>
</html>
