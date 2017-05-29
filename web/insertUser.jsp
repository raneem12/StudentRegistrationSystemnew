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
            <label class="col-md-4 control-label" for="fn">First name</label>
            <div class="col-md-4">
                <input id="fn" name="fn" type="text" placeholder="first name" class="form-control input-md" required style = "margin-bottom: 15px">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="ln">Last name</label>
            <div class="col-md-4">
                <input id="ln" name="ln" type="text" placeholder="last name" class="form-control input-md" required="">

            </div>
        </div>


        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="email">Email</label>
            <div class="col-md-4">
                <input id="email" name="email" type="text" placeholder="email" class="form-control input-md" required="">

            </div>
        </div>


        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="city">City</label>
            <div class="col-md-4">
                <input id="city" name="city" type="text" placeholder="city" class="form-control input-md" required="">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="zip">Zip Code</label>
            <div class="col-md-4">
                <input id="zip" name="zip" type="text" placeholder="Zip Code" class="form-control input-md" required="">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="ctry">Country</label>
            <div class="col-md-4">
                <input id="ctry" name="ctry" type="text" placeholder="Country" class="form-control input-md" required="">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="phone">Text InputPhone</label>
            <div class="col-md-4">
                <input id="phone" name="phone" type="text" placeholder="Phone#" class="form-control input-md" required="">

            </div>
        </div>




        <!-- Select Basic -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="selectbasic">Select Basic</label>
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
                <button id="submit" name="submit" class="btn btn-primary">SUBMIT</button>
            </div>
        </div>

    </fieldset>
</form>
</body>
</html>
