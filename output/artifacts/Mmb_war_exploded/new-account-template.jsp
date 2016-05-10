<style>

    .panel-default {
        opacity: 0.9;
    }
    .form-group.last { margin-bottom:0px; }


</style>

<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                <span class="glyphicon glyphicon-user"></span> New Account</div>
            <div class="panel-body">
                <form class="form-horizontal" role="form" ACTION="signup" METHOD="POST">
                    <div class="form-group">
                        <!-- inputUsername -->
                        <label for="inputUsername" class="col-sm-3 control-label">
                            Email Address</label>
                        <div class="col-sm-9">
                            <input type="text" name="inputUsername" id="inputUsername" class="form-control" placeholder="user@email.com" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <!-- inputFirstname -->
                        <label for="inputFirstname" class="col-sm-3 control-label">
                            First name</label>
                        <div class="col-sm-9">
                            <input type="text" name="inputFirstname" id="inputFirstname" class="form-control" placeholder="" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <!-- inputLastname -->
                        <label for="inputLastname" class="col-sm-3 control-label">
                            Last name</label>
                        <div class="col-sm-9">
                            <input type="text" name="inputLastname" id="inputLastname" class="form-control" placeholder="">
                        </div>
                    </div>
                    <div class="form-group">
                        <!-- inputPassword -->
                        <label for="inputPassword" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="password" name="inputPassword" id="inputPassword" class="form-control" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            Please enter your password again
                        </div>
                    </div>
                    <div class="form-group">
                        <!-- inputPassword2 -->
                        <label for="inputPassword2" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="password" name="inputPassword2" id="inputPassword2" class="form-control" placeholder="Password" required>
                        </div>
                    </div>

                    <div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-9">
                            <button type="submit" class="btn btn-success btn-sm">
                                Create Account</button>
                            <button type="reset" class="btn btn-default btn-sm">
                                Reset</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="panel-footer">
                Already have an account? <a href="restricted/login-user.jsp">Log in</a>
            </div>
        </div>
    </div>
</div>

