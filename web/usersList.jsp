
<html>
<link rel="stylesheet" href="InsertUser.css">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Users</title>
</head>
<body>

<%@ page import="model.Entities.User" %>
<%@ page import="java.util.List" %>
<%@ page import="model.DAO.UsersDAO" %>

<h1>Users List</h1>

    <table border="1" width="90%">
        <tr><th>Id</th><th>UserName</th><th>Password</th><th>User Type</th>
        <c:forEach items="${list}" var="u">
            <tr>

            </tr>
        </c:forEach>
    </table>
    <br/><a href="insertUser.jsp">Add New User</a>

</body>
</html>