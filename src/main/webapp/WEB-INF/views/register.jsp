<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Add User</title>

    <!-- Bootstrap core CSS-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="/resources/css/sb-admin.css" rel="stylesheet">

</head>

<body class="bg-dark">

<div class="container">
    <div class="card card-register mx-auto mt-5">
        <div class="card-header">Register an Account</div>
        <div class="card-body">
            <form:form method="post">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="firstName" name="firstName" class="form-control"
                                       placeholder="First name" required="required" autofocus="autofocus">
                                <label for="firstName">First Name</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="lastName" name="lastName" class="form-control"
                                       placeholder="Last name" required="required" autofocus="autofocus">
                                <label for="lastName">Last Name</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="username" name="username" class="form-control"
                                       placeholder="Username" required="required">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="phone" name="phone" class="form-control" placeholder="Phone"
                                       required="required" autofocus="autofocus">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="email" name="email" class="form-control" placeholder="Email"
                                       required="required" autofocus="autofocus">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="salary" name="salary" class="form-control" placeholder="Salary"
                                       required="required" autofocus="autofocus">
                                <label for="salary">Salary</label>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="address" name="address" class="form-control" placeholder="Address"
                               required="required" autofocus="autofocus">
                        <label for="address">Address</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="description" name="description" class="form-control"
                               placeholder="Description" required="required" autofocus="autofocus">
                        <label for="description">Description</label>
                    </div>
                </div>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="password" id="password" name="password" class="form-control"
                                       placeholder="Password" required="required">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="password" id="confirmPassword" name="confirm_password" class="form-control"
                                       placeholder="Confirm password" required="required">
                                <label for="confirmPassword">Confirm password</label>
                            </div>
                        </div>
                    </div>
                </div>

                <input type="submit" class="btn btn-primary btn-block" value="Register"/>
                <div class="col-md-6">
                    <div class="form-label-group">
                        <form:errors path="*"/>
                        <%--<form:errors path="username"/>--%>
                        <%--<form:errors path="password"/>--%>
                        <%--<form:errors path="confirm_password"/>--%>
                    </div>
                </div>
            </form:form>

            <div class="text-center">
                <a class="d-block small mt-3" href="/login">Login Page</a>
                <%--<a class="d-block small" href="/forgot-password">Forgot Password?</a>--%>  <!--TODO-->
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/resources/vendor/jquery/jquery.min.js"></script>
<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

</body>

</html>
