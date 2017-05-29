<%--
  Created by IntelliJ IDEA.
  User: rzzayed
  Date: 5/23/17
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<link rel="stylesheet" href="login.css">
<div class="login">
  <c:if test="${requestScope.errors != null}">
    <p id="errors">
      Error(s)!
    <ul>
      <c:forEach var="error" items="${requestScope.errors}">
        <li>${error}</li>
      </c:forEach>
    </ul>
    </p>
  </c:if>
  <div class="login-triangle"></div>

  <h2 class="login-header">Log in</h2>

  <form class="login-container" action = "login.action" method="post">
    <p><input type="text" name="username" placeholder="username"></p>
    <p><input type="password" name="password" placeholder="Password"></p>
    <p><input type="submit" value="Log in"></p>
  </form>
</div>
</html>
