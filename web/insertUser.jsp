<%--
  Created by IntelliJ IDEA.
  User: rzzayed
  Date: 5/29/17
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<h1 align="center">Insert New User</h1><br>
<body>
<form class="form-horizontal">
    <fieldset>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="fn">Name</label>
            <div class="col-md-4">
                <input id="name" name="name" type="text" placeholder="Username" class="form-control input-md" required style = "margin-bottom: 15px">

            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label" for="fn">Username</label>
            <div class="col-md-4">
                <input id="fn" name="Username" type="text" placeholder="Username" class="form-control input-md" required style = "margin-bottom: 15px">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="password">password</label>
            <div class="col-md-4">
                <input id="password" name="password" type="password" placeholder="password" class="form-control input-md" required="">

            </div>
        </div>

        <!-- Select Basic -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="selectbasic">Select User Type</label>
            <div class="col-md-4">
                <select id="selectbasic" name="User Type" class="form-control input-md">
                    <option>Admin</option>
                    <option>Student</option>
                    <option>Teacher</option>
                </select>
            </div>
        </div>



        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="submit"></label>
            <div class="col-md-4">
                <button id="submit" formmethod="post" formaction="insertUser" name="submit" class="btn btn-primary">SUBMIT</button>
            </div>
        </div>

    </fieldset>
</form>
</body>
</html>
