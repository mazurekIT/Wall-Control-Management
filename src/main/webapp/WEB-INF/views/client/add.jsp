<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Add Client</title>

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
        <div class="card-header">Add Client</div>
        <div class="card-body">
            <form:form method="post">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="firstName" name="firstName" class="form-control" placeholder="FirstName"
                                       required="required" autofocus="autofocus">
                                <label for="firstName">First Name</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-label-group">
                                <input type="text" id="lastName" name="lastName" class="form-control" placeholder="LastName"
                                       required="required" autofocus="autofocus">
                                <label for="lastName">Last Name</label>
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
                                <input type="text" id="phone" name="phone" class="form-control" placeholder="Phone"
                                       required="required" autofocus="autofocus">
                                <label for="phone">Phone</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="birthDate" name="birthDate" class="form-control" placeholder="dd-mm-rrrr"
                               required="required" autofocus="autofocus">
                        <label for="birthDate">Birth Date</label>
                    </div>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="kid" value="true" id="defaultCheck1">
                    <label class="form-check-label" for="defaultCheck1">
                        Kid
                    </label>
                </div>
                <input type="submit" class="btn btn-primary btn-block" value="Save"/>
                <div class="col-md-6">
                    <div class="form-label-group">
                        <form:errors path="*"/>
                        <%--<form:errors path="firstName"/>--%>
                        <%--<form:errors path="username"/>--%>
                        <%--<form:errors path="password"/>--%>
                        <%--<form:errors path="confirm_password"/>--%>
                    </div>
                </div>
            </form:form>


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
