<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>

    .panel-default {
        opacity: 0.75;
    }
    .form-group.last { margin-bottom:0px; }


</style>

<div class="container-fluid">
    <div class="row">
        <!-- <div class="col-md-4 col-md-offset-3"> -->
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login</div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" ACTION="j_security_check" METHOD="POST">
                        <div class="form-group">
                            <label for="inputUsername" class="col-sm-3 control-label">
                                Username</label>
                            <div class="col-sm-9">
                                <input type="text" name="j_username" id="inputUsername" class="form-control" placeholder="username" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword" class="col-sm-3 control-label">
                                Password</label>
                            <div class="col-sm-9">
                                <input type="password" name="j_password" id="inputPassword" class="form-control" placeholder="Password" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"/>
                                        Remember me
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-success btn-sm">
                                    Sign in</button>
                                <button type="reset" class="btn btn-default btn-sm">
                                    Reset</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer">
                    Or <a href="new-account.jsp">create a new account</a>
                </div>
            </div>
        </div>
    </div>
